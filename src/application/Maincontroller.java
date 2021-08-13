package application;

import java.net.URL;
import java.util.Collection;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
public class Maincontroller implements Initializable {
	
	@FXML
	ImageView peashooter;
	@FXML
	ImageView twopeashooter;
	@FXML
	ImageView wallnut;
	@FXML
	ImageView sunflower;
	@FXML
	ImageView potatomine;
	@FXML
	ImageView lawnmover1;
	@FXML
	ImageView lawnmover2;
	@FXML
	ImageView lawnmover3;
	@FXML
	ImageView lawnmover4;
	@FXML
	ImageView lawnmover5;
	@FXML
	Label score;
	@FXML
	StackPane sp_peashooter;
	@FXML
	StackPane sp_wallnut;
	@FXML
	StackPane sp_potatomine;
	@FXML
	StackPane sp_twopeashooter;
	@FXML
	StackPane sp_sunflower;
	@FXML
	AnchorPane anchorpane;
	
	@Override
	public void initialize(URL url,ResourceBundle rb){

		Lawn lawn = new Lawn();
		System.out.println(peashooter.getImage()+"    jjjjj");
		//sp_peashooter.setOnDragDetected(new PlantDragController(sp_peashooter,peashooter.getImage()));
		
		//anchorpane.setOnDragOver(new PlantDragOverController());
		//anchorpane.setOnDragDropped(new PlantDragDropController(lawn));
		
		sp_peashooter.setOnDragDetected(new EventHandler <MouseEvent>()
        {
            public void handle(MouseEvent event)
            {
                dragDetected(event);
            }
        });
		
		anchorpane.setOnDragOver(new EventHandler <DragEvent>()
	        {
	            public void handle(DragEvent event)
	            {
	                dragOver(event);
	            }
	       });
		
		anchorpane.setOnDragDropped(new EventHandler <DragEvent>()
	        {
	            public void handle(DragEvent event)
	            {
	                dragDropped(event);
	            }
	        });
		
		 
	}
	
	private void dragDetected(MouseEvent event)
    {
        Dragboard dragboard = sp_peashooter.startDragAndDrop(TransferMode.COPY_OR_MOVE);
 
        // Add the source text to the Dragboard
        ClipboardContent content = new ClipboardContent();
        content.putString("peashooter");
        content.putImage(peashooter.getImage());
        dragboard.setContent(content);
        event.consume();
    }
 
    private void dragOver(DragEvent event)
    {
        // If drag board has a string, let the event know that
        // the target accepts copy and move transfer modes
        event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        event.consume();
    }
 
    private void dragDropped(DragEvent event)
    {
    	 Dragboard dragboard = event.getDragboard();
    	 
    	 ImageView ab = new ImageView(dragboard.getImage()); 
    	 ab.setX(event.getX());
    	 ab.setY(event.getY());
    	 //dragboard.getString());
             anchorpane.getChildren().add(ab);
  
             
  
         event.consume();
    }
 
   
	


	
	
	
	
	
}
