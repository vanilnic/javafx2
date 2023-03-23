package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class Main6 extends Application {
    @Override
    public void start(Stage primarystage) throws FileNotFoundException {
        Pane pane = new Pane();
        Text text = new Text("ABCDEFGH");
        Color color = new Color(1.0, 0, 1, 0.8);
        text.setFill(color);
        text.setX(200);
        text.setY(200);
        pane.getChildren().add(text);

        Scene scene = new Scene(pane, 400, 400);
        primarystage.setScene(scene);
        primarystage.show();
    }
}