package com.example.prog2_4ano;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AdminMenu {
    @FXML
    private Button listDonosEmpresa;
    @FXML
    private Button listClientes;
    @FXML
    private Button listEmpresas;
    @FXML
    private Button listConsultorios;
    @FXML
    private Button listFuncionarios;
    @FXML
    private Button listConsultas;

    @FXML
    protected void onlistDonosEmpresa(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("listDonosEmpresa.fxml"));
            Scene regCena = new Scene (root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(regCena);
            stage.setTitle("Donos Empresa");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onlistClientes(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("listClientes.fxml"));
            Scene regCena = new Scene (root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(regCena);
            stage.setTitle("Clientes");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onlistEmpresas(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("listEmpresas.fxml"));
            Scene regCena = new Scene (root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(regCena);
            stage.setTitle("Empresas");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onlistConsultorios(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("listConsultorios.fxml"));
            Scene regCena = new Scene (root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(regCena);
            stage.setTitle("Consultorios");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onlistFuncionarios(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("listFuncionarios.fxml"));
            Scene regCena = new Scene (root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(regCena);
            stage.setTitle("Funcionarios");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onlistConsultas(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("listConsultas.fxml"));
            Scene regCena = new Scene (root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(regCena);
            stage.setTitle("Consultas");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
