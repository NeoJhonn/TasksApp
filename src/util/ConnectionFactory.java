package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

        

/**
 *
 * @author Neojhon
 */
public class ConnectionFactory {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";//o banco de dados a ser usado, no caso o MySQL
    public static final String URL = "jdbc:mysql://localhost:3306/projetofinal";//caminho até o banco de dados, pegar a porta do banco no Mysql
    public static final String USER = "root";//usario do MySQL padrão, pode ser mudado lá no xamp
    public static final String PASS = "My368091";//password do MySQL padrão, pode ser mudado lá no xamp 
    
    /**Método que faz a conecção com o Banco de dados*/
    public static Connection getConnection(){//métdo do tipo "static" você não precisa intânciar a classe para usa-lo(Global)
        //tratamento de Exeções(try, catch)
        try{
            Class.forName(DRIVER);//driver = MYSQL
            return DriverManager.getConnection(URL, USER, PASS);//camino, usuário e senha
        }catch (Exception e){
            throw new RuntimeException("Erro na conexão com o banco de dados",e);//joga a exeção para frente
        }
    }
    
    /**Método que encerra a conexão com o banco de dados*/
    public static void closeConnection(Connection connection){
        try {
            if(connection != null){//se a conexão não for nula
                connection.close();
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados",e);
        }
    }
    
    /**Método que encerra a conexão com o banco de dados e o comando com o SQL*/
    public static void closeConnection(Connection connection, PreparedStatement ps){
        try {
            if(connection != null){//se a conexão não for nula
                connection.close();
            }
            if(ps != null){
                ps.close();
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados",e);
        }
    }
    
    /**Método que encerra a conexão com o banco de dados, o comando com o SQL e o ResultSet*/
    public static void closeConnection(Connection connection, PreparedStatement ps,ResultSet rs){
        try {
            if(connection != null){//se a conexão não for nula
                connection.close();
            } 
            
            if(ps != null){
                ps.close();
            }
            
            if(rs !=null){
                rs.close();
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados",e);
        }
    }
}

