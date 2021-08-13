package application;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.StackPane;



public class PlantDragController implements EventHandler<MouseEvent> {
    private StackPane stackPane;
    private Image image;

    public PlantDragController (StackPane stackPane, Image image) {
        this.stackPane = stackPane;
        this.image = image;
    }
    @Override
    public void handle(MouseEvent event) {
        Dragboard drag = this.stackPane.startDragAndDrop(TransferMode.MOVE);
        ClipboardContent content = new ClipboardContent();
        String id = this.stackPane.getId();
        System.out.println(id);
        content.putImage(this.image);
        if (id == "sp_peashooter") {
            content.putString("peashooter");
        } else if (id == "sp_sunflower"){
            content.putString("sunflower");
        } else if (id == "sp_wallnut"){
            content.putString("sp_wallnut");
        } else if (id == "sp_potatoMine"){
            content.putString("sp_potatoMine");
        }
        System.out.println(content+"hhhh");
        drag.setContent(content);
        event.consume();

    }

}