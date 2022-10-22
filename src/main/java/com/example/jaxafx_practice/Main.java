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


public class Main extends Application {
    String userGuess;
    @Override
    public void start(Stage primary) throws IOException {

        // ********Start scene************
        //PlayButton.setOnAction((e) -> primaryStage.setScene(PlayScene));??????
        // Creates Buttons for Start Screen
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
        Scene StartScene = new Scene(layout1, 500, 750.0);



        // ********Start scene************

        // ********Play scene************
        //Creating the word bank
        //Color myColor= Color.rgb(128,0,0); <-never use????
        String myword="book"; //<-- the word the user has to guess
        char[] myWordArray=myword.toCharArray();

        Font myfont=new Font(40);

        // For guessing the characters of the words
        String lowercase_letter_String="abcdefghijklmnopqrstuvwxyz";
        char[] lowercase_letterArray=lowercase_letter_String.toCharArray();
        String uppercase_letter_String="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] uppercase_letterArray=uppercase_letter_String.toCharArray();

        //////Creates the blanks for word guess/////////
        GridPane gp=new GridPane();
        Label[] labels=new Label[16];

        for(int i=0;i<16;i++)
        {
            labels[i]=new Label("_");
            labels[i].setTextFill(Color.rgb(255,255,255));
            labels[i].setFont(myfont);
        }
        int l=0;
        for (int j=0; j<4;j++)
            for (int k=0;k<4;k++)
            {
                gp.add(labels[l],j,k);
                l++;
            }
        gp.setVgap(15);
        gp.setHgap(40);
        //////Creates the blanks for word guess/////////

        //The Interface For player
        Label guessLabel=new Label("Guess:");
        guessLabel.setTextFill(Color.rgb(255,255,255));
        guessLabel.setMaxHeight(2);

        TextField guessField=new TextField();

        Button enterButton=new Button("Enter");
        enterButton.setTextFill(Color.rgb(255,255,255));
        enterButton.setStyle("-fx-background-color: #800000; ");

        HBox user_interface_gs=new HBox();
        user_interface_gs.getChildren().addAll(guessLabel,guessField, enterButton);
        user_interface_gs.setSpacing(15);
        user_interface_gs.setLayoutY(715);

        gp.setLayoutX(150);
        gp.setLayoutY(0);
        gp.setAlignment(Pos.CENTER);
        gp.setVgap(50);

        Group root_ss=new Group(gp, user_interface_gs);

        //Play Scene is created
        Scene PlayScene=new Scene(root_ss, 500, 750,Color.rgb(128,0,0));
        // ********Play scene************

        //Button actions
        PlayButton.setOnAction((e) -> {
            primary.setScene(PlayScene);
            primary.setTitle("Game Screen");
        });

        // input user guess on the screen

                enterButton.setOnAction(e ->{

                    String userWord1=guessField.getText();
                    userGuess=userWord1;

                       /* for ( int k=0;k<4;k++) {
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
