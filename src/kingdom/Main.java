package kingdom;

import java.util.*;
import java.io.*;

public class Main
{
	public static void printAnimals(ArrayList<AbstractAnimal> animalArray, CheckAnimal tester)
	{
		for (AbstractAnimal a : animalArray)
		{
			if (tester.test(a))
			{
				System.out.println(a.getName());
			}
		}
	}
		

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

		System.out.println("*** List Descending by Year Named ***");
		animalArray.sort((a1, a2) -> a2.getYear().compareTo(a1.getYear()));
		animalArray.forEach(a -> System.out.println(a.toString()));
		System.out.println();

		System.out.println("*** List All Animals Alphabetically ***");
		animalArray.sort((a1, a2) -> a2.getName().compareToIgnoreCase(a1.getName()));
		animalArray.forEach(a -> System.out.println(a.getName()));
		System.out.println();

		System.out.println("*** List All Animals By Movement ***");
		animalArray.sort((a1, a2) -> a2.getMove().compareToIgnoreCase(a1.getMove()));
		animalArray.forEach(a -> System.out.println(a.getName()));
		System.out.println();

		System.out.println("*** List Only Animals that Breath with Lungs ***");
		printAnimals(animalArray, a -> (a.getBreath() == "lungs") && (a instanceof AbstractAnimal));
		System.out.println();

		System.out.println("*** List Only Animals that Breath with Lungs Named in 1758 ***");
		printAnimals(animalArray, a -> (a.getBreath() == "lungs" && a.getYear() == 1758) && (a instanceof AbstractAnimal));
		System.out.println();

		System.out.println("*** List Only Animals that Lay Eggs and Breath with Lungs ***");
		printAnimals(animalArray, a -> (a.getBreath() == "lungs" && a.getReproduce() == "eggs") && (a instanceof AbstractAnimal));
		System.out.println();

		System.out.println("*** List Alphabetically only Animals Named in 1758 ***");
		animalArray.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		printAnimals(animalArray, a -> (a.getYear() == 1758) && a instanceof AbstractAnimal);

	}

	public static void main(String[] args)
	{
		createCollection();
	}
}