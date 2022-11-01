package com.example.jaxafx_practice;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.paint.*;

import static com.example.jaxafx_practice.Playscene.guessField;
//import com.example.jaxafx_practice.Playscene.playscence;


public class Main extends Application {
    Scene StartScene;
    @Override
    public void start(Stage primary) throws IOException {

        // ********Start scene************

        Button PlayButton = new Button("Play");
        PlayButton.setMinWidth(55);
        PlayButton.setMinHeight(30);

        VBox layout1 = new VBox(250.0);
        layout1.setAlignment(Pos.CENTER);
        Label StartSceneLabel = new Label("Wordle");
         StartSceneLabel.setMinWidth(55);
        StartSceneLabel.setMinHeight(30);
        StartSceneLabel.setAlignment(Pos.CENTER);

        StartSceneLabel.setStyle("-fx-background-color: #FFFFFF;");
        layout1.getChildren().addAll(StartSceneLabel, PlayButton);
        primary.setTitle("Start screen");
        layout1.setStyle("-fx-background-color:#800000");
        HBox user_interface=new HBox();

        // Creates Start scene
        StartScene = new Scene(layout1, 500, 750.0);

        // ********Start scene************



        //????????Play scene?????????????
        Playscene playscene = new Playscene();
        //????????Play scene?????????????


        //Button actions
        PlayButton.setOnAction((e) -> {
            primary.setScene(playscene.playscence());
            primary.setTitle("Game Screen");});
        primary.setScene(StartScene);
        primary.show();
        playscene.enterButton.setOnAction((e) -> {
            String userWord=playscene.guessField.getText();
            if(userWord.length()==4)
                {playscene.displayWord(userWord.toLowerCase(),"hats");
                playscene.count+=1;}
        });
        primary.setScene(StartScene);
        primary.show();
    }
    public static void main() {
        launch();
    }
}
