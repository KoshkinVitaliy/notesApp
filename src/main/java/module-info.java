module com.example.matveeva {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.matveeva to javafx.fxml;
    exports com.example.matveeva;
}