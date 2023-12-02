package com.example.prog2_4ano;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class ListClientes implements Initializable {
    @FXML
    private ListView<String> clientes;

    public static String clienteCurrente;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Repository repo;
        repo = Repository.getRepository();
        for (Cliente cliente : repo.getClientes().values()) {
            clientes.getItems().addAll(cliente.getNome());

            clientes.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                    clienteCurrente = clientes.getSelectionModel().getSelectedItem();
                }
            });
        }
    }


}
