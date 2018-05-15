package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window= primaryStage;

        Button button1 = new Button("Click me!");
        button1.setOnAction(e -> AlartBox.display( "Alart" , "Try your Luck!" ) );
        Label label1 = new Label("This is the first scene");

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label1,button1);

        Scene scene = new Scene(layout, 640,400);
        window.setScene(scene);
        window.setTitle("First screen");
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
