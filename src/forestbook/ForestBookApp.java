package forestbook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import animal_entities.Animal;
import animal_entities.Carnivore;
import animal_entities.Herbivore;
import animal_entities.Omnivore;
import plant_entities.Bush;
import plant_entities.Flower;
import plant_entities.LeafType;
import plant_entities.Plant;
import plant_entities.Scent;
import plant_entities.Weed;
import service.ForestNotebook;

public class ForestBookApp {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		ForestNotebook book = new ForestNotebook();
		Plant flower1 = new Flower("Anemone",2.5, Scent.MUSKY);
		Plant flower2 = new Flower("Angelica",3, Scent.SWEET);
		Plant flower3 = new Flower("Artemisia" ,4, Scent.SOUR);
		
		Plant weed = new Weed("weed",3.5,5.2);
		Plant B = new Bush("bush",2.5,LeafType.HEART);
		
		
		book.addPlant(flower1);
		book.addPlant(flower2);
		book.addPlant(flower3);
		book.addPlant(weed);
		book.addPlant(B);
		
		
		
		book.printNotebook();
		System.out.println("het aantal planten :");
		System.out.println(book.getPlantCount());
		System.out.println("Dieren na sorting");
		book.sortPlantByName();
		System.out.println("-----------------------------------");
		System.out.println("Animals");
		
		Herbivore  Giraffe = new Herbivore("Herbivore",92,170,30);
		Giraffe.addPlant(B);
		Herbivore Rabbits = new Herbivore("Rabbits",17,90,8);
		Rabbits.addPlant(weed);
		Herbivore Birds = new Herbivore("Birds",1.5,12,3);
		Birds.addPlant(flower3);
		
		
		Omnivore Beer = new Omnivore("Beer",150,188,40);
		Beer.addPlantToDiet(weed);
		Omnivore Rat = new Omnivore("Rat",1,7,3);
         Rat.addPlantToDiet(flower3);
		Omnivore Mice = new Omnivore("Mice",4,20,6);
		Mice.addPlantToDiet(flower2);
		
		Carnivore Lion = new Carnivore("Lion", 90,120,34);
		Carnivore Tiger = new Carnivore("Tiger", 97,123,67);
		Carnivore Dinasour = new Carnivore("Dinasour",189,250,56);
		
		book.addAnimal(Giraffe);
		book.addAnimal(Rabbits);
		book.addAnimal(Birds);
		book.addAnimal(Beer);
		book.addAnimal(Rat);
		book.addAnimal(Mice);
		book.addAnimal(Lion);
		book.addAnimal(Tiger);
		book.addAnimal(Dinasour);
		book.printNotebook();
	System.out.println("het aantal dieren:");
	System.out.println(book.getAnimalCount());
	System.out.println("Dieren na sorting");
	   book.sortAnimalsByName();
	
		
		
		
	   System.out.println("het aantal planten :");
		System.out.println(book.getPlantCount());
		
		System.out.println();
		
		System.out.println("het aantal dieren:");
		System.out.println(book.getAnimalCount());
		
		System.out.println();
		
		book.printNotebook();
		
		System.out.println("Carnivore Animals");
		book.getanimals().stream().filter(s -> s instanceof Carnivore).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Herbivore Animals");
		 book.getanimals().stream().filter(s -> s instanceof Herbivore).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Omnivore Animals");
		
		 book.getanimals().stream().filter(s -> s instanceof Omnivore).forEach(System.out::println);
		
		
		
		

	}

}
