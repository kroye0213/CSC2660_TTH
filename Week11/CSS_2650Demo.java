//package gui_controlDemo;
//Create a javafx application like so:
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight; //
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
//Create a javafx application like so:
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight; //
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

public class CSS_2650Demo extends Application{
    private GridPane root;
    private Label lblOne, lblTwo;
    private Button btnOne, btnTwo, btnExit;
    private CheckBox chkBox01, chkBox02;
    private RadioButton rdBtnComputer, rdBtnTypewriter;
    private String user_Computer, user_Typewriter;
    private Text displayStmt;
    public void start(Stage primaryStage){

        primaryStage.setTitle("Styling JavaFX APP");
        primaryStage.setFullScreen(true);


        root = new GridPane();
        
        user_Computer = "Its the new era, we save the trees!";
        user_Typewriter = "They kill our forests";
        displayStmt = new Text(user_Computer);
        lblOne = new Label("Wonderful to style the APP, it looks nice!");
        btnOne = new Button("Color Purple");
        btnTwo = new Button("Color Yellow");
        rdBtnComputer = new RadioButton("Computer");
        
        btnExit = new Button("Close");
        root.add(lblOne, 0, 0);
        root.add(btnOne, 0, 1);
        root.add(btnTwo, 0, 2);
        root.add(btnExit, 0, 3);
    
        //Add CHECKBOXES
        chkBox01 = new CheckBox("Whatever is the case maybe");
        chkBox02 = new CheckBox("Italic Letters");
        root.add(chkBox01, 1, 1);
        root.add(chkBox02, 1, 2);
        root.add(rdBtnComputer, 1, 3);

        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
		root.setVgap(10);
        //BUTTONS multiple source events
		btnOne.setOnAction((event) -> {
            if(event.getSource() == btnOne)
                root.setStyle("-fx-background-color: purple");

        });
        btnTwo.setOnAction((event) ->{
            if(event.getSource() == btnTwo)
            root.setStyle("-fx-background-color: yellow");

        } );
        
        //CHECKBOXES
        chkBox01.setOnAction((event) ->{
        if(chkBox01.isSelected())
        	chkBox01.setFont(new Font("Arial", 20));
        });
        
        chkBox02.setOnAction((event) -> {
        	if(chkBox02.isSelected())
        		chkBox02.setFont(new Font("Bold", 40));
        });
        

        //EXIT BUTTON
        btnExit.setOnAction((event) ->{
            if(event.getSource() == btnExit)
            System.exit(0);

        } );
        Scene scene01 = new Scene(root, 450, 550);
        scene01.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene01);
        scene01.getStylesheets().add("css_demo/styles.css");
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}