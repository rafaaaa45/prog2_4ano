package com.example.prog2_4ano;

public class FuncionarioRepo {
    public static void createFuncionario(Funcionario funcionario, Consultorio consultorio){
        funcionario.setConsultorio(consultorio);
        Repository.getRepository().getFuncionarios().put(funcionario.getNome(), funcionario);
        Repository.getRepository().getConsultorios().get(consultorio.getTelefone()).getFuncionarios().add(funcionario);
        System.out.println("Funcionario criado com sucesso!!!");
    }
}
