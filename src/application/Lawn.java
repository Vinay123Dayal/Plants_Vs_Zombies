package application;

import java.util.ArrayList;

public class Lawn {
	int sun = 2000;
	private ArrayList<Plant> listPlants = new ArrayList<Plant>();
    private ArrayList<Pea> listPeas = new ArrayList<Pea>();
    private ArrayList<Zombie> listZombies = new ArrayList<Zombie>();
    
    
    public Lawn() {
    	
    }
    
    public int getsun() {
    	return sun;
    }

	public ArrayList<Plant> getPlants() {
		return listPlants;
	}
	
	public ArrayList<Pea> getPeas() {
		return listPeas;
	}
	
	public ArrayList<Zombie> getZombies() {
		return listZombies;
	}
	
	public void addZombie(Zombie zombie) {
		listZombies.add(zombie);
	}
	
	public void addPea(Pea pea) {
		listPeas.add(pea);
	}
	
	public void addPlant(Plant plant) {
		listPlants.add(plant);
	}

	public void setsun(int i) {
		this.sun+=i;
		
	}
}
