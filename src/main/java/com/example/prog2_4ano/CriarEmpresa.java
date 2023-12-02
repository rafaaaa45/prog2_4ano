package com.example.prog2_4ano;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.List;

public class CriarEmpresa {
    @FXML
    private TextField nome;
    @FXML
    private TextField morada;
    @FXML
    private TextField localidade;
    @FXML
    private TextField telefone;
    @FXML
    private Button criarEmpresa;



    @FXML
    void oncriarEmpresa(ActionEvent event) {
        Empresa empresa = new Empresa();
        empresa.setNome(nome.getText());
        empresa.setMorada(morada.getText());
        empresa.setLocalidade(localidade.getText());
        empresa.setTelefone(telefone.getText());
        empresa.setEstadoEmpresa(estadoEmpresa.ativada);
        EmpresaRepo.createEmpresa(empresa, sessionData.donoEmpresa);


        try {
            Parent root = FXMLLoader.load(getClass().getResource("menuDonoEmpresa.fxml"));
            Scene regCena = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(regCena);
            stage.setTitle("Dono Empresa");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

        }
}
