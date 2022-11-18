package com.example.jaxafx_practice;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import javafx.scene.paint.*;
import javafx.scene.text.Font;
import javafx.scene.control.*;
import javafx.scene.Group;

public class Playscene {

    public static TextField guessField = new TextField();
    public static Label[] labels = new Label[16];
    public static Button enterButton = new Button("Enter");
    public static int count=0;

    public static Scene playscence() {

        //Creating the word bank
        //Color myColor= Color.rgb(128,0,0); <-never use????


        Font myfont = new Font(40);


        //////Creates the blanks for word guess/////////
        GridPane gp = new GridPane();

        for (int i = 0; i < 16; i++) {
            labels[i] = new Label("_");
            labels[i].setTextFill(Color.rgb(255, 255, 255));
            labels[i].setFont(myfont);
        }
        int l = 0;
        for (int j = 0; j < 4; j++)
            for (int k = 0; k < 4; k++) {
                gp.add(labels[l], k, j);
                l++;
            }
        gp.setVgap(15);
        gp.setHgap(40);
        //////Creates the blanks for word guess/////////

        //The Interface For player
        Label guessLabel = new Label("Guess:");
        guessLabel.setTextFill(Color.rgb(255, 255, 255));
        guessLabel.setMaxHeight(2);


        enterButton.setTextFill(Color.rgb(255, 255, 255));
        enterButton.setStyle("-fx-background-color: #800000; ");

        HBox user_interface_gs = new HBox();
        user_interface_gs.getChildren().addAll(guessLabel, guessField, enterButton);
        user_interface_gs.setSpacing(15);
        user_interface_gs.setLayoutY(715);


        gp.setLayoutX(150);
        gp.setLayoutY(0);
        gp.setAlignment(Pos.CENTER);
        gp.setVgap(50);

        Group root_ss = new Group(gp, user_interface_gs);

        //Play Scene is created
        Scene PlayScene = new Scene(root_ss, 500, 750, Color.rgb(56,29,82));


        // ********Play scene************


        return PlayScene;
    }

    public static void displayWord(String guess, String correct) {
        if (count==0){
            char[] guessArr = guess.toCharArray();
            char[] crcArr = correct.toCharArray();
            String converter = String.valueOf(guessArr[0]);
            String converter1 = String.valueOf(guessArr[1]);
            String converter2 = String.valueOf(guessArr[2]);
            String converter3 = String.valueOf(guessArr[3]);

            labels[0].setText(converter.toUpperCase());
            labels[1].setText(converter1.toUpperCase());
            labels[2].setText(converter2.toUpperCase());
            labels[3].setText(converter3.toUpperCase());
            for (int i = 0; i < 4; i++)
                for (int j = 0; j < 4; j++) {
                    if ((guessArr[i] == crcArr[j]) && i == j)
                        {labels[i].setTextFill(Color.rgb(0, 255, 0));
                        break;}
                    else if ((guessArr[i] == crcArr[j]) && !(i == j))
                        labels[i].setTextFill(Color.rgb(255, 255, 0));
                }
            }

        if(count==1){
            char[] guessArr = guess.toCharArray();
            char[] crcArr = correct.toCharArray();
            String converter = String.valueOf(guessArr[0]);
            String converter1 = String.valueOf(guessArr[1]);
            String converter2 = String.valueOf(guessArr[2]);
            String converter3 = String.valueOf(guessArr[3]);

            labels[4].setText(converter.toUpperCase());
            labels[5].setText(converter1.toUpperCase());
            labels[6].setText(converter2.toUpperCase());
            labels[7].setText(converter3.toUpperCase());
            for (int i = 0; i < 4; i++)
                for (int j = 0; j < 4; j++)
                    if ((guessArr[i] == crcArr[j]) && i == j) {
                        labels[i + 4].setTextFill(Color.rgb(0, 255, 0));
                    break;}
                    else if ((guessArr[i] == crcArr[j]) && !(i == j))
                        labels[i+4].setTextFill(Color.rgb(255, 255, 0));
        }
        if(count==2){
            char[] guessArr = guess.toCharArray();
            char[] crcArr = correct.toCharArray();
            String converter = String.valueOf(guessArr[0]);
            String converter1 = String.valueOf(guessArr[1]);
            String converter2 = String.valueOf(guessArr[2]);
            String converter3 = String.valueOf(guessArr[3]);

            labels[8].setText(converter.toUpperCase());
            labels[9].setText(converter1.toUpperCase());
            labels[10].setText(converter2.toUpperCase());
            labels[11].setText(converter3.toUpperCase());
            for (int i = 0; i < 4; i++)
                for (int j = 0; j < 4; j++)
                    if ((guessArr[i] == crcArr[j]) && i == j) {
                        labels[i + 8].setTextFill(Color.rgb(0, 255, 0));
                    break;}
                    else if ((guessArr[i] == crcArr[j]) && !(i == j))
                        labels[i+8].setTextFill(Color.rgb(255, 255, 0));
        }
        if(count==3){
            char[] guessArr = guess.toCharArray();
            char[] crcArr = correct.toCharArray();
            String converter = String.valueOf(guessArr[0]);
            String converter1 = String.valueOf(guessArr[1]);
            String converter2 = String.valueOf(guessArr[2]);
            String converter3 = String.valueOf(guessArr[3]);

            labels[12].setText(converter.toUpperCase());
            labels[13].setText(converter1.toUpperCase());
            labels[14].setText(converter2.toUpperCase());
            labels[15].setText(converter3.toUpperCase());
            for (int i = 0; i < 4; i++)
                for (int j = 0; j < 4; j++)
                    if ((guessArr[i] == crcArr[j]) && i == j) {
                        labels[i + 12].setTextFill(Color.rgb(0, 255, 0));
                    break;}
                    else if ((guessArr[i] == crcArr[j]) && !(i == j))
                        labels[i+12].setTextFill(Color.rgb(255, 255, 0));
        }
        }

};


