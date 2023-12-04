package com.example.prog2_4ano;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ListConsultorios implements Initializable {
    @FXML
    private ListView<String> consultorios;

    public static String consultorioCurrente;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Repository repo;
        repo = Repository.getRepository();
        for (Consultorio consultorio : repo.getConsultorios().values()) {
            consultorios.getItems().addAll(consultorio.getTelefone());
        }

            consultorios.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                    consultorioCurrente = consultorios.getSelectionModel().getSelectedItem();
                }
            });
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
