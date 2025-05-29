module com.example.notebookapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.notebookapp to javafx.fxml;
    exports com.example.notebookapp;
}