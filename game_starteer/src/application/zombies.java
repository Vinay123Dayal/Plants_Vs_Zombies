package application;

public class zombies {
	protected int health;
	protected String type;
	protected int positionx;
	protected int positiony;
	zombies(int health, String type){
		this.health=health;
		this.type=type;
	}
	public void attack() {
		
	}
}
class normal_zombie extends zombies{

	normal_zombie(int health, String type) {
		super(health, type);
		// TODO Auto-generated constructor stub
	}

}
class bucket extends zombies{

	bucket(int health, String type) {
		super(health, type);
		// TODO Auto-generated constructor stub
	}
}
class cone extends zombies{

	cone(int health, String type) {
		super(health, type);
		// TODO Auto-generated constructor stub
	}
}
class flag_zombie extends zombies{

	flag_zombie(int health, String type) {
		super(health, type);
		// TODO Auto-generated constructor stub
	}
}
class shield_zombie extends zombies{

	shield_zombie(int health, String type) {
		super(health, type);
		// TODO Auto-generated constructor stub
	}
}