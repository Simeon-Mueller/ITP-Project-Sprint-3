package org.example.itpproject.App;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.itpproject.Controller.MesswertBearbeitenController;

public class MesswertBearbeitenApplication extends Application {

    @Override
    public void start(Stage stage) {
        MesswertBearbeitenController.showController(stage);
    }
}
