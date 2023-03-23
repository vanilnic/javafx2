package com.example.demo;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class OnMouseDragged extends Application {
    @Override
    public void start(Stage primarystage){
        Pane pane = new Pane();
        Text text = new Text("mew is Beautiful");
        text.setX(200);
        text.setY(200);
        text.setOnMouseDragged(new EventHandler<MouseEvent>() {
                                   @Override
                                   public void handle(MouseEvent mouseEvent) {
                                       text.setX(mouseEvent.getX());
                                       text.setY(mouseEvent.getY());
                                   }
                               });
        pane.getChildren().add(text);
        Scene scene = new Scene(pane, 400, 400);
        primarystage.setScene(scene);
        primarystage.show();
    }
}