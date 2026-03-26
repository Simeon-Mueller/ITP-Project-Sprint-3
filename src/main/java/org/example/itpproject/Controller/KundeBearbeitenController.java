package org.example.itpproject.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class KundeBearbeitenController {

    @FXML
    private ToggleGroup Geschlecht;

    @FXML
    private DatePicker dpGeburtsdatum;

    @FXML
    private Label lbKundeBearbeiten;

    @FXML
    private RadioButton rbMaennlich;

    @FXML
    private RadioButton rbUnbekannt;

    @FXML
    private RadioButton rbWeiblich;

    @FXML
    private TextField tfNachname;

    @FXML
    private TextField tfVorname;

    @FXML
    void onActionAbbrechen(ActionEvent event) {

    }

    @FXML
    void onActionOk(ActionEvent event) {

    }

    public static void showController(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(KundeAuswaehlenController.class.getResource("/org/example/itpproject/kunde-bearbeiten.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Kunde auswählen");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
