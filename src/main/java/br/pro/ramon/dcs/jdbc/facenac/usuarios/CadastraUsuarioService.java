package br.pro.ramon.dcs.jdbc.facenac.usuarios;

import static br.pro.ramon.dcs.jdbc.facenac.Jdbc.DRIVER;
import static br.pro.ramon.dcs.jdbc.facenac.Jdbc.PASS;
import static br.pro.ramon.dcs.jdbc.facenac.Jdbc.URL;
import static br.pro.ramon.dcs.jdbc.facenac.Jdbc.USER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastraUsuarioService {

    public void cadastra(String nome, String email, String senha, byte[] foto) {
        throw new UnsupportedOperationException("Você precisa implementar o método cadastra.");
    }

}
