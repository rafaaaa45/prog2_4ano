package com.example.prog2_4ano;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class CriarAdmin {
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private TextField nome;
    @FXML
    private TextField cc;
    @FXML
    private TextField nif;
    @FXML
    private TextField telefone;
    @FXML
    private TextField morada;
    @FXML
    private TextField localidade;
    @FXML
    private Button criarAdmin;
    @FXML
    private Button voltar;

    @FXML
    void oncriarAdmin(ActionEvent event) {
        Administrador admin = new Administrador();
        admin.setUsername(username.getText());
        admin.setPassword(password.getText());
        admin.setNome(nome.getText());
        admin.setCc(cc.getText());
        admin.setNif(nif.getText());
        admin.setTelefone(telefone.getText());
        admin.setMorada(morada.getText());
        admin.setLocalidade(localidade.getText());
        AdminRepo.createAdmin(admin);

        try {
            Parent root = FXMLLoader.load(getClass().getResource("adminMenu.fxml"));
            Scene regCena = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(regCena);
            stage.setTitle("Admin");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }

    @FXML
    public void onVoltar(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("adminMenu.fxml"));
            Scene regCena = new Scene (root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(regCena);
            stage.setTitle("Funcionario");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
