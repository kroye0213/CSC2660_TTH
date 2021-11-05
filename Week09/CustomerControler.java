import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;

public class CustomerControler {

    //@FXML
    //private Tooltip tip = new Tooltip("UpdateCost");
    //btnSubmit.setTooltip(tip);
    //myButton.setToolTip(tip);

    @FXML
    private Label lblDisplayCustomer;

    @FXML
    private TextField txtCustomerID;

    @FXML
    private TextField txtFirstName;

    @FXML
    private TextField txtLastName;

    @FXML
    private TextField txtEmailAddress;

    @FXML
    private TextField txtCustBal;

    @FXML
    private Button btnSubmit;
    
    @FXML
    private Tooltip tip;

    @FXML
    private DatePicker dtPicker;

    @FXML
    private void initalize(){
        customerDataDisplayed();

    }
    

public void customerDataDisplayed(){
    if (txtCustomerID.getText() != null && txtCustomerID.getText() != "") {
        lblDisplayCustomer.setText(dtPicker.getValue() + "\n" + txtCustomerID.getText()
                + "\n" + txtFirstName.getText() + "\n" + txtLastName.getText() + "\n" + txtEmailAddress.getText() + "\n" + txtCustBal.getText());

    }
    else{
    lblDisplayCustomer.setText("\nYou need to enter a customer ID");
    }
    
}
@FXML
public void addNewCustomer(ActionEvent event){
    try(BufferedWriter custbWriter = new BufferedWriter(new FileWriter("customers.txt", true))) {
        custbWriter.write("\nCurrent Date: " + dtPicker.getValue());
        custbWriter.write("\nCustomer ID: " + txtCustomerID.getText());        
        custbWriter.write("\nFirst Name: " + txtFirstName.getText());        
        custbWriter.write("\nLast Name: " + txtLastName.getText());        
        custbWriter.write("\nEmail: " + txtEmailAddress.getText());        
        custbWriter.write("\nBalence: " + txtCustBal.getText());        

        custbWriter.close();
    } catch (IOException exc) {
       exc.printStackTrace();
    }
}
}
