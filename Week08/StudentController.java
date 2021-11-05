import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class StudentController {

    @FXML
    private TextField txtStudentID;

    @FXML
    private TextField txtFirstName;

    @FXML
    private TextField txtLastName;

    @FXML
    private TextField txtMajor;

    @FXML
    private Button btnSubmit;

    @FXML
    private Button btnClear;

    @FXML
    private DatePicker dtPicker;
    
    @FXML
    private Label lblDisplayStudentData;
    
    @FXML
    private void initalize() {
        displayStudentData();
    }

    public void displayStudentData() {
        if(txtStudentID.getText() != null && txtStudentID.getText() !=" ") {
            lblDisplayStudentData.setText(txtStudentID.getText()+ " " + txtFirstName.getText() + " " + txtLastName.getText() + " " + dtPicker.getValue());
        }
        else{
            lblDisplayStudentData.setText("You need to provide Student ID.");
        }
        
    }
}
