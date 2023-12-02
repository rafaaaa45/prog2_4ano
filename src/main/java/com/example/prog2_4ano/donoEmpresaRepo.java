package com.example.prog2_4ano;

public class donoEmpresaRepo {
    public static void createCompanyOwner(donoEmpresa donoEmpresa){
        Repository.getRepository().getDonosEmpresa().put(donoEmpresa.getNome(), donoEmpresa);
        System.out.println("Dono Empresa criado com sucesso!!!");
    }
}
