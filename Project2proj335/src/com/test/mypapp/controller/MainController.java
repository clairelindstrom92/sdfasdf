
package com.test.mypapp.controller;
import javafx.scene.image.Image;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MainController {
    @FXML
    private ComboBox<String> shapeComboBox;
    @FXML
    private TextField dimensionField;
    @FXML
    private Button submitButton;
    @FXML
    private Canvas shapeCanvas;  // Using Canvas for drawing shapes

    @FXML
    public void initialize() {
        shapeComboBox.getItems().addAll("Circle", "Square", "Triangle", "Rectangle", "Sphere", "Cube", "Cone", "Cylinder", "Torus");
        submitButton.setOnAction(e -> drawShape());
    }

    private void drawShape() {
        GraphicsContext gc = shapeCanvas.getGraphicsContext2D();
        gc.clearRect(0, 0, shapeCanvas.getWidth(), shapeCanvas.getHeight()); // Clear canvas

        String shape = shapeComboBox.getValue();
        double size = Double.parseDouble(dimensionField.getText()); // Assuming a single dimension for simplicity

        gc.setFill(Color.BLACK);
        switch (shape) {
            case "Circle":
                gc.fillOval(10, 10, size, size);
                break;
            case "Square":
                gc.fillRect(10, 10, size, size);
                break;
            case "Triangle":
                double[] xPoints = {10, size + 10, size / 2 + 10};
                double[] yPoints = {size + 10, size + 10, 10};
                gc.fillPolygon(xPoints, yPoints, 3);
                break;
            case "Rectangle":
                gc.fillRect(10, 10, size, size / 2); // Assuming width is half the size for demonstration
                break;
            case "Sphere":
            case "Cube":
            case "Cone":
            case "Cylinder":
            case "Torus":
                // Load an image from the file to represent 3D shapes
                Image image = new Image("path/to/" + shape.toLowerCase() + ".png"); // Ensure you have images named appropriately in your resources
                gc.drawImage(image, 10, 10, size, size);
                break;
            default:
                // Optionally handle unexpected cases
                break;
        }
    }

    }
