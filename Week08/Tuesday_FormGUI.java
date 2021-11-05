import java.time.LocalDate;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

    /**
 * Tuesday_FormGUI
 */
public class Tuesday_FormGUI extends Application {
    private GridPane  gridp;
    private Label lblStudentId;
    private Label lblFirstName;
    private Label lblLastName;
    private Label lblDisplayStudentData;
    
    private TextField txtStudentID;
    private TextField txtFirstName;
    private TextField txtLastName;

    private Button btnSubmit;
    private DatePicker dtPicker;

    public void start(Stage primaryStage) {
        primaryStage.setTitle("CSC2650 OOP - Java SP2021");

        gridp = new GridPane();
    //Add Labeles
        lblStudentId = new Label("Student ID:");
        gridp.add(lblStudentId, 0, 0);

        lblFirstName = new Label("First Name:");
        gridp.add(lblFirstName, 0, 1);

        lblLastName = new Label("Last Name:");
        gridp.add(lblLastName, 0, 2);

        lblDisplayStudentData = new Label("Student Data: ");
        gridp.add(lblDisplayStudentData,1, 4);

        //Add Text Field
        txtStudentID = new TextField();
        gridp.add(txtStudentID, 1, 0);

        txtFirstName = new TextField();
        gridp.add(txtFirstName, 1, 1);

        txtLastName = new TextField();
        gridp.add(txtLastName, 1, 2);

        //Add Buttons
        btnSubmit = new Button("Submit");
        gridp.add(btnSubmit, 1, 3);

        //Move Controls to the Center
        gridp.setAlignment(Pos.CENTER);

        dtPicker = new DatePicker(LocalDate.now());
        gridp.add(dtPicker, 2,0);

        //Add some padding
        gridp.setHgap(10);
        gridp.setVgap(10);
        gridp.setPadding(new Insets(20, 20, 20, 20));

        //add colors
        gridp.setStyle("-fx-background-color: LIGHTGREEN");

        //Add event action and listener
        btnSubmit.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                System.out.println("\nTodays Date: " + dtPicker.getValue());
                System.out.println("\nStudent ID:" + txtStudentID.getText());
                System.out.println("\nFirst Name:" + txtFirstName.getText());
                System.out.println("\nLast Name:" + txtLastName.getText());
            }
            
            
        });

        //Call display student data method
        btnSubmit.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event) {
                if(txtStudentID.getText() != null && txtStudentID.getText() !=" ") {
                    lblDisplayStudentData.setText(txtStudentID.getText()+ " " + txtFirstName.getText() + " " + txtLastName.getText() + " " + dtPicker.getValue());
                }
                else{
                    lblDisplayStudentData.setText("You need to provide Student ID.");
                }
                
            
            }
        });
     
        

        Scene scene01 = new Scene(gridp, 500, 380);

        primaryStage.setScene(scene01);
        primaryStage.show();
    }//end of start method

    //Add Dispaly Student Data in GUI form
    //public void displayStudentData(ActionEvent event) {
    //    if(txtStudentID.getText() != null && txtStudentID.getText() !=" ") {
    //        lblDisplayStudentData.setText(txtStudentID.getText());
    //    }
    //    else{
    //        lblDisplayStudentData.setText("You need to provide Student ID.");
    //    }
    //    
    //}
public static void main(String[] args) {
    launch(args);
}

    }

    
