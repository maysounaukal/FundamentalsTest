package plant_entities;

public class Weed extends Plant{
	private double area;
	public Weed(String name) {
		super(name);
	}
	public Weed(String name, double area) {
		super(name);
		this.area = area;
	}
	public Weed(String string, double d, double area) {
		// TODO Auto-generated constructor stub
		super(string,d);
		this.area = area;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Weed [area=" + area + ", getArea()=" + getArea() + ", getName()=" + getName() + ", getHeight()="
				+ getHeight() + "]";
	}
	

	

}
