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
public class AlartBox {

    static  Stage window;
    public static void display(String name , String massage) {
         window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(name);

        window.setMinWidth(250);

        Label label = new Label(massage);
        Button button = new Button("close");
        window.setOnCloseRequest(e ->{
            e.consume();
            close(Confirm.display("Confirm", "Are you sure?"));

        });


        button.setOnAction(e -> close(Confirm.display("Confirm", "Are you sure?")) );

        VBox layout = new VBox(10);

        layout.getChildren().addAll(label,button);
        layout.setAlignment(Pos.CENTER);


        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();





    }

     private static void close(Boolean result){

        if(result){
            window.close();
        }
    }


}
