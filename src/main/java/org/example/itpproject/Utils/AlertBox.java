package org.example.itpproject.Utils;

import javafx.scene.control.Alert;

public class AlertBox {

    public static void showAlertNotYetImplemented() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText("Function not yet implemented");
        alert.showAndWait();
    }
}
