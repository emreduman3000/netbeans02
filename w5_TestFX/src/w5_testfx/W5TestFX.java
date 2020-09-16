/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w5_testfx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author emreduman
 */
public class W5TestFX extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
       
        FlowPane fpane=new FlowPane();
        //fpane.setAlignment(Pos.CENTER);//!!!!
        Button btn1=new Button("one");
        Label lbl1=new Label("this is test application");
        TextField txt1=new TextField("textfield");
        Button btn2=new Button("two");
        Button btn3=new Button("three");
        Button btn4=new Button("four");
        Button btn5=new Button("five");
        Button btn6=new Button("six");
        fpane.getChildren().addAll(btn1,lbl1,txt1,btn2,btn3,btn4,btn5);
        fpane.getChildren().add(btn6);
        fpane.getChildren().add(new Button("seven"));
        
        //Parent root = FXMLLoader.load(getClass().getResource("FXMLw5test.fxml"));
        //Scene sc=new Scene(root);
        //stage.setScene(new Scene(root));
        
        Scene sc=new Scene(fpane,600,300);
        stage.setScene(sc);        
        stage.setTitle("First JAVAFX Application");
        stage.show();
        
     /*
        
    Parent root = FXMLLoader.load(getClass().getResource("FXMLw5test.fxml"));
    stage.setTitle("Testing");
    Scene sc=new Scene(root);
    stage.setScene(sc);
    //stage.setScene(new Scene(root));
    stage.show();
    */
    }    
}
