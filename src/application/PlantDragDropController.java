package application;


import javafx.event.EventHandler;
import javafx.scene.input.DragEvent;

public class PlantDragDropController implements EventHandler<DragEvent> {
  
    Lawn lawn;
    //private Sun sun;

    public PlantDragDropController(Lawn lawn){
        this.lawn = lawn;
    }
    @Override
    public void handle(DragEvent event) {
        int row=1;
        int column=(int)event.getX()-40;
        String type = event.getDragboard().getString();
        System.out.println();

        if (event.getX()>=60 && event.getX() <= 780) {
            if (event.getY() >= 135 && event.getY() <= 685) {
                if (event.getY() >= 135 && event.getY() <= 245){
                    row=1;
                } else if (event.getY() < 355) {
                    row=2;
                } else if (event.getY() < 465) {
                    row=3;
                } else if ( event.getY() < 575){
                    row=4;
                } else if (event.getY() < 685) {
                    row=5;
                }

                if (event.getX() >= 60 && event.getX() <= 140){
                    column = 1;
                } else if (event.getX()<=211) {
                    column = 2;
                } else if (event.getX()<=300) {
                    column = 3;
                }else if (event.getX()<=380){
                    column = 4;
                } else if (event.getX()<=460) {
                    column = 5;
                } else if (event.getX()<=540) {
                    column = 6;
                } else if (event.getX()<=620) {
                    column = 7;
                } else if (event.getX()<=700) {
                    column = 8;
                }else if (event.getX()<=780) {
                    column = 9;
                }

                boolean add = true;
                
                System.out.println(row+" "+column);
                for (Plant plant : lawn.getPlants()) {
                    if (plant.getRow() == row && plant.getColumn() == column) {
                        add = false;
                    }
                }

                if (add) {
                    switch (type) {
                        case "peashooter":
                            if (this.lawn.getsun() >= 100){
                                Peashooter peashooter = new Peashooter(row, column);
                                lawn.addPlant(peashooter);
                                lawn.setsun(lawn.getsun() - peashooter.getPrice());
                            }

                            break;
                        case "wallnut":
                            if (this.lawn.getsun() >= 50) {
                                Wallnut wallnut = new Wallnut(row, column);
                                lawn.addPlant(wallnut);
                                lawn.setsun(lawn.getsun() - wallnut.getPrice());
                            }
                            break;
                        case "sunflower":

                            if (this.lawn.getsun() >= 50) {
                                Sunflower sunflower = new Sunflower(row, column);
                                lawn.addPlant(sunflower);
                                lawn.setsun(lawn.getsun() - sunflower.getPrice());
                            }
                            //player.addPlants(star);
                            break;
                    }
                }
            }
        }
        event.consume();
        //System.out.println(player.getPlants().size());
    }

}

