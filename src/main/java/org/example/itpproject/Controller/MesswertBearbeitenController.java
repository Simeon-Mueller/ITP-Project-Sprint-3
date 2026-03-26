package org.example.itpproject.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MesswertBearbeitenController {

    Stage stage;

    @FXML
    private CheckBox cbMessanomalie;

    @FXML
    private DatePicker dpGeburtsdatum;

    @FXML
    private Label lbKunde;

    @FXML
    private Label lbMesswertBearbeiten;

    @FXML
    private TextArea taKommentar;

    @FXML
    private TextField tfMessgoesse;

    @FXML
    private TextField tfMesswert;

    @FXML
    void onActionAbbrechen(ActionEvent event) {
        stage.close();
    }

    @FXML
    void onActionKundeAuswaehlen(ActionEvent event) {
        KundeAuswaehlenController.showController();
    }

    @FXML
    void onActionOk(ActionEvent event) {
        stage.close();
    }

    public static void showController() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(KundeAuswaehlenController.class.getResource("/org/example/itpproject/messwert-bearbeiten.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            MesswertBearbeitenController ctrl = fxmlLoader.getController();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            ctrl.stage = stage;
            stage.setTitle("Kunde auswählen");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
