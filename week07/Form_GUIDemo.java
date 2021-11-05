import java.time.LocalDate;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Form_GUIDemo extends Application{

private GridPane gridp;
private Label lblStudentID;
private Label lblFirstName;
private Label lblLastName;
private TextField txtStudentID;
private TextField txtFirstName;
private TextField txtLastName;
private Button btnSubmit;
private DatePicker dtDateCal;
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CSC2650 Object Oriented Progamming SP2021 - JavaFX");
        gridp = new GridPane();


        //Add labels and text fields
        lblStudentID = new Label("Student ID: ");
        gridp.add(lblStudentID, 0, 0);

        txtStudentID = new TextField();
        gridp.add(txtStudentID, 1, 0);
        
        lblFirstName = new Label("First Name: ");
        gridp.add(lblFirstName, 0, 1);

        txtFirstName = new TextField();
        gridp.add(txtFirstName, 1, 1);

        lblLastName = new Label("Last Name: ");
        gridp.add(lblLastName, 0, 2);

        txtLastName = new TextField();
        gridp.add(txtLastName, 1, 2);

        btnSubmit = new Button("Submit");
        gridp.add(btnSubmit, 1, 3);

        dtDateCal = new DatePicker(LocalDate.now());
        gridp.add(dtDateCal, 2, 0);
        //Move controls to center
        gridp.setAlignment(Pos.CENTER);

        Scene scene01 = new Scene(gridp, 500, 380);
        primaryStage.setScene(scene01);
        primaryStage.show();
    }

    
    
    
    public static void main(String[] args) {
        

        launch();
    }
}
