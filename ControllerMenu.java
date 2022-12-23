package com.project.pbo;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerMenu {
    @FXML
    private Button button_logindulu;
    @FXML
    void logindoeloe(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginDulu.fxml"));
        Stage window = (Stage) button_logindulu.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}