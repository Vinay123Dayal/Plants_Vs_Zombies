package application;

import javafx.scene.control.Label;

public class Score {
	
	
	
	public Score() {
		//super();
		
		
	}
	public void addcoin(Label score) {
		score.setText(Integer.toString(Integer.parseInt(score.getText())+50));
	}
	
}
