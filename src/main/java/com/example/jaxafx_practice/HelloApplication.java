package com.example.jaxafx_practice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {



        Label StartSceneLabel = new Label("Start screen");
        Button PlayButton = new Button("Play");
        //PlayButton.setOnAction((e) -> primaryStage.setScene(PlayScene));
        VBox layout1 = new VBox(1.0);
        layout1.setAlignment(Pos.CENTER);
        layout1.getChildren().addAll(StartSceneLabel, PlayButton);
        Scene StartScene = new Scene(layout1, 300.0, 250.0);

        Label PlaySceneLabel = new Label("Play");
        Button BackButton = new Button("back");
        BackButton.setOnAction((e) -> primaryStage.setScene(StartScene));
        VBox layout2 = new VBox(1.0);
        layout2.setAlignment(Pos.CENTER);
        layout2.getChildren().addAll(PlaySceneLabel, BackButton);
        Scene PlayScene = new Scene(layout2, 300.0, 250.0);


        PlayButton.setOnAction((e) -> primaryStage.setScene(PlayScene));

        primaryStage.setScene(StartScene);
        primaryStage.show();

    }


    public static void main() {
      launch();
      }
}
