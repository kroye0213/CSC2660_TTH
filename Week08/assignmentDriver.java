//package GUI_Assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class assignmentDriver extends Application {
    private AnchorPane root;
    private Stage primaryStage;
    
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Styling JavaFX APP");
        initalizeBootLayout();
        
    }
   
    public void initalizeBootLayout(){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(assignmentDriver.class.getResource("Styling JavaFX APP.fxml"));

        try {
            root = (AnchorPane) loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
            Scene scene01 = new Scene(root);
            primaryStage.setScene(scene01);
            primaryStage.show();
        }

    public static void main(String[] args) {
        launch();
        }
    
}
