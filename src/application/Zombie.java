package application;

abstract public class Zombie{

	public abstract void step();

	public abstract int getImagePositionX();

	public abstract int getRow();

	public abstract int getColumn();

	public abstract int getHealth();

	public abstract void setHealth(int i);

	public abstract void removeImage();

	public abstract void setSpeed(int i);

	public abstract int getPower();

	public abstract int getISpeed();

}
