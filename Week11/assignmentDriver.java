

import org.graalvm.compiler.phases.common.NodeCounterPhase.Stage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;

public class assignmentDriver extends Application {
    private AnchorPane root;
    private Stage primaryStage;
    
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Styling JavaFX APP");
        //btnAction();
        //chkAction();
        //exitAction();
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
            scene01.setFill(Color.TRANSPARENT);
            primaryStage.setScene(scene01);
            primaryStage.initStyle(StageStyle.TRANSPARENT);
            primaryStage.show();
        }

    public static void main(String[] args) {
        launch();
        }
    
}
