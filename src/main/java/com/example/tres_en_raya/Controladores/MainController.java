package com.example.tres_en_raya.Controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainController {

    @FXML
    private AnchorPane panel;

    @FXML
    int celdas = 0;
    @FXML
    private Button c1, c2, c3, c4, c5, c6, c7, c8, c9;

    @FXML
    private Button empezarJuego, reiniciarJuego;

    @FXML
    private MenuItem close, about, estadisticas, estilo1, estilo2, estiloDefault;

    @FXML
    private RadioButton ComputerComputer, ComputerHuman, HumanHuman;

    @FXML
    private ToggleGroup radioButtonGroup;

    boolean radioButtonHH = false;

    @FXML
    public void activarRadioButton(ActionEvent actionEvent){
        if (HumanHuman.isSelected()){
            radioButtonHH = true;
        }
    }

    // Cerrar aplicacion desde el menuItem File > Close
    @FXML
    public void closeApp(ActionEvent actionEvent) {
        System.exit(0);
    }

    //Cambiar estilos
    @FXML
    private void cambiarEstilo1(ActionEvent event) {
        panel.getStylesheets().clear();
        panel.getStylesheets().add(String.valueOf(MainController.class.getResource("/com/example/tres_en_raya/Styles/style1.css")));
    }

    @FXML
    private void cambiarEstilo2(ActionEvent event) {
        panel.getStylesheets().clear();
        panel.getStylesheets().add(String.valueOf(MainController.class.getResource("/com/example/tres_en_raya/Styles/style2.css")));
    }

    @FXML
    private void cambiarEstilo3(ActionEvent event) {
        panel.getStylesheets().clear();
        panel.getStylesheets().add(String.valueOf(MainController.class.getResource("/com/example/tres_en_raya/Styles/default.css")));
    }

    //Abrir ventana de estadisticas desde el menuItem Help > Estadisticas
    @FXML
    public void openStats(ActionEvent actionEvent) {

        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/tres_en_raya/stats.fxml"));

            // Cargo la ventana
            Parent root = loader.load();

            // Creo el Scene
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    //Abrir ventana de estadisticas desde el menuItem Help > About
    @FXML
    public void openAbout(ActionEvent actionEvent) {

        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/tres_en_raya/about.fxml"));

            // Cargo la ventana
            Parent root = loader.load();

            // Creo el Scene
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    //Empezar juego escogiendo el nombre del jugador o jugadores segun el modo seleccionado
    @FXML
    public void openNickname(ActionEvent actionEvent) {

        if (ComputerHuman.isSelected()) {
            try {
                // Cargo la vista
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/tres_en_raya/nickname.fxml"));

                // Cargo la ventana
                Parent root = loader.load();

                // Creo el Scene
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setScene(scene);
                stage.showAndWait();
            } catch (IOException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText(e.getMessage());
                alert.showAndWait();
            }
        } else if (HumanHuman.isSelected()) {
            try {
                // Cargo la vista
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/tres_en_raya/nickname2.fxml"));

                // Cargo la ventana
                Parent root = loader.load();

                // Creo el Scene
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setScene(scene);
                stage.showAndWait();
            } catch (IOException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText(e.getMessage());
                alert.showAndWait();
            }
        } else if (ComputerComputer.isSelected()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Info");
            alert.setContentText("Esta opcion de juego no se encuentra disponible en estos momentos. Intentelo mas tarde!");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Selecciona un modo de juego para poder iniciar una partida");
            alert.showAndWait();
        }
    }

    // Metodos para marcar celdas
    @FXML
    public void marcarCelda1(ActionEvent actionEvent) {

        if (celdas % 2 == 0) {
            c1.setText("X");
            celdas++;
        } else {
            c1.setText("O");
            celdas++;
        }
    }

    @FXML
    public void marcarCelda2(ActionEvent actionEvent) {

        if (celdas % 2 == 0) {
            c2.setText("X");
            celdas++;
        } else {
            c2.setText("O");
            celdas++;
        }
    }

    @FXML
    public void marcarCelda3(ActionEvent actionEvent) {

        if (celdas % 2 == 0) {
            c3.setText("X");
            celdas++;
        } else {
            c3.setText("O");
            celdas++;
        }
    }

    @FXML
    public void marcarCelda4(ActionEvent actionEvent) {

        if (celdas % 2 == 0) {
            c4.setText("X");
            celdas++;
        } else {
            c4.setText("O");
            celdas++;
        }
    }

    @FXML
    public void marcarCelda5(ActionEvent actionEvent) {

        if (celdas % 2 == 0) {
            c5.setText("X");
            celdas++;
        } else {
            c5.setText("O");
            celdas++;
        }
    }

    @FXML
    public void marcarCelda6(ActionEvent actionEvent) {

        if (celdas % 2 == 0) {
            c6.setText("X");
            celdas++;
        } else {
            c6.setText("O");
            celdas++;
        }
    }

    @FXML
    public void marcarCelda7(ActionEvent actionEvent) {

        if (celdas % 2 == 0) {
            c7.setText("X");
            celdas++;
        } else {
            c7.setText("O");
            celdas++;
        }
    }

    @FXML
    public void marcarCelda8(ActionEvent actionEvent) {

        if (celdas % 2 == 0) {
            c8.setText("X");
            celdas++;
        } else {
            c8.setText("O");
            celdas++;
        }
    }

    @FXML
    public void marcarCelda9(ActionEvent actionEvent) {
        if (celdas % 2 == 0) {
            c9.setText("X");
            celdas++;
        } else {
            c9.setText("O");
            celdas++;
        }
    }

    //Reiniciar Tablero
    @FXML
    public void resetGame(ActionEvent actionEvent) {
        c1.setText("");
        c2.setText("");
        c3.setText("");
        c4.setText("");
        c5.setText("");
        c6.setText("");
        c7.setText("");
        c8.setText("");
        c9.setText("");
    }

    //Alertas informativa sobre el ganador de la partida
    @FXML
    public void ganador1(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("GANADOR");
        alert.setContentText("Enhorabuena Jugador 1, ¡Has ganado la partida!");
        alert.showAndWait();
    }

    @FXML
    public void ganador2(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("GANADOR");
        alert.setContentText("Enhorabuena Jugador 2, ¡Has ganado la partida!");
        alert.showAndWait();
    }

    //Modo de juego Humano vs Humano
    @FXML
    public void HumanVsHuman(ActionEvent actionEvent){
        if (HumanHuman.isSelected()){
            marcarCelda1(actionEvent);
            marcarCelda2(actionEvent);
            marcarCelda3(actionEvent);
            marcarCelda4(actionEvent);
            marcarCelda5(actionEvent);
            marcarCelda6(actionEvent);
            marcarCelda7(actionEvent);
            marcarCelda8(actionEvent);
            marcarCelda9(actionEvent);

            finJuego(actionEvent);
        }
    }

    //Comprobación de las casillas
    public void finJuego(ActionEvent actionEvent){
        if (radioButtonHH == true){

            //Comprobaciones Jugador 1
            if( c1.getText().equals("X")&& c2.getText().equals("X") && c3.getText().equals("X")
                    ||c4.getText().equals("X")&& c5.getText().equals("X") && c6.getText().equals("X")
                    ||c7.getText().equals("X")&& c8.getText().equals("X") && c9.getText().equals("X")
                    ||c1.getText().equals("X")&& c4.getText().equals("X") && c7.getText().equals("X")
                    ||c2.getText().equals("X")&& c5.getText().equals("X") && c8.getText().equals("X")
                    ||c3.getText().equals("X")&& c6.getText().equals("X") && c9.getText().equals("X")
                    ||c1.getText().equals("X")&& c5.getText().equals("X") && c9.getText().equals("X")
                    ||c7.getText().equals("X")&& c5.getText().equals("X") && c3.getText().equals("X"))
            {
                ganador1(actionEvent);
            }


            //Comprobaciones Jugador 2
            else if( c1.getText().equals("O")&& c2.getText().equals("O") && c3.getText().equals("O")
                    ||c4.getText().equals("O")&& c5.getText().equals("O") && c6.getText().equals("O")
                    ||c7.getText().equals("O")&& c8.getText().equals("O") && c9.getText().equals("O")
                    ||c1.getText().equals("O")&& c4.getText().equals("O") && c7.getText().equals("O")
                    ||c2.getText().equals("O")&& c5.getText().equals("O") && c8.getText().equals("O")
                    ||c3.getText().equals("O")&& c6.getText().equals("O") && c9.getText().equals("O")
                    ||c1.getText().equals("O")&& c5.getText().equals("O") && c9.getText().equals("O")
                    ||c7.getText().equals("O")&& c5.getText().equals("O") && c3.getText().equals("O"))
            {
                ganador2(actionEvent);
            }

            //Comprobacion Empate
            else if ((!"".equals(c1))&&(!"".equals(c2))&&(!"".equals(c3))&&(!"".equals(c4))&&(!"".equals(c5))&&(!"".equals(c6))&&(!"".equals(c7))&&(!"".equals(c8))&&(!"".equals(c9)));{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("EMPATE");
                alert.setContentText("¡Habeis empatado la partida!");
                alert.showAndWait();
            }
        }
    }
}