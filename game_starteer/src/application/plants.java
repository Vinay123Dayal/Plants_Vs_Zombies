package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

abstract class plants {
	protected String type;
	protected int power;
	protected int positionx;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getPositionx() {
		return positionx;
	}
	public void setPositionx(int positionx) {
		this.positionx = positionx;
	}
	public int getPositiony() {
		return positiony;
	}
	public void setPositiony(int positiony) {
		this.positiony = positiony;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Image getImageofplant() {
		return Imageofplant;
	}
	public void setImageofplant(Image imageofplant) {
		Imageofplant = imageofplant;
	}
	protected int positiony;
	protected int price;
	protected Image Imageofplant;
	plants(String id,int power, int positionx,int positiony,int price,Image k){
		this.type=id;
		this.Imageofplant=k;
		this.power=power;
		this.positionx=positionx;
		this.positiony=positiony;
		this.price=price;
	}
}
class shooters extends plants{

	shooters(String id, int power, int positionx, int positiony, int price,Image k) {
		super(id, power, positionx, positiony, price, k);
		// TODO Auto-generated constructor stub
	}
	
}
class normal_shooter extends shooters{

	normal_shooter(String id, int power, int positionx, int positiony, int price,Image k) {
		super(id, power, positionx, positiony, price, k);
		// TODO Auto-generated constructor stub
	}
	
}
class triple_shooter extends shooters{

	triple_shooter(String id, int power, int positionx, int positiony, int price, Image k) {
		super(id, power, positionx, positiony, price, k);
		// TODO Auto-generated constructor stub
	}
	
}
class blockers extends plants{

	blockers(String id, int power, int positionx, int positiony, int price, Image k) {
		super(id, power, positionx, positiony, price,k);
		// TODO Auto-generated constructor stub
	}
	
}
class wallnut extends blockers{

	wallnut(String id, int power, int positionx, int positiony, int price,Image k) {
		super(id, power, positionx, positiony, price,k);
		// TODO Auto-generated constructor stub
	}
	
}
class bigwallnut extends blockers{

	bigwallnut(String id, int power, int positionx, int positiony, int price,Image k) {
		super(id, power, positionx, positiony, price,k);
		// TODO Auto-generated constructor stub
	}
	
}
class blasters extends plants{

	blasters(String id, int power, int positionx, int positiony, int price,Image k) {
		super(id, power, positionx, positiony, price,k);
		// TODO Auto-generated constructor stub
	}
	
}
class cherrybomb extends blasters{

	cherrybomb(String id, int power, int positionx, int positiony, int price,Image k) {
		super(id, power, positionx, positiony, price,k);
		// TODO Auto-generated constructor stub
	}
	
}
class potatomine extends blasters{

	potatomine(String id, int power, int positionx, int positiony, int price,Image k) {
		super(id, power, positionx, positiony, price,k);
		// TODO Auto-generated constructor stub
	}
	
}
class sungivers extends plants{

	sungivers(String id, int power, int positionx, int positiony, int price,Image k) {
		super(id, power, positionx, positiony, price,k);
		// TODO Auto-generated constructor stub
	}
	
}
class bigsungiver extends sungivers{

	bigsungiver(String id, int power, int positionx, int positiony, int price,Image k) {
		super(id, power, positionx, positiony, price,k);
		// TODO Auto-generated constructor stub
	}
	
}
class triplesungiver extends sungivers{

	triplesungiver(String id, int power, int positionx, int positiony, int price,Image k) {
		super(id, power, positionx, positiony, price,k);
		// TODO Auto-generated constructor stub
	}
	
}