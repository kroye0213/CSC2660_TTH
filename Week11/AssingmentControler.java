

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

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
    private void Buttons(){
        btnAction();
    }
    public void btnAction(){
    btnPurple.setOnAction((event) -> {
        if(event.getSource() == btnPurple)
            root.setStyle("-fx-background-color: purple");

    });
    btnYellow.setOnAction((event) ->{
        if(event.getSource() == btnYellow)
        root.setStyle("-fx-background-color: yellow");

    } );
}
    @FXML
    private void Checks(){
        chkAction();
    }
    public void chkAction(){
    chkFont.setOnAction((event) ->{
        if(chkFont.isSelected())
            chkFont.setFont(new Font("Arial", 20));
        });
        
        chkItalics.setOnAction((event) -> {
            if(chkItalics.isSelected())
                chkItalics.setFont(new Font("Bold", 40));
        });
}
    @FXML
    private void Close(){
        exitAction();
    }
    public void exitAction(){
    btnClose.setOnAction((event) ->{
        if(event.getSource() == btnClose)
        System.exit(0);

    } );
}}