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

public class Playscene {

    static TextField guessField = new TextField();
    public static Scene playscence (){

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

        TextField guessField = new TextField();

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



return PlayScene;

    }
}
