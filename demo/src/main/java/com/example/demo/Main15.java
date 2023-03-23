package com.example.demo;

import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main15 extends Application {
    @Override
    public void start(Stage primarystage) throws FileNotFoundException {
        Pane pane = new Pane();
        Text text = new Text("ABC");
        text.setFill(Color.DEEPPINK);
        text.setX(200);
        text.setY(200);
        pane.getChildren().add(text);

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1000), new EventHandler<ActionEvent>() {
            boolean b = true;
            @Override
            public void handle(ActionEvent actionEvent) {
                if (b){
                    text.setStyle("-fx-font-size : 30");
                    text.setX(50);
                    text.setY(50);
                    b = !b;
                } else {
                    text.setStyle("-fx-font-size : 15");
                    text.setX(200);
                    text.setY(200);
                    b = !b;
                }
            }
        }));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        Scene scene = new Scene(pane, 400, 400);
        primarystage.setScene(scene);
        primarystage.show();
    }}
