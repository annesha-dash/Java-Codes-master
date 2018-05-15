package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


/**
 * Created by sheeh on 11/18/2016.
 */
public class Login {

    public static GridPane login(){

        GridPane layout = new GridPane();

        layout.setPadding(new Insets(10 , 10 , 10 , 10));

        layout.setVgap(10);
        layout.setHgap(10);


        // Username in gridpane

        Label label1 = new Label("Username");
        layout.setConstraints(label1, 0 , 0);

        TextField text1 = new TextField();

        text1.setPromptText("Username");

        layout.setConstraints(text1 , 1 , 0);

        //Password in gridpane

        Label label2 = new Label("Password");
        layout.setConstraints(label2, 0 , 1);

        TextField text2 = new TextField();

        text2.setPromptText("Password");
        layout.setConstraints(text2 , 1 , 1);

        CheckBox remember = new CheckBox("Remember me");
        layout.setConstraints(remember , 1 , 2);


        //Button

        Button button1 = new Button("login");
        layout.setConstraints(button1 , 2, 2);
        button1.setOnAction(e -> {
        boolean a = LoginChecker.login(text1.getText() , text2.getText());
            if(a){
                System.out.println("Logged in as :" + text1.getText());
            }
            else {
                System.out.println("Invalid password. ");
            }
        });


        layout.getChildren().addAll(label1, label2 , text1 , text2 , remember , button1);
        layout.setAlignment(Pos.CENTER);
        return layout;

    }
}
