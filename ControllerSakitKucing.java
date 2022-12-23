package com.project.pbo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerSakitKucing {
    @FXML
    private Button button_pulangdulu, button_diare, button_felineherpes, button_leukimia;
    @FXML
    void pulangdoeloe(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Stage window = (Stage) button_pulangdulu.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void diare(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("KucingDiare.fxml"));
        Stage window = (Stage) button_diare.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void felineherpes(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("KucingFelineHerpes.fxml"));
        Stage window = (Stage) button_felineherpes.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void leukimia(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("KucingLeukimia.fxml"));
        Stage window = (Stage) button_leukimia.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}
