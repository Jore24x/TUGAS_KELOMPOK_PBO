package com.project.pbo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerSakitAyam {
    @FXML
    private Button button_pulangdulu, button_fluburung, button_feseskapur, button_tetelo;
    @FXML
    void pulangdoeloe(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Stage window = (Stage) button_pulangdulu.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void feseskapur(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AyamFesesKapur.fxml"));
        Stage window = (Stage) button_feseskapur.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void fluburung(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AyamFluBurung.fxml"));
        Stage window = (Stage) button_fluburung.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void tetelo(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AyamTetelo.fxml"));
        Stage window = (Stage) button_tetelo.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}
