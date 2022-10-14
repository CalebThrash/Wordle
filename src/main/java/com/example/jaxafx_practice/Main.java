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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.control.*;
import javafx.scene.Group;


public class Main extends Application {
    String userGuess;
    @Override
    public void start(Stage primaryStage) throws IOException {


        //Start scene
        Label StartSceneLabel = new Label("Start screen");
        Button PlayButton = new Button("Play");
        //PlayButton.setOnAction((e) -> primaryStage.setScene(PlayScene));
        VBox layout1 = new VBox(1.0);
        layout1.setAlignment(Pos.CENTER);
        layout1.getChildren().addAll(StartSceneLabel, PlayButton);
        Scene StartScene = new Scene(layout1, 500, 750.0);

        //Play scene
        Color myColor= Color.rgb(128,0,0);
        String myword="book";
        char[] myWordArray=myword.toCharArray();
        Font myfont=new Font(40);
        String letterString="abcdefghijklmnopqrstuvwxyz";
        char[] letterArray=letterString.toCharArray();
        primaryStage.setTitle("Game Screen");
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
        Label guessLabel=new Label("Guess:");
        guessLabel.setTextFill(Color.rgb(255,255,255));
        TextField guessField=new TextField();
        HBox hbox=new HBox();
        Button enterButton=new Button("Enter");

        hbox.getChildren().addAll(guessLabel,guessField, enterButton);
        enterButton.setTextFill(Color.rgb(255,255,255));
        enterButton.setStyle("-fx-background-color: #800000; ");
        hbox.setSpacing(10);
        Group root=new Group(gp, hbox);
        gp.setLayoutX(150);
        gp.setLayoutY(0);
        hbox.setLayoutY(715);
        Scene PlayScene=new Scene(root, 500, 750,Color.rgb(128,0,0));
        gp.setAlignment(Pos.CENTER);

        //Button actions
        PlayButton.setOnAction((e) -> primaryStage.setScene(PlayScene));
        enterButton.setOnAction(e ->{

            final String userWord1=guessField.getText();
            userGuess=userWord1;
        });

        primaryStage.setScene(StartScene);
        primaryStage.show();

    }


    public static void main() {
      launch();
      }
}
