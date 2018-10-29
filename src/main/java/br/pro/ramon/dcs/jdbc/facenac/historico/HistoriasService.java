package br.pro.ramon.dcs.jdbc.facenac.historico;

import static br.pro.ramon.dcs.jdbc.facenac.Jdbc.DRIVER;
import static br.pro.ramon.dcs.jdbc.facenac.Jdbc.PASS;
import static br.pro.ramon.dcs.jdbc.facenac.Jdbc.URL;
import static br.pro.ramon.dcs.jdbc.facenac.Jdbc.USER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistoriasService {

    private int tamanhoPagina;

    public HistoriasService(int tamanhoPagina) {
        this.tamanhoPagina = tamanhoPagina;
    }

    public int getPaginasByUsuario(Long usuario) {
        throw new UnsupportedOperationException("Você precisa implementar o método getPaginasByUsuario.");
    }

    public List<Historia> getHistoriasByUsuario(Long usuario, int pagina) {
        throw new UnsupportedOperationException("Você precisa implementar o método getHistoriasByUsuario.");
    }

}
