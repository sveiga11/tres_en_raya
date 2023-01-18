package com.example.tres_en_raya.Controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StatsController {

    @FXML
    private Button cerrarStats ;
    @FXML
    public void closeStats(ActionEvent actionEvent){
        //Boton al que pulsamos
        Node source = (Node) actionEvent.getSource();

        //Esta linea devuelve la ventana a donde esta el boton
        Stage stage = (Stage) source.getScene().getWindow();

        //Cierra la ventana
        stage.close();
    }
}
