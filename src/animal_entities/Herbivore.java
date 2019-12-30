package animal_entities;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import plant_entities.Plant;

public class Herbivore extends Animal{
	private Set<Plant> plantDiet = new LinkedHashSet<>();

	public Herbivore(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public Herbivore(String name, double weight,double height,double length) {
		super(name,weight,height,length);
	}
	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}
	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}
	public void addPlant(Plant plant) {
		plantDiet.add(plant);
	}
	public void printDiet() {
		 Iterator<Plant> itr = plantDiet.iterator();
		 while(itr.hasNext()){
             System.out.println(" Dieet : " + itr.next().toString());
         }
	}
	@Override
	public String toString() {
		return "Herbivore [plantDiet=" + plantDiet + ", getPlantDiet()=" + getPlantDiet() + ", getName()=" + getName()
				+ ", getWeight()=" + getWeight() + ", getHeight()=" + getHeight() + ", getLength()=" + getLength()
				
				+ "]";
	}
	
	

}
