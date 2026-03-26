package org.example.itpproject.App;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.itpproject.Controller.KundeAuswaehlenController;

public class KundeAuswaehlenApplication extends Application {

    @Override
    public void start(Stage stage) {
       KundeAuswaehlenController.showController();
    }
}
