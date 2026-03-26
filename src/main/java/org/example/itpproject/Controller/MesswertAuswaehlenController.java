package org.example.itpproject.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class MesswertAuswaehlenController {

    @FXML
    private Button btnBearbeiten;

    @FXML
    private Button btnLoeschen;

    @FXML
    private ListView<?> listViewKunde;

    @FXML
    void onActionAbbrechen(ActionEvent event) {

    }

    @FXML
    void onActionAuswaehlen(ActionEvent event) {

    }

    @FXML
    void onActionBearbeiten(ActionEvent event) {

    }

    @FXML
    void onActionLoeschen(ActionEvent event) {

    }

    @FXML
    void onActionNeu(ActionEvent event) {

    }

    public static void showController(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(KundeAuswaehlenController.class.getResource("/org/example/itpproject/messwert-auswaehlen.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Kunde auswählen");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
