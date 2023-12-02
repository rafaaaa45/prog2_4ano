package com.example.prog2_4ano;

public class Administrador{
    private String username;
    private String password;
    private String nome;
    private Integer cc;
    private Integer nif;
    private Integer telefone;
    private String morada;
    private String localidade;
    private String tipo;

    public Administrador(String username, String password, String nome, Integer cc, Integer nif, Integer telefone, String morada, String localidade, String tipo) {
        this.username = username;
        this.password = password;
        this.nome = nome;
        this.cc = cc;
        this.nif = nif;
        this.telefone = telefone;
        this.morada = morada;
        this.localidade = localidade;
        this.tipo = tipo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public Integer getNif() {
        return nif;
    }

    public void setNif(Integer nif) {
        this.nif = nif;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
