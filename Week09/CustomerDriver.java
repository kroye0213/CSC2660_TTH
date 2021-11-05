import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CustomerDriver extends Application{
    private AnchorPane rootLayout;
    private Stage primaryStage;

    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Customer Data App");
        initializeRootLayout();
    }
    public void initializeRootLayout(){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CustomerData.fxml"));

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
        launch(args);
    }

}