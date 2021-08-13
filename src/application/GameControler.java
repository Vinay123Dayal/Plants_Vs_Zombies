package application;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

/**
 * @author YanhanLyu, Lucy Wu
 * Class that updates the status of game in general
 */

public class GameControler implements EventHandler<KeyEvent> {
    final private double FRAMES_PER_SECOND = 60.0;
    private int difficulty;
    private Lawn lawn;
    private Timer timer;

    /**
     * Constructor
     * @param difficulty the difficulty level of this game
     * @param player the player
     * @param enemy the enemy
     * @param initStage the stage
     */
    public GameControler(int difficulty, Lawn lawn) {
        this.difficulty = difficulty;
        this.lawn = lawn;
    }

    /**
     * initialize timer
     */
    public void initialize() {
        this.startTimer();

    }

    /**
     * run starterTimer
     */
    private void startTimer() {
        this.timer = new java.util.Timer();
        TimerTask timerTask = new TimerTask() {
            public void run() {
                Platform.runLater(new Runnable() {
                    public void run() {
                        updateAnimation();
                    }
                });
            }
        };

        long frameTimeInMilliseconds = (long)(1);
        this.timer.schedule(timerTask, 0, frameTimeInMilliseconds);
    }

   

    /**
     * Update animation in this method
     */
    private void updateAnimation() {
            ArrayList<Plant> listOfPlants = lawn.getPlants();
            ArrayList<Zombie> listOfZombies = lawn.getZombies();
            ArrayList<Pea> listOfPeas = lawn.getPeas();
           
            // Update plant animation
            for (Plant plant : listOfPlants) {
                plant.step();
            }
           
        }


    
   
   

    /**
     * handle events
     */
    @Override
    public void handle(KeyEvent keyEvent) {

    }
}