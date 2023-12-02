package com.example.prog2_4ano;

public class ClienteRepo {
    public static void createClient(Cliente cliente){
        Repository.getRepository().getClientes().put(cliente.getNif(), cliente);
        System.out.println("Cliente criado com sucesso!!!");
    }
}
