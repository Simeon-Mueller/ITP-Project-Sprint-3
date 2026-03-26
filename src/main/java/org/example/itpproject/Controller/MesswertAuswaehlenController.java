package org.example.itpproject.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.example.itpproject.Utils.AlertBox;

import java.io.IOException;

public class MesswertAuswaehlenController {
    Stage stage;

    @FXML
    private Button btnBearbeiten;

    @FXML
    private Button btnLoeschen;

    @FXML
    private ListView<?> listViewKunde;

    @FXML
    void onActionAbbrechen(ActionEvent event) {
        stage.close();
    }

    @FXML
    void onActionAuswaehlen(ActionEvent event) {
        AlertBox.showAlertNotYetImplemented();
    }

    @FXML
    void onActionBearbeiten(ActionEvent event) {
        AlertBox.showAlertNotYetImplemented();
    }

    @FXML
    void onActionLoeschen(ActionEvent event) {
        AlertBox.showAlertNotYetImplemented();
    }

    @FXML
    void onActionNeu(ActionEvent event) {
        AlertBox.showAlertNotYetImplemented();
    }

    public static void showController() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(KundeAuswaehlenController.class.getResource("/org/example/itpproject/messwert-auswaehlen.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            MesswertAuswaehlenController ctrl = fxmlLoader.getController();
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
