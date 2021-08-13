package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Main extends Application { 
	

	// launch the application 
	public void start(Stage stage) throws Exception 
	{ 
		Parent root1 = FXMLLoader.load(getClass().getResource("Mainmenu.fxml"));
		Scene scene = new Scene(root1, 968, 623);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		
		//stage.setResizable(false);
		stage.show();
	}
	// Main Method 
	public static void main(String args[]) 
	{ 

		// launch the application 
		launch(args); 
	} 
} 
