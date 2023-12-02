package com.example.prog2_4ano;

public class FuncionarioRepo {
    public static void createFuncionario(Funcionario funcionario, Empresa empresa){
        funcionario.setEmpresa(empresa);
        Repository.getRepository().getFuncionarios().put(funcionario.getNome(), funcionario);
        Repository.getRepository().getEmpresas().get(empresa.getNome()).getFuncionarios().add(funcionario);
        System.out.println("Funcionario criado com sucesso!!!");
    }
}
