package aula07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionsFactory {
    
    public Connection conectaDB(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/cadastro?useSSL=false";            
            String user = "root";
            String password = "";
            
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
        }
        return conn;
    }
}
