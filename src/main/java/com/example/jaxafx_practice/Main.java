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
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.*;
import javafx.scene.Group;
import javafx.scene.text.TextAlignment;


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


        StartSceneLabel.setMinWidth(100);
        StartSceneLabel.setMinHeight(60);
        StartSceneLabel.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 28));
        StartSceneLabel.setStyle("-fx-background-color: #381d52;");
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
        Choose_word wordToGuess=new Choose_word();


        // ********Start scene************

        // ********Play scene************
        //Creating the word bank
        //Color myColor= Color.rgb(128,0,0); <-never use????
        /*String myword="book"; //<-- the word the user has to guess
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




        user_interface_gs.getChildren().addAll(guessLabel,guessField, enterButton, BackButton);
        user_interface_gs.setSpacing(15);
        user_interface_gs.setLayoutY(715);

        gp.setLayoutX(150);
        gp.setLayoutY(0);
        gp.setAlignment(Pos.CENTER);
        gp.setVgap(50);

        Group root_ss=new Group(gp, user_interface_gs);

        //Play Scene is created
        Scene PlayScene=new Scene(root_ss, 500, 750,Color.rgb(56,29,82));
        // ********Play scene************

         */

        //Button actions
        PlayButton.setOnAction((e) -> {
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
        // input user guess on the screen

        playscene.enterButton.setOnAction(e ->{

            String userWord1=playscene.guessField.getText();
            userGuess=userWord1;
            if(userWord1.length()==4) {
            playscene.displayWord(userWord1.toLowerCase(),wordToGuess.getWord());
            playscene.count +=1;
            }
            if (playscene.count==4){
                primary.setScene((Resultscene.loser(wordToGuess.getWord())));
            }



        });


        primary.setScene(StartScene);
        primary.show();

    }


    public static void main() {
        launch();
    }
}

