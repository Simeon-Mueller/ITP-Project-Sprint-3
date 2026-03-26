package org.example.itpproject.App;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.itpproject.Controller.MesswertAuswaehlenController;

public class MesswertAuswaehlenApplication extends Application {

    @Override
    public void start(Stage stage) {
        MesswertAuswaehlenController.showController(stage);
    }
}
