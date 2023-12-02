package com.example.prog2_4ano;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private String morada;
    private String localidade;
    private String telefone;
    private donoEmpresa donoEmpresa;
    private estadoEmpresa estadoEmpresa;
    private List<Consultorio> consultorios;
    private List<Funcionario> funcionarios;

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public Empresa() {
        this.consultorios = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    };

    public List<Consultorio> getConsultorios() {
        return consultorios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public com.example.prog2_4ano.estadoEmpresa getEstadoEmpresa() {
        return estadoEmpresa;
    }

    public void setEstadoEmpresa(com.example.prog2_4ano.estadoEmpresa estadoEmpresa) {
        this.estadoEmpresa = estadoEmpresa;
    }

    public donoEmpresa getDonoEmpresa() {
        return donoEmpresa;
    }

    public void setDonoEmpresa(donoEmpresa donoEmpresa) {
        this.donoEmpresa = donoEmpresa;
    }
}
