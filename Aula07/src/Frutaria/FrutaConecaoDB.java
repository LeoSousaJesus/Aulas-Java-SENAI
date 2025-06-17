package Frutaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FrutaConecaoDB {

    public Connection conexaoDB() {

        Connection conexao = null;

        try {

            String url = "";
            String user = "";
            String passWord = "jdbc:mysql://localhost:3306/frutaria?useSSL=false";

            conexao = DriverManager.getConnection(url, user, passWord);

        } catch (Exception e) {

            System.out.println("Erro de conecção BD!" + e.getMessage());
        }
        return conexao;
    }

}
