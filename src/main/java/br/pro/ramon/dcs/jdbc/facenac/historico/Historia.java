package br.pro.ramon.dcs.jdbc.facenac.historico;

import java.util.Date;

public class Historia {

    private Long id;
    private Long usuario;
    private String texto;
    private byte[] foto;
    private Date data;

    public Historia(Long id, Long usuario, String texto, byte[] foto, Date data) {
        this.id = id;
        this.usuario = usuario;
        this.texto = texto;
        this.foto = foto;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public Long getUsuario() {
        return usuario;
    }

    public String getTexto() {
        return texto;
    }

    public byte[] getFoto() {
        return foto;
    }

    public Date getData() {
        return data;
    }

}
