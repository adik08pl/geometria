package com.stempien.geometric;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class HelloController {
    public TextField txtWysokoscTrapezu;
    public Label lblPoleTrapez;
    public TextField txtBokTrapezu2;
    public TextField txtBokTrapezu1;
    public Button btnLiczTrapez;
    public Button btnLiczKwadrat;
    public TextField txtKwadratBok;
    public Label lblPoleKwadrat;
    public Button btnLiczRownoleglobok;
    public TextField txtWysokoscRownolegloboku;
    public Label lblPoleRownolegloboku;
    public TextField txtBokRownolegloboku;
    public TextField txtPrzekatnaRombu1;
    public TextField txtPrzekatnaRombu2;
    public Label lblPoleRomb;
    public Button btnLiczRomg;
    public TextField txtProstokatBok2;
    public Label lblPoleProstokat;
    public TextField txtProstokatBok1;
    public Button btnLiczProstokat;

    public void LiczTrapez(ActionEvent actionEvent) {
        try{
        double bokTrapezu1=Double.parseDouble(txtBokTrapezu1.getText().replace(',','.'));
        double bokTrapezu2=Double.parseDouble(txtBokTrapezu2.getText().replace(',','.'));
        double wysokoscTrapezu=Double.parseDouble(txtWysokoscTrapezu.getText().replace(',','.'));
        double poleTrapezu=((bokTrapezu1+bokTrapezu2)*wysokoscTrapezu)/2;
        lblPoleTrapez.setText(String.format("%.2f",poleTrapezu ));
    }catch (NumberFormatException n){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Błąd");
        alert.setHeaderText("ERROR");
        alert.setContentText("Spróbuj jeszcze raz");
        alert.showAndWait();
    }
    }

    public void LiczKwadrat(ActionEvent actionEvent) {
        try{
        double bokKwadratu=Double.parseDouble(txtKwadratBok.getText().replace(',','.'));
        double poleKwadratu=bokKwadratu*bokKwadratu;
        lblPoleKwadrat.setText(String.format("%.2f",poleKwadratu ));
    }catch (NumberFormatException n){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Błąd");
        alert.setHeaderText("ERROR");
        alert.setContentText("Spróbuj jeszcze raz");
        alert.showAndWait();
    }
    }

    public void LiczRownoleglobok(ActionEvent actionEvent) {
        try{
        double bokRownolegloboku=Double.parseDouble(txtBokRownolegloboku.getText().replace(',','.'));
        double wysokoscRownolegloboku=Double.parseDouble(txtWysokoscRownolegloboku.getText().replace(',','.'));
        double poleRownolegloboku=(bokRownolegloboku*wysokoscRownolegloboku)/2;
        lblPoleRownolegloboku.setText(String.format("%.2f", poleRownolegloboku));
            email("Pole równoległoboku to: " + poleRownolegloboku);
    }catch (NumberFormatException n){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Błąd");
        alert.setHeaderText("ERROR");
        alert.setContentText("Spróbuj jeszcze raz");
        alert.showAndWait();
    }
    }

    public void LiczRomb(ActionEvent actionEvent) {
        try{
        double przekatnaRombu1=Double.parseDouble(txtPrzekatnaRombu1.getText().replace(',','.'));
        double przekatnaRombu2=Double.parseDouble(txtPrzekatnaRombu2.getText().replace(',','.'));
        double poleRombu=(przekatnaRombu1*przekatnaRombu2)/2;
        lblPoleRomb.setText(String.format("%.2f", poleRombu));
            email("Pole rombu to: " + poleRombu);
    }catch (NumberFormatException n){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Błąd");
        alert.setHeaderText("ERROR");
        alert.setContentText("Spróbuj jeszcze raz");
        alert.showAndWait();
    }
    }

    public void LiczProstokat(ActionEvent actionEvent) {
        try {
            double bokProstokatu1 = Double.parseDouble(txtProstokatBok1.getText().replace(',', '.'));
            double bokProstokatu2 = Double.parseDouble(txtProstokatBok2.getText().replace(',', '.'));
        double poleProstokatu=bokProstokatu1*bokProstokatu2;
            email("Pole prostokątu to: " + poleProstokatu);
        lblPoleProstokat.setText(String.format("%.2f", poleProstokatu));
        }catch (NumberFormatException n){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText("ERROR");
            alert.setContentText("Spróbuj jeszcze raz");
            alert.showAndWait();
        }
    }

    private void email(String wiadomosc) {
        System.out.println("Pamiętaj!");
        System.out.println(wiadomosc);
    }
}
