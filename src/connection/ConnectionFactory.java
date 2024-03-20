package connection;

/**
 *
 * @author iuri_
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.sql.Driver; //drive de conexao sql para java


public class ConnectionFactory {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/belocao";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection(){
    
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);            
        }    
    }
    
    public static void closeConnection(Connection con){

        try {
            if(con != null){
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);    }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt){
    
        closeConnection(con);    
        
        try {
            if(stmt != null){
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
    
        closeConnection(con, stmt);    
        
        try {
            if(rs != null){
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    


}

///////------------------- UMA OUTRA FORMA DE CONEXÃO COM O BANCO DE DADOS.------------------- \\\\\\\\

/*

public class ConnectionFactory {
    
    private final Connection conexao;
    //private Statement stmt;
    
    public ConnectionFactory() throws Exception {
        //Na linha abaixo é a importação do Driver para a conexão.
        Class.forName("com.mysql.jdbc.Driver");
    
        //Na linha abaixo é colocado o caminho para a ligação com o banco de dados.
        String url = "jdbc:mysql://localhost:3306/belocao";
        
        Na linha abaixo é colocado o usuário e senha ("root", "root") para 
        permitir a conexão com o banco de dados.
        conexao = DriverManager.getConnection(url, "root", "root");
    }
    
    public Connection getConnection(){
        return conexao;
    }
    
}

*/