package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by sheeh on 11/18/2016.
 */
public class Confirm {

    static boolean result;

    public static boolean display(String name , String massage) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(name);

        window.setMinWidth(250);

        Label label = new Label(massage);
        Button button1 = new Button("YES");
        Button button2 = new Button("NO!");
        button1.setOnAction(e ->{

            result=true;
            window.close();
        });

        button2.setOnAction(e ->{

            result=false;
            window.close();
        });

        VBox layout = new VBox(10);

        layout.getChildren().addAll(label,button1, button2);
        layout.setAlignment(Pos.CENTER);


        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();



        return result;

    }


}
