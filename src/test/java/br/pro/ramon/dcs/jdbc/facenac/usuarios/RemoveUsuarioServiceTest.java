package br.pro.ramon.dcs.jdbc.facenac.usuarios;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class RemoveUsuarioServiceTest {
    
    @Test
    public void testCadastra() {
        // usuário que sabemos existir e que não tem historico, etc. (para podermos apagar)
        String nome = "Usuário X";
        String email = "usuarioX@facenac.com.br";
        String senha = "senhaX";
        byte[] foto = null;

        // tenta encontrar o usuário e verifica que existe
        ProcuraUsuarioService procuraSvc = new ProcuraUsuarioService();
        Usuario usuario = procuraSvc.getByEmail(email);
        assertThat(usuario, is(notNullValue()));

        // remove usuário
        RemoveUsuarioService svc = new RemoveUsuarioService();
        svc.removeByEmail(email);

        // tenta encontrar o usuário novamente e verifica que não existe
        usuario = procuraSvc.getByEmail(email);
        assertThat(usuario, is(nullValue()));

        // vamos inserir o usuário novamente para que, na próxima vez que testarmos aqui, ele ainda exista!
        CadastraUsuarioService cadastraSvc = new CadastraUsuarioService();
        cadastraSvc.cadastra(nome, email, senha, foto);
    }
    
}
