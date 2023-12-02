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

public class CriarFuncionario implements Initializable {
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
    private ChoiceBox<String> tipoFuncionario;
    @FXML
    private ChoiceBox<String> empresa;
    @FXML
    private Button criarFuncionario;

    @FXML
    void oncriarFuncionario(ActionEvent event) {
        Funcionario funcionario = new Funcionario();
        funcionario.setUsername(username.getText());
        funcionario.setPassword(password.getText());
        funcionario.setNome(nome.getText());
        funcionario.setCc(cc.getText());
        funcionario.setNif(nif.getText());
        funcionario.setTelefone(telefone.getText());
        funcionario.setMorada(morada.getText());
        funcionario.setLocalidade(localidade.getText());
        String nome = empresa.getValue().toString();
        for(Empresa empresa1 : Repository.getRepository().getEmpresas().values()) {
            if(empresa1.getNome().equals(nome)){
                FuncionarioRepo.createFuncionario(funcionario, empresa1);
            }
        }


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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        donoEmpresa donoEmpresa = new donoEmpresa();
        donoEmpresa.setNome(sessionData.donoEmpresa.getNome());
        for(Empresa empresa1 : Repository.getRepository().getEmpresas().values()) {
            if(empresa1.getDonoEmpresa().getNome().equals(donoEmpresa.getNome()))
                empresa.getItems().addAll(empresa1.getNome());
        }
        tipoFuncionario.getItems().addAll("dentistas", "enfermeiros", "auxiliares", "secretariado");
    }
}
