module org.example.itpproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.itpproject to javafx.fxml;
    exports org.example.itpproject;
}