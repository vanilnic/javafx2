package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main11 extends Application {
    private Circle circle;
    @Override

    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(50);
        circle.setFill(Color.PINK);
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(circle);

        Button button = new Button("Change");
        StackPane stackPane1 = new StackPane();
        stackPane1.getChildren().add(button);
        button.setOnAction(new ButtonListener());

        BorderPane pane = new BorderPane();
        pane.setCenter(stackPane);
        pane.setBottom(stackPane1);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class ButtonListener implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            if (circle.getRadius() == 0) circle.setRadius(100);
            else circle.setRadius(circle.getRadius() - 10);
        }
    }
}
