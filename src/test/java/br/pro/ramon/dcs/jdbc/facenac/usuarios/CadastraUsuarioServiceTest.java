package br.pro.ramon.dcs.jdbc.facenac.usuarios;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class CadastraUsuarioServiceTest {

    @Test
    public void testCadastra() {
        // dados do novo usuário
        String nome = "Novo Usuário";
        String email = "novo.usuario@facenac.com.br";
        String senha = "novasenha";
        byte[] foto = null;

        // tenta encontrar o usuário que queremos cadastrar e verifica que não existe
        ProcuraUsuarioService procuraSvc = new ProcuraUsuarioService();
        Usuario usuario = procuraSvc.getByEmail(email);
        assertThat(usuario, is(nullValue()));

        // cadastra usuário
        CadastraUsuarioService svc = new CadastraUsuarioService();
        svc.cadastra(nome, email, senha, foto);

        // tenta encontrar o usuário que cadastramos e verifica que existe
        usuario = procuraSvc.getByEmail(email);
        assertThat(usuario, is(notNullValue()));

        assertThat(usuario.getId(), is(notNullValue()));
        assertThat(usuario.getNome(), is(nome));
        assertThat(usuario.getEmail(), is(email));
        assertThat(usuario.getSenha(), is(not(senha)));
        assertThat(usuario.getFoto(), is(foto));

        // vamos remover o usuário que acabamos de cadastrar
        RemoveUsuarioService removerSvc = new RemoveUsuarioService();
        removerSvc.removeByEmail(email);
    }

}
