package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Node;
public class Startgame_controller implements Initializable {

	@FXML
	protected Button startgame;
	@FXML
	protected ChoiceBox<String> chooselevel;
	@FXML
	protected Button resume;
	@FXML
	protected Label message;
	
	List<String> list = new ArrayList<String>();
	
	ObservableList<String> observableList = FXCollections.observableList(list);
	
	@Override
	public void initialize(URL url,ResourceBundle rb) {
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		chooselevel.setItems(observableList);
		
		startgame.setOnAction(new EventHandler<ActionEvent>() {
		    @Override 
		    public void handle(ActionEvent event) {
		    	try {
					startgame(event);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		});
		
	}
	
	public void startgame(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
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
