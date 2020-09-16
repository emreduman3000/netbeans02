/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w5_testfx;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author emreduman
 */
public class FXMLw5testcontroller implements Initializable {
    
   
    /**
     * Initializes the controller class.
     */
    @FXML
    private Label lblOutput;

   
    
    @FXML
    public void click(ActionEvent event) 
    {
        lblOutput.setText("aaaaa Hello, World!");
        
    }
   
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
        
        
    }   
}
