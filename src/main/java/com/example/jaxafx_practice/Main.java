package com.example.jaxafx_practice;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.paint.*;
import javafx.scene.text.Font;
import javafx.scene.control.*;
import javafx.scene.Group;
import static com.example.jaxafx_practice.Playscene.guessField;
import static com.example.jaxafx_practice.Playscene.playscence;


public class Main extends Application {
    String userGuess;
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

        Button enterButton = new Button("Enter");
        enterButton.setTextFill(Color.rgb(255, 255, 255));
        enterButton.setStyle("-fx-background-color: #800000; ");

        //????????Play scene?????????????
        Playscene playscene = new Playscene();
        //????????Play scene?????????????


        //Button actions
        PlayButton.setOnAction((e) -> {
            primary.setScene(playscene.playscence());
            primary.setTitle("Game Screen");
        });



        enterButton.setOnAction(e -> {

           /*   This is broken since I converted it to Class

           String userWord1 = guessField.getText();
           // userGuess = userWord1;

                        for ( int k=0;k<4;k++) {
                            int number = k;

                            char[] userWord1array = userWord1.toCharArray();
                            if (userWord1array[number] == myWordArray[number]) {
                                //do somthing with color
                            }
                            else if (userWord1array[number+1] == myWordArray[number+1]){
                                //do something with color
                            }
                            else if (userWord1array[number+2] == myWordArray[number+2]){
                                //do something with color
                            }
                            else if (userWord1array[number+3] == myWordArray[number+3]){
                                //do something with color
                            }

                            String converter = String.valueOf(userWord1array[number]);
                            labels[number].setText(converter);
                            converter = String.valueOf(userWord1array[number+1]);
                            labels[number+4].setText(converter);
                            converter = String.valueOf(userWord1array[number+2]);
                            labels[number+8].setText(converter);
                            converter = String.valueOf(userWord1array[number+3]);
                            labels[number+12].setText(converter);
                        }*/
        });

        primary.setScene(StartScene);
        primary.show();


    }


    public static void main() {
        launch();
    }
}
