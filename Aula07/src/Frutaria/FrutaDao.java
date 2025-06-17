package Frutaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FrutaDao {

    public void inserirFruta(Fruta fruta) throws SQLException {

        String sql = "INSERT INTO frutaria(nomeFruta,qtdFruta,maturacaoFruta,localColhido)"
                + "VALUES(?,?,?,?)";

        PreparedStatement pstm = null;

        try {
            pstm = connection.prepareStatement(sql);

            pstm.setString(1, fruta.getNomeFruta());
            pstm.setInt(2, fruta.getQtdFruta());
            pstm.setString(3, fruta.getMaturacaoFruta());
            pstm.setString(4, fruta.getLocalColhido());

            pstm.executeUpdate();

            System.out.println("Usuário cadastrado com sucesso!");

        } catch (Exception e) {

            System.out.println("Erro no cadastro de usuário!");
        } finally {
            if (pstm != null) {
                pstm.close();
            }
        }
    }
}
