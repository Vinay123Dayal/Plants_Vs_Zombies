package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;
public class Createaccount_controller implements Initializable {

	@FXML
	protected Button next;
	
	
	
	
	
	
	@Override
	public void initialize(URL url,ResourceBundle rb) {
		next.setOnAction(new EventHandler<ActionEvent>() {
		    @Override 
		    public void handle(ActionEvent event) {
		    	try {
					next(event);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		});
		
	}
	
	public void next(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Mainmenu.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();

	}
	
	
	public void exit(ActionEvent event) {
		System.exit(0);
	}

	
	
	
	
	
}
