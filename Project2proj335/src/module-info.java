module com.test.myapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.test.myapp to javafx.fxml;
    exports com.test.myapp;
}
