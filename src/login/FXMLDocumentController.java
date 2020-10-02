/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.stage.Stage;

/**
 *
 * @author aleja
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label greeting;
    
    @FXML
    private Label label;

    @FXML
    private Button registryBtn;

    @FXML
    private Button loginBtn;
    
    public void changeScene(ActionEvent event, String fxmlFile) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource(fxmlFile));
        Scene tableViewScene = new Scene(tableViewParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(tableViewScene);
        window.show();
    }
    
    
    public void changeToRegistryView(ActionEvent event) throws IOException{
        changeScene(event, "registryScene.fxml");
    }
    
    public void changeToLogInView(ActionEvent event) throws IOException{
        changeScene(event, "logInScene.fxml");
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}