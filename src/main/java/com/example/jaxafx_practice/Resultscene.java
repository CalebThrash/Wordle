package com.example.jaxafx_practice;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Resultscene {

    public static Button RestartButton = new Button("Restart");
    public static Button MenuButton = new Button("Back to Menu");
    String wordToGuess;
    public static Scene loser (String wordToGuess){

        RestartButton.setStyle("-fx-focus-color: transparent");
        RestartButton.setTranslateY(-170);


        MenuButton.setTranslateY(-370);
        MenuButton.setStyle("-fx-focus-color: transparent;");

        Label Game_Over=new Label("Game Over");
        Game_Over.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 50));
        Game_Over.setTranslateY(370);
        Game_Over.setTextFill(Color.web("FFD700"));

        Label correct_word=new Label("The Correct Word Was:");
        correct_word.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 40));
        correct_word.setTranslateY(250);
        correct_word.setTextFill(Color.web("FFD700"));

        Label guessword=new Label(wordToGuess);
        guessword.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 40));
        guessword.setTextFill(Color.web("FFD700"));

        VBox layout1 = new VBox(250.0);
        layout1.setAlignment(Pos.CENTER);

        layout1.getChildren().addAll(Game_Over, correct_word,guessword, RestartButton, MenuButton);
        layout1.setStyle("-fx-background-color:#381d52");


        // Creates Start scene


        return new Scene(layout1, 500, 750.0);


    }

    public static Scene winner(String wordToGuess){

        RestartButton.setStyle("-fx-focus-color: transparent");
        RestartButton.setTranslateY(-170);


        MenuButton.setTranslateY(-370);
        MenuButton.setStyle("-fx-focus-color: transparent;");

        Label Winner=new Label("Winner");
        Winner.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 50));
        Winner.setTranslateY(370);
        Winner.setTextFill(Color.web("FFD700"));

        Label correct_word=new Label("The Correct Word Was:");
        correct_word.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 40));
        correct_word.setTranslateY(250);
        correct_word.setTextFill(Color.web("FFD700"));

        Label guessword=new Label(wordToGuess);
        guessword.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 40));
        guessword.setTextFill(Color.web("FFD700"));

        VBox layout1 = new VBox(250.0);
        layout1.setAlignment(Pos.CENTER);

        layout1.getChildren().addAll(Winner, correct_word,guessword, RestartButton, MenuButton);
        layout1.setStyle("-fx-background-color:#381d52");


        // Creates Start scene


        return new Scene(layout1, 500, 750.0);


    }
}

