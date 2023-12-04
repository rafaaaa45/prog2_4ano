package com.example.prog2_4ano;

public class ConsultaRepo {
    public static void createConsulta(Funcionario funcionario, Consulta consulta){
        consulta.setFuncionario(funcionario);
        Repository.getRepository().getConsultas().put(consulta.getData(), consulta);
        Repository.getRepository().getFuncionarios().get(funcionario.getNome()).getConsultas().add(consulta);
        System.out.println("Consulta criada com sucesso!!!");
    }
}
