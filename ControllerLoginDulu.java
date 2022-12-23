package com.project.pbo;

import java.awt.*;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.io.IOException;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class ControllerLoginDulu extends javax.swing.JFrame {
    @SuppressWarnings("unchecked")
    Connection con = null;
    Statement st = null;
public ControllerLoginDulu(){
    initComponents();
}

    private void initComponents() {
    }

    @FXML
    private TextField username , petname , petage;
    @FXML
    private Button button_milihayam, button_milihanjing, button_milihreptil, button_milihkucing, button_pulangdulu;

    @FXML
    void milihanjing(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("KonsultasiSakitAnjing.fxml"));
        Stage window = (Stage) button_milihanjing.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void milihayam(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("KonsultasiSakitAyam.fxml"));
        Stage window = (Stage) button_milihayam.getScene().getWindow();
        window.setScene(new Scene(root));
        }
    @FXML
    void milihreptil(ActionEvent event) throws IOException {

        String user="root";
        String pswd ="";
        String host="localhost";
        String db="anidoc";
        String url="";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            url="jdbc:mysql://"+ host +"/"+ db + "?user=" + user +
                    "&password="+ pswd;
            Connection conn=DriverManager.getConnection(url);
            PreparedStatement pStatement =
                    conn.prepareStatement("INSERT INTO userdata(username,petname,petage)" + "VALUES (?,?,?)");
            pStatement.setString(1, username.getText());
            pStatement.setString(2, petname.getText());
            pStatement.setString(3, petage.getText());
            pStatement.close();
            conn.close();
            username.setText("");
            petname.setText("");
            petage.setText("");
        }
        catch(ClassNotFoundException e) {
            System.out.println("jdbc.Driver tidak ditemukan");
        }
        catch (SQLException e){
            System.out.println("koneksi gagal " + e.toString());
        }

        Parent root = FXMLLoader.load(getClass().getResource("KonsultasiSakitReptil.fxml"));
        Stage window = (Stage) button_milihreptil.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void milihkucing(ActionEvent event) throws Exception, SQLException {

        String user="root";
        String pswd ="";
        String host="localhost";
        String db="anidoc";
        String url="";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            url="jdbc:mysql://"+ host +"/"+ db + "?user=" + user + "&password="+ pswd;
            Connection conn=DriverManager.getConnection(url);
            PreparedStatement pStatement = conn.prepareStatement("INSERT INTO userdata(username,petname,petage)" + "VALUES (?,?,?)");
            pStatement.setString(1, username.getText());
            pStatement.setString(2, petname.getText());
            pStatement.setString(3, petage.getText());
            if (pStatement.executeUpdate()>0) {
                JOptionPane.showMessageDialog(this,
                        "Penambahan sukses", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
                Parent root = FXMLLoader.load(getClass().getResource("KonsultasiSakitKucing.fxml"));
                Stage window = (Stage) button_milihkucing.getScene().getWindow();
                window.setScene(new Scene(root));
            }
            else {
                JOptionPane.showMessageDialog(this,
                        "Penambahan gagal", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
                pStatement.close();
                conn.close();
                username.setText("");
                petname.setText("");
                petage.setText("");
            }
        }
        catch(ClassNotFoundException e) {
            System.out.println("jdbc.Driver tidak ditemukan");
        }
        catch (SQLException e){
            System.out.println("koneksi gagal " + e.toString());
        }


    }
    @FXML
    void pulangdoeloe(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Stage window = (Stage) button_pulangdulu.getScene().getWindow();
        window.setScene(new Scene(root));
    }

        }
