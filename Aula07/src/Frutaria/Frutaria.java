package Frutaria;

import aula07.ConnectionsFactory;

import java.sql.SQLException;

public class Frutaria {
    
    public static void main(String[] args) throws SQLException{        
       
        FrutaDao frutaDao = new FrutaDao();
        Fruta fruta = new Fruta(0, "Melão", 11, "Verde", "Ceres");
        frutaDao.inserirFruta(fruta);
       
        
    }
}
