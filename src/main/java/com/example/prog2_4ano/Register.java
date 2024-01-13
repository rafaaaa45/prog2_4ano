package com.example.prog2_4ano;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class Register implements Initializable {
    private boolean phoneStatus = false;
    private boolean nifStatus = false;

    @FXML
    private ChoiceBox<String> tipo;

    @FXML
    private TextField morada;

    @FXML
    private TextField localidade;

    @FXML
    private TextField nome;

    @FXML
    private TextField nif;

    @FXML
    private TextField cc;

    @FXML
    private TextField password;

    @FXML
    private TextField telefone;

    @FXML
    private TextField username;
    @FXML
    private Button register;
    @FXML
    private Button back;

    @FXML
    private Text phoneError;

    @FXML
    private Text nifError;

    @FXML
    void register(ActionEvent event) {
            if(tipo.getValue().equals("Cliente")) {
                Cliente cliente = new Cliente();
                cliente.setMorada(morada.getText());
                cliente.setLocalidade(localidade.getText());
                cliente.setNome(nome.getText());
                cliente.setNif(nif.getText());
                cliente.setCc(cc.getText());
                cliente.setTelefone(telefone.getText());
                cliente.setPassword(password.getText());
                cliente.setUsername(username.getText());
                cliente.setTipo(tipo.getValue());

                ClienteRepo.createClient(cliente);

                // Serialize the data after registration
                Repository repository = Repository.getRepository();
                repository.getClientes().put(cliente.getUsername(), cliente);
                SerializationUtil.serializeRepository(repository, "project_state.ser");

            }
            else{
                donoEmpresa donoEmpresa = new donoEmpresa();
                donoEmpresa.setMorada(morada.getText());
                donoEmpresa.setLocalidade(localidade.getText()); //mudado de toString
                donoEmpresa.setNome(nome.getText());
                donoEmpresa.setNif(nif.getText());
                donoEmpresa.setCc(cc.getText());
                donoEmpresa.setTelefone(telefone.getText());
                donoEmpresa.setPassword(password.getText());
                donoEmpresa.setUsername(username.getText());
                donoEmpresa.setTipo(tipo.getValue());

                donoEmpresaRepo.createCompanyOwner(donoEmpresa);


                // Serialize the data after registration
                Repository repository = Repository.getRepository();
                repository.getDonosEmpresa().put(donoEmpresa.getUsername(), donoEmpresa);
                SerializationUtil.serializeRepository(repository, "project_state.ser");

            }




            try {
                Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
                Scene regCena = new Scene(root);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(regCena);
                stage.setTitle("Login");
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    @FXML
    void back(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene regCena = new Scene (root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(regCena);
            stage.setTitle("Login");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tipo.getItems().addAll("Cliente", "Dono Empresa");
    }
}

