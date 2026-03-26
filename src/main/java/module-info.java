module org.example.itpproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens org.example.itpproject.Controller to javafx.fxml;
    exports org.example.itpproject.Controller;
    exports org.example.itpproject;
    opens org.example.itpproject to javafx.fxml;
    exports org.example.itpproject.App;
    opens org.example.itpproject.App to javafx.fxml;

}