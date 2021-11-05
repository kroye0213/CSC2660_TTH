import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class StudentDriver extends Application {
    private AnchorPane rootLayout;
    private Stage primaryStage;
    
    public void start(Stage primarystage){
        this.primaryStage = primarystage;
        this.primaryStage.setTitle("Student Editior Application");
        initalizeBootLayout();
    }
    public void initalizeBootLayout(){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(StudentDriver.class.getResource("StudentDemoFXML.fxml"));
    
        try {
            rootLayout = (AnchorPane) loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
            Scene scene01 = new Scene(rootLayout);
            primaryStage.setScene(scene01);
            primaryStage.show();
        }
       
            
    public static void main(String[] args) {
        launch();
    }
}
