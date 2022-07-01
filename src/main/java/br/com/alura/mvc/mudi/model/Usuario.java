package br.com.alura.mvc.mudi.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Usuario {

    @Id
    @Column(name="username")
    private String nomeUsuario;

    @Column(name="password")
    private String senha;

    @Column(name="enabled")
    private Boolean ativo;



    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
