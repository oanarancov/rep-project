package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
    Scene scene1, scene2, scene3;
    /*public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
*/
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) throws Exception {
       window = primaryStage;

       Label label1 = new Label("Welcome to Cinema App! Choose an option!");
       Label label2 = new Label("REGISTRATION WINDOW!");
       Label label3 = new Label ("LOG IN WINDOW");

       Button button1 = new Button ("Registration");
       Button button2 = new Button ("Log in");
       Button button3 = new Button ("Go back to the first window!");
       Button button4 = new Button ("Go back to the first window!");

        button1.setOnAction(e -> window.setScene(scene2));
        button2.setOnAction(e -> window.setScene(scene3));
        button3.setOnAction(e -> window.setScene(scene1));
        button4.setOnAction(e -> window.setScene(scene1));

        VBox layout1 = new VBox(40);
        layout1.getChildren().addAll(label1, button1, button2);
        scene1 = new Scene(layout1, 400, 300);

        VBox layout2 = new VBox(40);
        layout2.getChildren().addAll(label2, button3);
        scene2 = new Scene(layout2,400, 300);


        VBox layout3 = new VBox(40);
        layout3.getChildren().addAll(label3, button4);
        scene3 = new Scene(layout3,400, 300);


        //Display scene 1 at first
        window.setScene(scene1);
        window.setTitle("Cinema App");
        window.show();

    }

}
