package com.example.prog2_4ano;

public class EmpresaRepo {
    public static void createEmpresa(Empresa empresa, donoEmpresa donoEmpresa){
        empresa.setDonoEmpresa(donoEmpresa);
        Repository.getRepository().getEmpresas().put(empresa.getNome(), empresa);
        Repository.getRepository().getDonosEmpresa().get(donoEmpresa.getNif()).getEmpresas().add(empresa);
        System.out.println("Empresa criada com sucesso!!!");
    }
}
