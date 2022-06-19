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
    public static final String URL = "jdbc:mysql://localhost:3306/projetofinal";//caminho at� o banco de dados, pegar a porta do banco no Mysql
    public static final String USER = "root";//usario do MySQL padr�o, pode ser mudado l� no xamp
    public static final String PASS = "My368091";//password do MySQL padr�o, pode ser mudado l� no xamp 
    
    /**M�todo que faz a conec��o com o Banco de dados*/
    public static Connection getConnection(){//m�tdo do tipo "static" voc� n�o precisa int�nciar a classe para usa-lo(Global)
        //tratamento de Exe��es(try, catch)
        try{
            Class.forName(DRIVER);//driver = MYSQL
            return DriverManager.getConnection(URL, USER, PASS);//camino, usu�rio e senha
        }catch (Exception e){
            throw new RuntimeException("Erro na conex�o com o banco de dados",e);//joga a exe��o para frente
        }
    }
    
    /**M�todo que encerra a conex�o com o banco de dados*/
    public static void closeConnection(Connection connection){
        try {
            if(connection != null){//se a conex�o n�o for nula
                connection.close();
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar a conex�o com o banco de dados",e);
        }
    }
    
    /**M�todo que encerra a conex�o com o banco de dados e o comando com o SQL*/
    public static void closeConnection(Connection connection, PreparedStatement ps){
        try {
            if(connection != null){//se a conex�o n�o for nula
                connection.close();
            }
            if(ps != null){
                ps.close();
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar a conex�o com o banco de dados",e);
        }
    }
    
    /**M�todo que encerra a conex�o com o banco de dados, o comando com o SQL e o ResultSet*/
    public static void closeConnection(Connection connection, PreparedStatement ps,ResultSet rs){
        try {
            if(connection != null){//se a conex�o n�o for nula
                connection.close();
            } 
            
            if(ps != null){
                ps.close();
            }
            
            if(rs !=null){
                rs.close();
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar a conex�o com o banco de dados",e);
        }
    }
}

