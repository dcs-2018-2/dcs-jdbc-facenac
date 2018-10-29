package br.pro.ramon.dcs.jdbc.facenac.usuarios;

import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LoginServiceTest {

    @Parameters(name = "{index}: email={0} senha={1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            // login autorizado
            {"usuario1@facenac.com.br", "senha1", true},
            {"usuario2@facenac.com.br", "senha2", true},
            {"usuario3@facenac.com.br", "senha3", true},
            {"usuario4@facenac.com.br", "senha4", true},
            // email errado
            {"usuario5@facenac.com.br", "senha1", false},
            {"usuario6@facenac.com.br", "senha2", false},
            {"usuario7@facenac.com.br", "senha3", false},
            {"usuario8@facenac.com.br", "senha4", false},
            // senha errada
            {"usuario1@facenac.com.br", "senha5", false},
            {"usuario2@facenac.com.br", "senha6", false},
            {"usuario3@facenac.com.br", "senha7", false},
            {"usuario4@facenac.com.br", "senha8", false},
            // email e senha errados
            {"usuario5@facenac.com.br", "senha5", false},
            {"usuario6@facenac.com.br", "senha6", false},
            {"usuario7@facenac.com.br", "senha7", false},
            {"usuario8@facenac.com.br", "senha8", false}
        });
    }

    private String email;
    private String senha;
    private boolean autorizacaoEsperada;

    public LoginServiceTest(String email, String senha, boolean autorizacaoEsperada) {
        this.email = email;
        this.senha = senha;
        this.autorizacaoEsperada = autorizacaoEsperada;
    }

    @Test
    public void testIsAutorizado() {
        LoginService svc = new LoginService();
        boolean autorizacao = svc.isAutorizado(email, senha);
        assertThat(autorizacao, is(autorizacaoEsperada));
    }

}
