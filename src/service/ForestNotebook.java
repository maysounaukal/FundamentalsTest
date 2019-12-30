package service;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import animal_entities.Animal;
import animal_entities.Carnivore;
import animal_entities.Herbivore;
import animal_entities.Omnivore;
import plant_entities.Plant;

public class ForestNotebook {
	private List<Carnivore> carnivores = new ArrayList<>();
	private List<Omnivore> omnivores = new ArrayList<>();
	private List<Herbivore> herbivores = new ArrayList<>();
	private int plantCount;
	private int animalCount;
	private List<Animal> animals = new ArrayList<Animal>();
	private List<Plant> plants = new ArrayList<Plant>();

	public ForestNotebook() {
	}

	public List<Carnivore> getCarnivores() {
		return carnivores;
	}

	public void setCarnivores(List<Carnivore> carnivores) {
		this.carnivores = carnivores;
	}

	public List<Omnivore> getOmnivores() {
		return omnivores;
	}

	public void setOmnivores(List<Omnivore> omnivores) {
		this.omnivores = omnivores;
	}

	public List<Herbivore> getHerbivores() {
		return herbivores;
	}

	public void setHerbivores(List<Herbivore> herbivores) {
		this.herbivores = herbivores;
	}

	public int getPlantCount() {

		return (int) plants.stream().count();
	}

	public void setPlantCount(int plantCount) {
		this.plantCount = plantCount;
	}

	public int getAnimalCount() {
		return (int) animals.stream().count();
	}

	public void setAnimalCount(int animalCount) {
		this.animalCount = animalCount;
	};

	public void addAnimal(Animal animal) {
		if (animals.contains(animal)) {
//	if(animal.equals(animal.getName())) {
			System.out.println("die dier staat bij dieren");
		} else {

			// {

			if (animal instanceof Carnivore) {
				// animals.stream().filter(s -> s instanceof
				// Carnivore).forEach(System.out::println);

				animals.add(animal);

				System.out.println("de dier is carnivore");
			}
			if (animal instanceof Herbivore) {
				animals.add(animal);

				// animals.stream().filter(s -> s instanceof
				// Herbivore).forEach(System.out::println);
				System.out.println("de dier is Herbivore");
			}
			if (animal instanceof Omnivore) {
				animals.add(animal);
				// animals.stream().filter(s -> s instanceof
				// Omnivore).forEach(System.out::println);

				System.out.println("de dier is Omnivore");
			}
		}
	}
//}

	public void addPlant(Plant plant) {
		if (plants.contains(plant)) {

		} else {
			plants.add(plant);
		}
	}
//public boolean plantName(String name) {
	// for(Plant p: plants) {
	// if(p.getName().equals(name))
	// return true;
	// }
	// return false;
//}

	public void printNotebook() {
		if (getAnimalCount() > 0) {
			System.out.println("Animals");
			for (int i = 0; i < animals.size(); i++) {

				System.out.println(animals.get(i));
			}
		} else {
			System.out.println("er is geen animals");
		}

		if (plants.size() > 0) {
			System.out.println("Planten");
			for (int i = 0; i < plants.size(); i++) {

				System.out.println(plants.get(i));
			}
		} else {
			System.out.println("er is geen planten");
		}
	};

	public void sortAnimalsByName() {
		animals = this.animals.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
		System.out.println(animals);
	};

	public void sortPlantByName() {
		plants = this.plants.stream().sorted(Comparator.comparing(Plant::getName)).collect(Collectors.toList());
		System.out.println(plants);
	}

	public Collection<Animal> getanimals() {
		// TODO Auto-generated method stub
		return animals;
	};
}
