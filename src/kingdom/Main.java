package kingdom;

import java.util.*;
import java.io.*;

public class Main
{
	public static void createCollection()
	{
		// Instantiation of new mammels
		Mammal panda = new Mammal("Panda", 1869);
		Mammal zebra = new Mammal("Zebra", 1778);
		Mammal koala = new Mammal("Koala", 1816);
		Mammal sloth = new Mammal("Sloth", 1804);
		Mammal armadillo = new Mammal("Armadillo", 1758);
		Mammal raccoon = new Mammal("Racoon", 1758);
		Mammal bigfoot = new Mammal("Bigfoot", 2021);

		// Instantiation of new birds
		Bird pigeon = new Bird("Pigeon", 1837);
		Bird peacock = new Bird("Peacock", 1821);
		Bird toucan = new Bird("Toucan", 1758);
		Bird parrot = new Bird("Parrot", 1824);
		Bird swan = new Bird("Swan", 1758);

		// Instantiation of new fish
		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		// Create new ArrayList and 
		ArrayList<AbstractAnimal> animalArray = new ArrayList<AbstractAnimal>();
		animalArray.add(panda);
		animalArray.add(zebra);
		animalArray.add(koala);
		animalArray.add(sloth);
		animalArray.add(armadillo);
		animalArray.add(raccoon);
		animalArray.add(bigfoot);
		animalArray.add(pigeon);
		animalArray.add(peacock);
		animalArray.add(toucan);
		animalArray.add(parrot);
		animalArray.add(swan);
		animalArray.add(salmon);
		animalArray.add(catfish);
		animalArray.add(perch);

		// List animals in descending order by year named
		animalArray.sort((a1, a2) -> a2.getYear().compareTo(a1.getYear()));
		animalArray.forEach(a -> System.out.println(a.toString()));

		// List all animals alphabetically
		animalArray.sort((a1, a2) -> a2.getName().compareToIgnoreCase(a1.getName()));
		animalArray.forEach(a -> System.out.println(a.getName()));
	}

	public static void main(String[] args)
	{
		createCollection();
	}
}