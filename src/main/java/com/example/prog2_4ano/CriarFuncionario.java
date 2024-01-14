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
    private ChoiceBox<String> consultorio;
    @FXML
    private Button criarFuncionario;
    @FXML
    private Button voltar;

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
        String telefone1 = consultorio.getValue().toString();
        for (Consultorio consultorio1 : Repository.getRepository().getConsultorios().values()) {
            if (consultorio1.getTelefone().equals(telefone1)) {
                FuncionarioRepo.createFuncionario(funcionario, consultorio1, sessionData.donoEmpresa);
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
        for(Consultorio consultorio1 : Repository.getRepository().getConsultorios().values()) {
            if(consultorio1.getEmpresa().getDonoEmpresa().getNome().equals(donoEmpresa.getNome()))
                consultorio.getItems().addAll(consultorio1.getTelefone());
        }
        tipoFuncionario.getItems().addAll("dentistas", "enfermeiros", "auxiliares", "secretariado");
    }


    @FXML
    protected void onVoltar(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("menuDonoEmpresa.fxml"));
            Scene regCena = new Scene (root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(regCena);
            stage.setTitle("Dono Empresa");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
