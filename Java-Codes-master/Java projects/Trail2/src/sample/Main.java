package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;

        Scene scene = new Scene(new Login().login(), 640 , 400);

        window.setScene(scene);
        window.show();

    }


    public static void main(String[] args) {

        launch(args);
    }
}
