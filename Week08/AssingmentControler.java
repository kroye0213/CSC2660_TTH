//package GUI_Assignment;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;

public class AssingmentControler {

    @FXML
    private AnchorPane root;

    @FXML
    private RadioButton rdbtnComputer;

    @FXML
    private Button btnPurple;

    @FXML
    private Button btnYellow;

    @FXML
    private Button btnClose;

    @FXML
    private Label lblTitle;

    @FXML
    private CheckBox chkFont;

    @FXML
    private CheckBox chkItalics;
    
    @FXML
    private void SwitchPurple(){
        btnPurple();
    }
    public void btnPurple(){
        btnPurple.setOnAction((event) -> {
            if(event.getSource() == btnPurple)
                root.setStyle("-fx-background-color: purple");});
    }
    //public void btnSourceEvents(){
        
        //btnYellow.setOnAction((event) ->{
            //if(event.getSource() == btnYellow)
            //root.setStyle("-fx-background-color: yellow");});
        //} 
}