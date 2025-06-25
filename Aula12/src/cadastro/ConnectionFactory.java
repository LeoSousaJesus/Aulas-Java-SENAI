package cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  ConnectionFactory {
    public Connection connectaDB(){
        Connection conn = null;
        
        
        try {
            String url = "jdbc:mariadb://localhost:3306/cadastro?useSS!=false";
            
            String user = "root";
            
            String password = "";
            
            conn = DriverManager.getConnection(url, user, password);
            
            System.out.println("Conexão sucedida");
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
            
        }
        
        return conn;
    }
    
    
}

