package br.pro.ramon.dcs.jdbc.facenac.usuarios;

import static br.pro.ramon.dcs.jdbc.facenac.Jdbc.DRIVER;
import static br.pro.ramon.dcs.jdbc.facenac.Jdbc.PASS;
import static br.pro.ramon.dcs.jdbc.facenac.Jdbc.URL;
import static br.pro.ramon.dcs.jdbc.facenac.Jdbc.USER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginService {

    public boolean isAutorizado(String email, String senha) {
        throw new UnsupportedOperationException("Você precisa implementar o método isAutorizado.");
    }

}
