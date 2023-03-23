package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override



    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(50);
        //circle.setCenterX(100);
        //circle.setCenterY(100);
        circle.setFill(Color.BLUE);
        //circle.setStroke(Color.RED);
        //circle.setStrokeWidth(20);

        Text text = new Text("ABC");
        //text.setX(200);
        //text.setY(200);
        //text.setFill(Color.PINK);
        //Font font = Font.font("ARIAL", FontWeight.BOLD, FontPosture.ITALIC, 22);
        //text.setFont(font);
        //text.setStyle("-fx-fill : grey;  -fx-font-weight : bold; -fx-font-size : 22px;");
        text.setStyle("-fx-fill : 88008B;  -fx-font-weight : bold; -fx-font-size : 50px;" +
                "-fx-fill: linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);"+
                "-fx-font-style: ITALIC");

        Rectangle rectangle = new Rectangle(100, 100, 100, 100);

        //StackPane pane = new StackPane();
        //VBox pane = new VBox();
        //FlowPane pane = new FlowPane();
        /* pane.getChildren().add(circle);
        pane.getChildren().add(text);
        pane.getChildren().add(rectangle); */

        /* GridPane pane = new GridPane();
        pane.add(circle, 0, 0);
        pane.add(text,1,0);
        pane.add(rectangle, 0,1); */

        BorderPane borderPane = new BorderPane();
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(circle);
        stackPane.getChildren().add(text);
        borderPane.setCenter(stackPane);

        Scene scene = new Scene(borderPane, 400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    }