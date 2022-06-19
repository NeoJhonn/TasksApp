package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Projeto;
import util.ConnectionFactory;

/**
 *
 * @author Neojhon
 */
public class ProjetoController {

    public void save(Projeto p) {
        //não precisa o campo ID, pois é a chave primária e é AutoIncrement
        String sql = "INSERT INTO projetos (nome, descricao, createdAt, "
                + "updatedAt)"
                + " VALUES (?, ?, ?, ?)";

        Connection c = null;
        PreparedStatement ps = null;
        //tratamento de exceções
        try {
            c = ConnectionFactory.getConnection();//conectar com o Banco
            ps = c.prepareStatement(sql);//prepara o comando sql que vai ser ultilizado no Banco de Dados
            ps.setString(1, p.getNome());
            ps.setString(2, p.getDescricao());
            ps.setDate(3, new Date(p.getCreatedAt().getTime()));//importar o Date do pacote do java.sql.date
            ps.setDate(4, new Date(p.getUpdatedAt().getTime()));//importar o Date do pacote do java.sql.date
            ps.execute();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar o Projeto "
                    + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(c, ps);//fecha a conexão com o Banco e o comando SQL
        }

    }

    public void update(Projeto p) {
        String sql = "UPDATE projetos SET "
                + "nome = ?, "
                + "descricao = ?, "
                + "createdAt = ?, "
                + "updatedAt = ? "
                + "WHERE ID = ?";

        Connection c = null;
        PreparedStatement ps = null;
        //Tratamento de exceções
        try {
            c = ConnectionFactory.getConnection();//conectar com o Banco
            ps = c.prepareStatement(sql);//prepara o comando sql que vai ser ultilizado no Banco de Dados
            ps.setString(1, p.getNome());
            ps.setString(2, p.getDescricao());
            ps.setDate(3, new Date(p.getCreatedAt().getTime()));//importar o Date do pacote do java.sql.date
            ps.setDate(4, new Date(p.getUpdatedAt().getTime()));//importar o Date do pacote do java.sql.date
            ps.setInt(5, p.getId());//vai atulizar a tarefa com esse id
            ps.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar o Projeto "
                    + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(c, ps);//fecha a conexão com o Banco e o comando SQL
        }

    }

    public void removeById(int id) {
        String sql = "DELETE FROM projetos WHERE ID = ?";

        Connection c = null;
        PreparedStatement ps = null;
        //tratamento de exceções
        try {
            c = ConnectionFactory.getConnection();//conectar com o Banco
            ps = c.prepareStatement(sql);//prepara o comando sql que vai ser ultilizado no Banco de Dados
            ps.setInt(1, id);//substitue o "?" do comando sql pelo id passado como parêmetro no método
            ps.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar o Projeto "
                    + e.getMessage(), e);
        } finally {//sempre vai ser execultado independe do tratamento da exceção 
            ConnectionFactory.closeConnection(c, ps);//fecha a conexão com o Banco e o comando SQL
        }
    }

    public List<Projeto> getAll() {
        String sql = "SELECT * FROM projetos";

        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;//Guardo o que teve de resposta quando faz o SELECT no banco de dados
        List<Projeto> listaProjetos = new ArrayList<>();//lista de tarefas
        //tratamento de exceções
        try {
            c = ConnectionFactory.getConnection();//conectar com o Banco
            ps = c.prepareStatement(sql);//prepara o comando sql que vai ser ultilizado no Banco de Dados
            rs = ps.executeQuery();//Guarda o que teve de resposta quando faz o SELECT no banco de dados

            while (rs.next()) {//enquanto houver um próximo na lista, fica no laço
                Projeto p = new Projeto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setDescricao(rs.getString("descricao"));
                p.setCreatedAt(rs.getDate("createdAt"));
                p.setUpdatedAt(rs.getDate("updatedAt"));

                listaProjetos.add(p);//adiciona a tarefa na lista de tarefas

            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar os Projetos "
                    + e.getMessage(), e);
        } finally {//sempre vai ser execultado independe do tratamento da exceção 
            ConnectionFactory.closeConnection(c, ps, rs);//fecha a conexão com o Banco,o comando SQL e o ResultSet
        }
        //restornou a lista de tarefas armazenas no ArrayList
        return listaProjetos;
    }
}
