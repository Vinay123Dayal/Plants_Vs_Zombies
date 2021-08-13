package application;

abstract public class Plant {

	public abstract int getRow();

	public abstract int getColumn();
	
	public abstract int getPrice();

	public abstract Object getName();

	
}

class Peashooter extends Plant{

	public int row;
	public int col;
	public int price;
	public String name;
	public Peashooter(int row,int col) {
		this.row = row;
		this.col = col;
		price = 100;
	}

	@Override
	public int getRow() {
		return row;
	}

	@Override
	public int getColumn() {
		return col;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}
}

class Sunflower extends Plant {
	
	private int row;
	private int col;
	private int price ;
	public String name;
	
	public Sunflower(int row,int col) {
		this.row = row;
		this.col = col;
		price = 50;
	}

	@Override
	public int getRow() {
		// TODO Auto-generated method stub
		return row;
	}

	@Override
	public int getColumn() {
		// TODO Auto-generated method stub
		return col;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}

	

}

class Wallnut extends Plant{

	public int row;
	public int col;
	public int price;
	public String name;
	public Wallnut(int row,int col) {
		this.row = row;
		this.col = col;
		price = 100;
	}

	@Override
	public int getRow() {
		return row;
	}

	@Override
	public int getColumn() {
		return col;
	}

	@Override
	public int getPrice() {
		return price;
	}
	@Override
	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}

}





