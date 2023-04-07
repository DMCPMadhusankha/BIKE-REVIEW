package com.example.hcbr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Button ex;
    @FXML
    private Button con;

    @FXML
    void conbtn(ActionEvent event) throws IOException {
        Stage stage = (Stage) con.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle(" login");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void ex1(ActionEvent event) throws IOException {
        Stage stage = (Stage) ex.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("exit.fxml"));
        primaryStage.setTitle(" login");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    private Text rE;

    @FXML
    private AnchorPane slide;

    @FXML
    private Text thnk;


    @FXML
    private Button BCK;

    @FXML
    private Button LOG;

    @FXML
    private PasswordField PSWD;

    @FXML
    private TextField Uname;

    @FXML
    private Button forg1;

    @FXML
    private Button sign;

    @FXML
    void bck1(ActionEvent event) throws IOException {
        Stage stage = (Stage) BCK.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle(" login");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void sign1(ActionEvent event) throws IOException {
        Stage stage = (Stage) sign.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        primaryStage.setTitle(" login");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void forg(ActionEvent event) throws IOException {
        Alert alert4 =  new Alert (Alert.AlertType.INFORMATION);
        alert4.setHeaderText ("Attention");
        alert4.setContentText ("Please ceate new account" );
        Optional<ButtonType> result4=alert4.showAndWait ();
        ButtonType button = result4.orElse ( ButtonType.CANCEL );

    }

    @FXML
    void log(ActionEvent event) throws IOException {
        Stage stage = (Stage) LOG.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("menue.fxml"));
        primaryStage.setTitle(" menue");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    @FXML
    void pswd(ActionEvent event) {

    }

    @FXML
    void un(ActionEvent event) {

    }
    @FXML
    private TextField email;
    @FXML
    private CheckBox chek1;
    @FXML
    private TextField fname1;
    @FXML
    private Button done;
    @FXML
    private TextField lname1;

    @FXML
    private PasswordField pwd1;

    @FXML
    void email1(ActionEvent event) {

    }
    @FXML
    void done1(ActionEvent event) throws IOException {

        if (chek1.isSelected()){
        Stage stage = (Stage) done.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle(" login");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();}
        else{
            Alert alert5 =  new Alert (Alert.AlertType.WARNING);
            alert5.setHeaderText ("Warning");
            alert5.setContentText ("Please verify " );
            Optional<ButtonType> result5=alert5.showAndWait ();
            ButtonType button = result5.orElse ( ButtonType.CANCEL );
        }
    }
    @FXML
    void fname(ActionEvent event) {

    }

    @FXML
    void lname(ActionEvent event) {

    }

    @FXML
    void pwd(ActionEvent event) {

    }
    @FXML
    private ImageView bmw;

    @FXML
    private ImageView ducat;

    @FXML
    private Button exit3;

    @FXML
    private ImageView hond1;

    @FXML
    private ImageView kawa1;

    @FXML
    private Button log2;

    @FXML
    private ImageView suz1;

    @FXML
    private ImageView trum;

    @FXML
    void bmw1(MouseEvent event) {
        Alert alert2 =  new Alert (Alert.AlertType.WARNING);
        alert2.setHeaderText ("Alert ");
        alert2.setContentText ("BMW is  still  under  preparation" );
        Optional<ButtonType> result2=alert2.showAndWait ();
        ButtonType button = result2.orElse ( ButtonType.CANCEL );
    }

    @FXML
    void ducat1(MouseEvent event) {
        Alert alert3 =  new Alert (Alert.AlertType.WARNING);
        alert3.setHeaderText ("Alert ");
        alert3.setContentText ("Ducati is  still Under preparation" );
        Optional<ButtonType> result3=alert3.showAndWait ();
        ButtonType button = result3.orElse ( ButtonType.CANCEL );
    }

    @FXML
    void exit33(ActionEvent event) throws IOException {
        Stage stage = (Stage) exit3.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("exit.fxml"));
        primaryStage.setTitle(" exit");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void hond(MouseEvent event) throws IOException {
        Stage stage = (Stage) hond1.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("honda.fxml"));
        primaryStage.setTitle("Honda");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void kawa(MouseEvent event) throws IOException {
        Stage stage = (Stage) kawa1.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Kawasaki.fxml"));
        primaryStage.setTitle(" Kawasaki");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void log22(ActionEvent event) throws IOException {
        Stage stage = (Stage) log2.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("login");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void suz(MouseEvent event) throws IOException {
        Stage stage = (Stage) suz1.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("suzuki.fxml"));
        primaryStage.setTitle(" suzuki");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void trum1(MouseEvent event) {
        Alert alert1 =  new Alert (Alert.AlertType.WARNING);
        alert1.setHeaderText ("Alert ");
        alert1.setContentText ("Triumph is  still Under preparation" );
        Optional<ButtonType> result1=alert1.showAndWait ();
        ButtonType button = result1.orElse ( ButtonType.CANCEL );
    }






    @FXML
    private Button back2;

    @FXML
    void back22(ActionEvent event) throws IOException {
        Stage stage = (Stage) back2.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("menue.fxml"));
        primaryStage.setTitle(" menue");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    @FXML
    private Button bck4;

    @FXML
    void bck44(ActionEvent event) throws IOException {
        Stage stage = (Stage) bck4.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("menue.fxml"));
        primaryStage.setTitle(" menue");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    @FXML
    private Button bck5;

    @FXML
    void bck55(ActionEvent event) throws IOException {
        Stage stage = (Stage) bck5.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("menue.fxml"));
        primaryStage.setTitle(" menue");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}

