package animal_entities;

import java.util.LinkedHashSet;
import java.util.Set;

import plant_entities.Plant;

public class Omnivore  extends Animal{

private Set<Plant> plantDiet = new LinkedHashSet<>();
private double maxFoodSize;

public Omnivore(String name) {
	super(name);
	// TODO Auto-generated constructor stub
}
public Omnivore(String name,double weight,double height,double length) {
	super(name,weight,height,length);
}
public Set<Plant> getPlantDiet() {
	return plantDiet;
}
public void setPlantDiet(Set<Plant> plantDiet) {
	this.plantDiet = plantDiet;
}
public double getMaxFoodSize() {
	return maxFoodSize;
}
public void setMaxFoodSize(double maxFoodSize) {
	this.maxFoodSize = maxFoodSize;
}
public void addPlantToDiet(Plant plant) {
	plantDiet.add(plant);
}
@Override
public String toString() {
	return "Omnivore [plantDiet=" + plantDiet + ", maxFoodSize=" + maxFoodSize + ", getPlantDiet()=" + getPlantDiet()
			+ ", getMaxFoodSize()=" + getMaxFoodSize() + ", getName()=" + getName() + ", getWeight()=" + getWeight()
			+ ", getHeight()=" + getHeight() + ", getLength()=" + getLength() +"]";
}



}
