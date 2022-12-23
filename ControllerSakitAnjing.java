package com.project.pbo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerSakitAnjing {
    @FXML
    private Button button_pulangdulu, button_infeksigigi, button_infeksitelinga, button_infeksikulit;
    @FXML
    void pulangdoeloe(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Stage window = (Stage) button_pulangdulu.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void infeksigigi(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AsuInfeksiGigi.fxml"));
        Stage window = (Stage) button_infeksigigi.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void infeksikulit(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AsuInfeksiKulit.fxml"));
        Stage window = (Stage) button_infeksikulit.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void infeksitelinga(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AsuInfeksiTelinga.fxml"));
        Stage window = (Stage) button_infeksitelinga.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}
