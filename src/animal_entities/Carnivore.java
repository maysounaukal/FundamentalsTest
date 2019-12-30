package animal_entities;

public class Carnivore extends Animal{
	private double maxFoodSize;
	
	public Carnivore(String name) {
		super(name);
	}

	public Carnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
		// TODO Auto-generated constructor stub
	}

	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}

	@Override
	public String toString() {
		return "Carnivore [maxFoodSize=" + maxFoodSize + ", getMaxFoodSize()=" + getMaxFoodSize() + ", getName()="
				+ getName() + ", getWeight()=" + getWeight() + ", getHeight()=" + getHeight() + ", getLength()="
				+ getLength() + "]";
	}


	
	

}
