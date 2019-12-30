package plant_entities;

public class Bush extends Plant{
private String fruit;
private LeafType leafType;
public Bush(String fruit) {
	super(fruit);
}
public Bush(String fruit, LeafType leafType) {
	super(fruit);
	this.leafType = leafType;
}
public Bush(String fruit, double height, LeafType heart) {
	// TODO Auto-generated constructor stub
	super(fruit,height);
	this.leafType = heart;
}
public String getFruit() {
	return fruit;
}
public void setFruit(String fruit) {
	this.fruit = fruit;
}
public LeafType getLeafType() {
	return leafType;
}
public void setLeafType(LeafType leafType) {
	this.leafType = leafType;
}
@Override
public String toString() {
	return "Bush [fruit=" + fruit + ", leafType=" + leafType + ", getFruit()=" + getFruit() + ", getLeafType()="
			+ getLeafType() + ", getName()=" + getName() + ", getHeight()=" + getHeight()  + "]";
}


}
