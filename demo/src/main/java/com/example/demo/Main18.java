package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main18 extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        HBox pane = new HBox();
        Image image = new Image(new FileInputStream("src/power.jpg"));
        ImageView imageView = new ImageView(image);
        Label l1 = new Label("abc", imageView);
        l1.setContentDisplay(ContentDisplay.BOTTOM);
        pane.getChildren().add(l1);

        Circle circle = new Circle(50);
        Label l2 = new Label("Circle", circle);
        pane.getChildren().add(l2);
        l2.setContentDisplay(ContentDisplay.LEFT);

        Scene scene = new Scene(pane, 500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

