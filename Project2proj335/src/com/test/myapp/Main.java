package com.test.myapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/test/myapp/fxmlclaire.fxml"));  // Adjust path if necessary
        primaryStage.setTitle("Shape Viewer");
        primaryStage.setScene(new Scene(root, 500, 400));  // Adjust window size as needed
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
