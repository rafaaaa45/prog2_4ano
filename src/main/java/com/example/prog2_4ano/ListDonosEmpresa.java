package com.example.prog2_4ano;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ListDonosEmpresa implements Initializable {
    @FXML
    private ListView<String> donosEmpresa;

    public static String donoEmpresaCurrente;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Repository repo;
        repo = Repository.getRepository();
        for (donoEmpresa donoEmpresa : repo.getDonosEmpresa().values()) {
            donosEmpresa.getItems().addAll(donoEmpresa.getNome());

            donosEmpresa.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                    donoEmpresaCurrente = donosEmpresa.getSelectionModel().getSelectedItem();
                }
            });
        }
    }
}
