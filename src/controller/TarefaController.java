package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Tarefa;
import util.ConnectionFactory;

/**
 *
 * @author Neojhon
 */
public class TarefaController {

    public void save(Tarefa t) {
        //não precisa o campo ID, pois é a chave primária e é AutoIncrement
        String sql = "INSERT INTO tarefas (idProjetos, nome, descricao,"
                + " completada, observacoes, prazo, "
                + "createdAt, updatedAt)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        Connection c = null;
        PreparedStatement ps = null;
        //tratamento de exceções
        try {
            c = ConnectionFactory.getConnection();//conectar com o Banco
            ps = c.prepareStatement(sql);//prepara o comando sql que vai ser ultilizado no Banco de Dados
            ps.setInt(1, t.getIdProjetos());//campo idProjetos e assim sucessivamente
            ps.setString(2, t.getNome());
            ps.setString(3, t.getDescricao());
            ps.setBoolean(4, t.ehCompletada());
            ps.setString(5, t.getObservacoes());
            ps.setDate(6, new Date(t.getPrazo().getTime()));//importar o Date do pacote do java.sql.date
            ps.setDate(7, new Date(t.getCreatedAt().getTime()));//importar o Date do pacote do java.sql.date
            ps.setDate(8, new Date(t.getUpdatedAt().getTime()));//importar o Date do pacote do java.sql.date
            ps.execute();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar a Tarefa "
                    + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(c, ps);//fecha a conexão com o Banco e o comando SQL
        }

    }

    public void update(Tarefa t) {
        String sql = "UPDATE tarefas SET "
                + "idProjetos = ?, "
                + "nome = ?, "
                + "descricao = ?, "
                + "completada = ?, "
                + "observacoes = ?, "
                + "prazo = ?, "
                + "createdAt = ?, "
                + "updatedAt = ? "
                + "WHERE ID = ?";

        Connection c = null;
        PreparedStatement ps = null;
        //Tratamento de exceções
        try {
            c = ConnectionFactory.getConnection();//conectar com o Banco
            ps = c.prepareStatement(sql);//prepara o comando sql que vai ser ultilizado no Banco de Dados
            ps.setInt(1, t.getIdProjetos());
            ps.setString(2, t.getNome());
            ps.setString(3, t.getDescricao());
            ps.setBoolean(4, t.ehCompletada());
            ps.setString(5, t.getObservacoes());
            ps.setDate(6, new Date(t.getPrazo().getTime()));//importar o Date do pacote do java.sql.date
            ps.setDate(7, new Date(t.getCreatedAt().getTime()));//importar o Date do pacote do java.sql.date
            ps.setDate(8, new Date(t.getUpdatedAt().getTime()));//importar o Date do pacote do java.sql.date
            ps.setInt(9, t.getId());//vai atulizar a tarefa com esse id
            ps.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar a Tarefa "
                    + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(c, ps);//fecha a conexão com o Banco e o comando SQL
        }

    }

    public void removeById(int id) {
        String sql = "DELETE FROM tarefas WHERE ID = ?";

        Connection c = null;
        PreparedStatement ps = null;
        //tratamento de exceções
        try {
            c = ConnectionFactory.getConnection();//conectar com o Banco
            ps = c.prepareStatement(sql);//prepara o comando sql que vai ser ultilizado no Banco de Dados
            ps.setInt(1, id);//substitue o "?" do comando sql pelo id passado como parêmetro no método
            ps.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar a Tarefa "
                    + e.getMessage(), e);
        } finally {//sempre vai ser execultado independe do tratamento da exceção 
            ConnectionFactory.closeConnection(c, ps);//fecha a conexão com o Banco e o comando SQL
        }
    }

    public List<Tarefa> getAll(int idProjeto) {
       String sql = "SELECT * FROM tarefas WHERE idProjetos = ?";

        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;//Guardo o que teve de resposta quando faz o SELECT no banco de dados
        List<Tarefa> listaTarefas = new ArrayList<>();//lista de tarefas
        //tratamento de exceções
        try {
            c = ConnectionFactory.getConnection();//conectar com o Banco
            ps = c.prepareStatement(sql);//prepara o comando sql que vai ser ultilizado no Banco de Dados
            ps.setInt(1, idProjeto);//substitue o "?" do comando sql pelo id passado como parêmetro no método
            rs = ps.executeQuery();//Guarda o que teve de resposta quando faz o SELECT no banco de dados
            
            while(rs.next()){//enquanto houver um próximo na lista, fica no laço
                Tarefa t = new Tarefa();
                t.setId(rs.getInt("id"));
                t.setIdProjetos(rs.getInt("idProjetos"));
                t.setNome(rs.getString("nome"));
                t.setDescricao(rs.getString("descricao"));
                t.setCompletada(rs.getBoolean("completada"));
                t.setObservacoes(rs.getString("observacoes"));
                t.setPrazo(rs.getDate("prazo"));
                t.setCreatedAt(rs.getDate("createdAt"));
                t.setUpdatedAt(rs.getDate("updatedAt"));
                
                listaTarefas.add(t);//adiciona a tarefa na lista de tarefas
                
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar as Tarefas "
                    + e.getMessage(), e);
        } finally {//sempre vai ser execultado independe do tratamento da exceção 
            ConnectionFactory.closeConnection(c, ps, rs);//fecha a conexão com o Banco,o comando SQL e o ResultSet
        }
        //restornou a lista de tarefas armazenas no ArrayList
        return listaTarefas;
    }

}
