module com.test.myapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.test.myapp to javafx.fxml;
    exports com.test.myapp;
}
