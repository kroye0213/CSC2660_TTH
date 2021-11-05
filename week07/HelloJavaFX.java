
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloJavaFX extends Application{

    public void start(Stage primaryStage){
        Text hello = new Text(150, 250, "Hello, CSC2660 welcome to JavaFX!");
        Text question = new Text(120, 80, "How's it going?");
        
        Group root = new Group(hello, question);
        Scene scene = new Scene(root, 550, 350, Color.HOTPINK);
        primaryStage.setTitle("A JavaFX Demo Feb/25/2021");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
 public static void main(String[] args) {
     launch(args);
 }   
}

