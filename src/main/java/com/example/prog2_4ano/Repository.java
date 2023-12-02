package com.example.prog2_4ano;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class Repository {
    private static Repository repo = null;

    private Map<String, Cliente> clientes = new HashMap<>();
    private Map<String, donoEmpresa> donosEmpresa = new HashMap<>();
    private Map<String, Empresa> empresas = new HashMap<>();
    private Map<String, Consultorio> consultorios = new HashMap<>();
    private Map<String, Administrador> administradores = new HashMap<>();
    private Map<String, Funcionario> funcionarios= new HashMap<>();
    private Map<Integer, Servico> servicos = new HashMap<>();
    private Map<Integer, Consulta> consultas = new HashMap<>();


    public Repository (){};

    public Map<String, Cliente> getClientes() {
        return clientes;
    }
    public Map<String, donoEmpresa> getDonosEmpresa() {
        return donosEmpresa;
    }
    public Map<String, Empresa> getEmpresas() {
        return empresas;
    }
    public Map<String, Consultorio> getConsultorios() {
        return consultorios;
    }
    public Map<String, Administrador> getAdministradores() {return administradores;}
    public Map<String, Funcionario> getFuncionarios() {return funcionarios;}
    public Map<Integer, Servico> getServicos() {return servicos;}
    public Map<Integer, Consulta> getConsultas(){return consultas;}

    public static Repository getRepository(){

        ReentrantLock lock = new ReentrantLock();

        lock.lock();
        if (repo == null)
            repo = new Repository();
        lock.unlock();

        return repo;
    }
}