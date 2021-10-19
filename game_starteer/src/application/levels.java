package application;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class levels extends Application{
	public static double time;
	public static Pane pane=new Pane();
	Stage level_stage=new Stage();
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		pane.setPadding(new Insets(50,50,50,50));
		Image i=new Image("file:lawn12.png");
		ImageView s=new ImageView(i);
		s.autosize();
		pane.getChildren().add(s);
		ArrayList<plants> k=getPlant(1);
		make_Plantpanel(k);
		addingLawnMower(new Image("file:Lawn_mower_2.PNG.png"));
		//GridPane.setConstraints(m1, 1, 1);
		Image zombie=new Image("file:zombies.gif");
		ImageView zomb=new ImageView(zombie);
		zomb.setFitHeight(120);
		zomb.setFitWidth(120);
		zomb.setX(500);
		zomb.setY(320);
		Circle circle = new Circle();  
	    //circle.setCenterX(zomb.getX()-200);  
	    //circle.setCenterY(zomb.getY());  
	    circle.setRadius(10);  
	    circle.setFill(Color.YELLOWGREEN);
	    ImageView peashooter_example=new ImageView(new Image("file:PeaShooter1.png"));
	    peashooter_example.setX(zomb.getX()-250);
	    peashooter_example.setY(zomb.getY());
	    pane.getChildren().add(peashooter_example);
	    setcircle(peashooter_example, circle);
	    pane.getChildren().add(circle);
		pane.getChildren().add(zomb);
		Button bb=new Button("PAUSE");
		bb.setLayoutX(700);
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 
               try {
				makeStage();
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            } 
        }; 
		bb.setOnAction(event);
		pane.getChildren().add(bb);
		Scene s1=new Scene(pane,800,600);
		s.setFitHeight(s1.getHeight());
		s.setFitWidth(s1.getWidth());
		s1.setOnMouseClicked(e->{
			moveforward(zomb);
		});
		AnimationTimer timer=new AnimationTimer() {

			@Override
			public void handle(long now) {
				// TODO Auto-generated method stub
				update(zomb);
				if(circle.getCenterX()<=zomb.getX()) {
					//System.out.println(circle.getCenterX()+"     "+zomb.getX());
					attacking_plant(circle);
				}
				Circle circle = new Circle();
				circle.setFill(Color.YELLOWGREEN);
				setcircle(peashooter_example, circle);
				pane.getChildren().add(circle);
			}
			
		};
		timer.start();
 		level_stage.setScene(s1);
		level_stage.show();
		
	}
	public void update(ImageView a) {
		time+=0.02;
		if(time>=2) {
			moveforward(a);
			time=0;
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
	public void createlevel(int i) {
		
	}
	public void make_Plantpanel(ArrayList<plants> s) {
		int j=0;
		for(int i=0;i<s.size();i++) {
			ImageView k=new ImageView(s.get(i).Imageofplant);
			pane.getChildren().add(k);
			k.setX(k.getX()+j);
			Label ax=new Label();
			ax.setText(Integer.toString(s.get(i).getPrice()));
			pane.getChildren().add(ax);
			ax.setLayoutX(35+j);
			ax.setLayoutY(100);
			ax.getBorder();
			ax.setFont(Font.font("Arial",20));
			ax.setTextFill(Color.web("#FFFFFF"));
			//System.out.println(ax.getText());
			ax.setVisible(true);

			j+=100;
		}
	}
	public ArrayList<plants> getPlant(int i) {
		ArrayList<plants> req=new ArrayList<plants>();
		if(i==1) {
			plants a1=new normal_shooter("NORMAL_SHOOTER",100,610,450,50,new Image("file:Peashooter1.png"));
			plants a2=new bigsungiver("BIG_SUNGIVER",100,610,450,50,new Image("file:SunFlower1.png"));
			req.add(a1);
			req.add(a2);
		}else if(i==2) {
			plants a1=new normal_shooter("NORMAL_SHOOTER",100,610,450,50,new Image("file:Peashooter1.png"));
			plants a2=new bigsungiver("BIG_SUNGIVER",100,600,400,50,new Image("file:SunFlower1.png"));
			plants a3=new wallnut("WALLNUT",150,510,350,50,new Image("file:smallwall.png"));
			req.add(a1);
			req.add(a2);
			req.add(a3);
		}else if(i==3) {
			plants a1=new normal_shooter("NORMAL_SHOOTER",100,610,450,50,new Image("file:Peashooter1.png"));
			plants a2=new bigsungiver("BIG_SUNGIVER",100,600,400,50,new Image("file:SunFlower1.png"));
			plants a3=new wallnut("WALLNUT",150,510,350,50,new Image("file:smallwall.png"));
			plants a4=new bigwallnut("BIGWALLNUT",250,400,300,75,new Image("file:tallwall.png"));
			req.add(a1);
			req.add(a2);
			req.add(a3);
			req.add(a4);
		}else if(i==4) {
			plants a1=new normal_shooter("NORMAL_SHOOTER",100,610,450,50,new Image("file:Peashooter1.png"));
			plants a2=new bigsungiver("BIG_SUNGIVER",100,600,400,50,new Image("file:SunFlower1.png"));
			plants a3=new wallnut("WALLNUT",150,510,350,50,new Image("file:smallwall.png"));
			plants a4=new bigwallnut("BIGWALLNUT",250,400,300,75,new Image("file:tallwall.png"));
			plants a5=new cherrybomb("CHERRYBOMB",0,300,200,75,new Image("file:Cherry_Bomb1.png"));
			req.add(a1);
			req.add(a2);
			req.add(a3);
			req.add(a4);
			req.add(a5);
		}else {
			plants a1=new normal_shooter("NORMAL_SHOOTER",100,610,450,100,new Image("file:Peashooter1.png"));
			plants a2=new bigsungiver("BIG_SUNGIVER",100,600,400,50,new Image("file:SunFlower1.png"));
			plants a3=new wallnut("WALLNUT",150,510,350,75,new Image("file:smallwall.png"));
			plants a4=new bigwallnut("BIGWALLNUT",250,400,300,100,new Image("file:tallwall.png"));
			plants a5=new cherrybomb("CHERRYBOMB",0,300,200,125,new Image("file:Cherry_Bomb1.png"));
			plants a6=new triple_shooter("TRIPLE_SHOOTER",150,200,100,150,new Image("file:Threepeater1.png"));
			req.add(a1);
			req.add(a2);
			req.add(a3);
			req.add(a4);
			req.add(a5);
			req.add(a6);
		}
	return req;
	}
	public void createZombies(ArrayList<zombies>  a) {
		ArrayList<ImageView> result=new ArrayList<ImageView>();
		
	}
	public ArrayList<zombies>getZombies(int i) {
		ArrayList<zombies> a=new ArrayList<zombies>();
		if(i==1) {
			zombies ax=new normal_zombie(100,"normal_zombie");
			zombies a2=new flag_zombie(100,"flag_zombie");
			a.add(ax);
			a.add(a2);
		}else if(i==2) {
			zombies ax=new normal_zombie(100,"normal_zombie");
			zombies a2=new flag_zombie(100,"flag_zombie");
			zombies a1=new bucket(150,"bucket");
			a.add(ax);
			a.add(a2);
			a.add(a1);
		}else if(i==3) {
			zombies ax=new normal_zombie(100,"normal_zombie");
			zombies a2=new flag_zombie(150,"flag_zombie");
			zombies a1=new bucket(150,"bucket");
			zombies a3=new cone(180,"cone");
			a.add(ax);
			a.add(a2);
			a.add(a1);
			a.add(a3);
		}else {
			zombies ax=new normal_zombie(100,"normal_zombie");
			zombies a1=new bucket(150,"bucket");
			zombies a2=new flag_zombie(150,"flag_zombie");
			zombies a3=new cone(180,"cone");
			zombies a4=new shield_zombie(200,"shield_zombie");
			a.add(ax);
			a.add(a2);
			a.add(a1);
			a.add(a3);
			a.add(a4);
		}
		return a;
	}
	public void setcircle(ImageView k,Circle circle) {
		circle.setCenterX(k.getX()+50);
		circle.setCenterY(k.getY()+40);
	}
	public void attacking_plant(Circle circle) {
	    //double k=a.getLayoutX();
		//a.setLayoutX(k-10);
	    circle.setCenterX(circle.getCenterX()+1);
	}
	public void attackkaro(plants s) {
		time+=0.02;
		if(time>=2) {
			ImageView peashooter_example=new ImageView(new Image("file:PeaShooter1.png"));
		    peashooter_example.setX(200);
		    peashooter_example.setY(320);
		    pane.getChildren().add(peashooter_example);
			Circle circle = new Circle();
			circle.setFill(Color.YELLOWGREEN);
			setcircle(peashooter_example, circle);
			pane.getChildren().add(circle);
			attacking_plant(circle);
		}
	}
	public void level1(Stage a) {
		ArrayList<plants> pl=getPlant(1);
		ArrayList<zombies> zm=getZombies(1);
		Image image=new Image("file:Peashooter1.png");
		ImageView m=new ImageView(image);
		GridPane.setConstraints(m, 2, 1);
		Image image1=new Image("file:Sunflower1.png");
	}
	public void moveforward(ImageView a) {
		double k=a.getX();
		a.setX(a.getX()-10);
	}
	public void addingLawnMower(Image k) {
		int x=0;
		for(int i=0;i<4;i++) {
			ImageView s=new ImageView(k);
			//s.setLayoutX(100);
			//s.setLayoutY(100);
			s.setY(100+x);
			s.setX(-10);
			x+=100;
			pane.getChildren().add(s);
		}
	}
	public void makeStage() throws FileNotFoundException{
		Pane T=new Pane();
		Stage new1=new Stage();
        Image image = new Image("file:Pause.jpeg");
        ImageView k=new ImageView(image);
        T.getChildren().add(k);
        Button a1=new Button("Save");
        EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 
               try {
            	   new1.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            } 
        }; 
        a1.setOnAction(event1);
        a1.setLayoutX(135);
        Button a2=new Button("Continue");
        
        EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 
               try {
            	   new1.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            } 
        };
        a2.setOnAction(event2);
        Button a3=new Button("Exit");
        EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 
               try {
				System.exit(0);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            } 
        };
        a3.setOnAction(event3);
        a2.setLayoutX(135);
        a3.setLayoutX(135);
        a1.setLayoutY(0);
        a2.setLayoutY(90);
        a3.setLayoutY(175);
        T.getChildren().add(a1);
        T.getChildren().add(a2);
        T.getChildren().add(a3);
        Scene s2=new Scene(T,300,200);
        new1.setScene(s2);
        new1.show();
	}
}
