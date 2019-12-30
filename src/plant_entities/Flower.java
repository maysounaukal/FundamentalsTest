package plant_entities;

public class Flower extends Plant{
	private Scent smell;

	public Flower(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public Flower(String name, Scent smell) {
		super(name);
		this.smell = smell;
	}
	public Flower(String string, double d, Scent smell) {
		// TODO Auto-generated constructor stub
		super(string,d);
		this.smell = smell;
	}
	public Scent getSmell() {
		return smell;
	}
	public void setSmell(Scent smell) {
		this.smell = smell;
	}
	@Override
	public String toString() {
		return "Flower [smell=" + smell + ", getSmell()=" + getSmell() + ", getName()=" + getName() + ", getHeight()="
				+ getHeight() + "]";
	}

	

}
