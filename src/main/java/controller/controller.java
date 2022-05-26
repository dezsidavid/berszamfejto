package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.model;

import java.io.FileWriter;
import java.io.IOException;

public class controller {
    @FXML
    private TextField fizetes;
    @FXML
    private TextField munkanapok;
    @FXML
    private TextField ledolgozott;
    @FXML
    public Label munkanapokresult;
    public Label ledolgozottresult;
    public Label bruttoresult;
    public Label szjaresult;
    public Label tbresult;
    public Label nettoresult;
    public Label szharesult;
    public Label szkhresult;
    private model model;
    @FXML
    public void initialize(){
        model = new model();
    }
    public void calculate(ActionEvent actionEvent){
        Button button = (Button) actionEvent.getSource();
        if(button.getId().equals("szamolasbutton")){
            munkanapokresult.setText(model.munkanapokszamol(munkanapok.getText()));
            ledolgozottresult.setText(model.ledolgozottszamol(ledolgozott.getText()));
            bruttoresult.setText(model.bruttoszamol(fizetes.getText(), munkanapok.getText(), ledolgozott.getText()));
            szjaresult.setText(model.szjaszamol(fizetes.getText(), munkanapok.getText(), ledolgozott.getText()));
            tbresult.setText(model.tbszamol(fizetes.getText(), munkanapok.getText(), ledolgozott.getText()));
            nettoresult.setText(model.nettoszamol(fizetes.getText(), munkanapok.getText(), ledolgozott.getText()));
            szharesult.setText(model.szhaszamol(fizetes.getText(), munkanapok.getText(), ledolgozott.getText()));
            szkhresult.setText(model.szkhszamol(fizetes.getText(), munkanapok.getText(), ledolgozott.getText()));
        }
    }

    @FXML
    void mentes(){

    }





}
