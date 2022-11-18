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
import java.util.concurrent.atomic.AtomicReference;

import javafx.scene.paint.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.*;
import javafx.scene.Group;
import javafx.scene.text.TextAlignment;
import static com.example.jaxafx_practice.Resultscene.RestartButton;
import static javafx.scene.control.MenuButton.*;


public class Main extends Application {
    String userGuess;
    @Override
    public void start(Stage primary) throws IOException {

        // ********Start scene************
        //PlayButton.setOnAction((e) -> primaryStage.setScene(PlayScene));??????
        // Creates Buttons for Start Screen
        Button PlayButton = new Button("Play");
        PlayButton.setMinWidth(70);
        PlayButton.setMinHeight(40);
        PlayButton.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 23));
        VBox layout1 = new VBox(250.0);
        VBox layout2 = new VBox(25.0);
        layout1.setAlignment(Pos.CENTER);
        Label StartSceneLabel = new Label("Wordle");
        StartSceneLabel.setTextFill(Color.web("FFD700"));


        StartSceneLabel.setMinWidth(100);
        StartSceneLabel.setMinHeight(60);
        StartSceneLabel.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 28));
        StartSceneLabel.setTextFill(Color.BEIGE);
        StartSceneLabel.setAlignment(Pos.CENTER);

        Button BackButton = new Button("Back");
        Button BackButton2 = new Button("Back");
        Button RuleButton = new Button("Rules");
        BackButton2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 23));
        BackButton.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12));
        BackButton2.setLayoutX(700);
        BackButton2.setLayoutY(300);
        BackButton2.setAlignment(Pos.CENTER);

        RuleButton.setMinWidth(70);
        RuleButton.setMinHeight(40);
        RuleButton.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 23));
        Label RuleSceneLabel = new Label("\n\u2022 You have four chances to guess a randomly selected four-letter word.\n \n\u2022 If you have the right letter in the right spot, it shows up green.\n \n\u2022 A correct letter in the wrong spot shows up yellow.\n \n\u2022 A letter that isn't in the word in any spot shows up gray.");
        RuleSceneLabel.setTextFill(Color.BEIGE);
        RuleSceneLabel.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        RuleSceneLabel.setWrapText(true);
        RuleSceneLabel.setTextAlignment(TextAlignment.JUSTIFY);


        layout1.getChildren().addAll(StartSceneLabel, PlayButton, RuleButton);
        layout2.getChildren().addAll(RuleSceneLabel, BackButton2);
        primary.setTitle("Start screen");
        layout1.setStyle("-fx-background-color:#381d52");
        layout2.setStyle("-fx-background-color:#381d52");
        HBox user_interface=new HBox();

        // Creates Start scene
        Scene StartScene = new Scene(layout1, 500, 750.0);
        Scene RuleScene = new Scene(layout2,500, 750.0);

        Playscene playscene=new Playscene();
        Choose_word Choose_word=new Choose_word();
        AtomicReference<String> wordToGuess =new AtomicReference<>(Choose_word.getWord());


        // ********Start scene************

        // ********Play scene************
        PlayButton.setOnAction((e) -> {
            Playscene.count = 0;
            wordToGuess.set(Choose_word.getWord());
            primary.setScene(playscene.playscence());
            primary.setTitle("Game Screen");
        });

        RuleButton.setOnAction((e) -> {
            primary.setScene(RuleScene);
            primary.setTitle("Rule Screen");
        });

        BackButton.setOnAction((e) -> {
            primary.setScene(StartScene);
            primary.setTitle("Game Screen");
        });

        BackButton2.setOnAction((e) -> {
            primary.setScene(StartScene);
            primary.setTitle("Game Screen");
        });

        RestartButton.setOnAction((e) -> {
            Playscene.count = 0;
            wordToGuess.set(Choose_word.getWord());
            primary.setScene(playscene.playscence());
            primary.setTitle("Game Screen");

        });
        Resultscene.MenuButton.setOnAction((e) -> {
            primary.setScene(StartScene);
            primary.setTitle("Game Screen");
        });


        // input user guess on the screen

        playscene.enterButton.setOnAction(e ->{

            String userWord1=playscene.guessField.getText();
            userGuess=userWord1;
            if(userWord1.length()==4) {
            playscene.displayWord(userWord1.toLowerCase(),wordToGuess.get());
            playscene.count +=1;
            }
            System.out.println(wordToGuess.get());
            if (userGuess.equals(wordToGuess.get())){
               primary.setScene(Resultscene.winner(wordToGuess.get()));
            }
            else if (playscene.count==4){
                primary.setScene(Resultscene.loser(wordToGuess.get()));
            }




        });


        primary.setScene(StartScene);
        primary.show();

    }


    public static void main() {
        launch();
    }
}

