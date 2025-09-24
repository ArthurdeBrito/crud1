/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

/**
 *
 * @author aluno.saolucas
 */
public class Usuario {

    private int id;
    private String login;
    private String senha;
    private String nome;
    private boolean ativo;

    public Usuario() {
    }

    public Usuario(int id, String login, String nome, boolean ativo) {
        this.id = id;
        this.login = login;
        this.nome = nome;
        this.ativo = ativo;
    }

    public Usuario(int id, String login, String senha, String nome, boolean ativo) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
