package application;

import java.util.Random;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Sun{
	
	
	
	private int startx;
	private int endx;
	private int starty;
	private int endy;
	private TranslateTransition t2;
	
	public Sun() {
		//super();
		startx = 0;
		starty = 0;
		endx = 0;
		endy =0;
		
	}
	
	public void stop_sun() {
		t2.stop();
	}
	
	
	public void fall_sun(ImageView sun) {
		Random rand = new Random();
		startx = rand.nextInt(300)+40;
		starty = -200;
		endx = startx;
		endy =rand.nextInt(200)+40;
		t2 = new TranslateTransition();
		t2.setFromX(startx);
		t2.setFromY(starty);
		t2.setRate(2);
		t2.setDuration(Duration.seconds(10));
		t2.setNode(sun);
		t2.setToX(endx);
		t2.setToY(endy);
		t2.setCycleCount(1);
		t2.play(); 
	}
	
}
