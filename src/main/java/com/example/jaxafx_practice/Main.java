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
import java.util.concurrent.atomic.AtomicReference;
import static com.example.jaxafx_practice.Resultscene.RestartButton;
import javafx.scene.paint.*;
import static com.example.jaxafx_practice.Playscene.guessField;

//import com.example.jaxafx_practice.Playscene.playscence;


public class Main extends Application {
    Scene StartScene;

    Scene RulesScene;
    @Override
    public void start(Stage primary) throws IOException {

        // ********Start scene************

        Button PlayButton = new Button("Play");
        PlayButton.setMinWidth(55);
        PlayButton.setMinHeight(30);


        Button RuleButton = new Button("rules");
        RuleButton.setMinWidth(55);
        RuleButton.setMinHeight(30);

        VBox layout1 = new VBox(25.0);
        layout1.setAlignment(Pos.CENTER);
        Label StartSceneLabel = new Label("Wordle");
        StartSceneLabel.setMinWidth(55);
        StartSceneLabel.setMinHeight(30);
        StartSceneLabel.setAlignment(Pos.CENTER);
        VBox layout2 = new VBox(25.0);
        layout2.setAlignment(Pos.BOTTOM_CENTER);
        layout2.getChildren().addAll(RulesScene, RuleButton);
        layout2.setStyle("-fx-background-color: #FFFFFF;");


        StartSceneLabel.setStyle("-fx-background-color: #FFFFFF;");
        layout1.getChildren().addAll(StartSceneLabel, PlayButton);
        primary.setTitle("Start screen");
        layout1.setStyle("-fx-background-color:#800000");

        HBox user_interface = new HBox();


        // Creates Start scene
        StartScene = new Scene(layout1, 500, 750.0);

        // ********Start scene************


    
        Playscene playscene = new Playscene();
       

        //Create the word to be guessed
        Choose_word Choose_word = new Choose_word();
        AtomicReference<String> wordToGuess = new AtomicReference<>(Choose_word.getWord());

        String wordToGuess = Choose_word.getWord();



        //Button actions
        PlayButton.setOnAction((e) -> {
            primary.setScene(playscene.playscence());

            primary.setTitle("Game Screen");
        });
        primary.setScene(StartScene);
        primary.show();
        playscene.enterButton.setOnAction((e) -> {
            String userWord = playscene.guessField.getText();
            if (userWord.length() == 4) {
                playscene.displayWord(userWord.toLowerCase(), wordToGuess.get());
                playscene.count += 1;
            }
            if (Playscene.count ==4){
                primary.setScene(Resultscene.loser(wordToGuess.get()));
            }
        });

        //Button actions
        RestartButton.setOnAction((e) -> {
            Playscene.count =0;
            wordToGuess.set(Choose_word.getWord());
            primary.setScene(playscene.playscence());
            primary.setTitle("Game Screen");
        });
        primary.setScene(StartScene);
        primary.show();
        playscene.enterButton.setOnAction((e) -> {
            String userWord = playscene.guessField.getText();
            if (userWord.length() == 4) {
                playscene.displayWord(userWord.toLowerCase(), wordToGuess.get());
                playscene.count += 1;
            }
            if (Playscene.count ==4){
                primary.setScene(Resultscene.loser(wordToGuess.get()));
            }
        });

        primary.setScene(StartScene);
        primary.show();
    }

    public static void main() {
        launch();
    }

    public static void main() {
        launch();
    }