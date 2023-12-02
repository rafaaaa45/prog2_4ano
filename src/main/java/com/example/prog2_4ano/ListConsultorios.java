package com.example.prog2_4ano;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

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
}
