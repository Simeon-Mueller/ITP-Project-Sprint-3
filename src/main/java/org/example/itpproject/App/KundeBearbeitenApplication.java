package org.example.itpproject.App;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.itpproject.Controller.KundeBearbeitenController;

public class KundeBearbeitenApplication extends Application {

    @Override
    public void start(Stage stage) {
        KundeBearbeitenController.showController();
    }
}
