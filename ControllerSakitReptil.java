package com.project.pbo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerSakitReptil {
    @FXML
    private Button button_pulangdulu, button_blister, button_ibd, button_mites;
    @FXML
    void pulangdoeloe(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Stage window = (Stage) button_pulangdulu.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void blister(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ReptilBlister.fxml"));
        Stage window = (Stage) button_blister.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void ibd(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ReptilIbd.fxml"));
        Stage window = (Stage) button_ibd.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void mites(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ReptilMites.fxml"));
        Stage window = (Stage) button_mites.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}
