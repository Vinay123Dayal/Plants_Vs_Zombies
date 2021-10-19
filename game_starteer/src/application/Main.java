package application;
	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	public static Stage starting=new Stage();
	Button a=new Button();
	levels starting_game=new levels();
	@Override
	public void start(Stage primaryStage) throws IOException {
		starting.setTitle("This is the first explanation");
		Parent root=FXMLLoader.load(getClass().getResource("main_menu.fxml"));
		Scene ax=new Scene(root);
		starting.setScene(ax);
		starting.setResizable(false);
		starting.show();
	}
	public void endgame() {
		System.exit(0);
	}
	
	public void newgame() throws IOException {
		//Stage primaryStage=new Stage();
		Parent root=FXMLLoader.load(getClass().getResource("new_menu.fxml"));
		Scene ax=new Scene(root);
		starting.setScene(ax);
		starting.setResizable(false);
		starting.show();
	}
	public void loadgame(
			 
			    ) throws IOException {
		//Stage primaryStage=new Stage();
		Parent root=FXMLLoader.load(getClass().getResource("loadgame_window.fxml"));
		Scene ax=new Scene(root);
		//Stage window=(Stage)((Node)a1.getSource()).getScene().getWindow();
		starting.setScene(ax);
		starting.setResizable(false);
		starting.show();
	}
	public void startlevel1() throws Exception {
		starting_game.start(starting);
	}
	public void get_to_main() throws IOException {
		start(starting);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
