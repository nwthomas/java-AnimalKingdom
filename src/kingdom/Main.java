package kingdom;

import java.util.ArrayList;

public class Main
{
	public static void createCollection()
	{
		// Instantiation of new mammels
		Mammel panda = new Mammel("Panda", 1869);
		Mammel zebra = new Mammel("Zebra", 1778);
		Mammel koala = new Mammel("Koala", 1816);
		Mammel sloth = new Mammel("Sloth", 1804);
		Mammel armadillo = new Mammel("Armadillo", 1758);
		Mammel raccoon = new Mammel("Racoon", 1758);
		Mammel bigfoot = new Mammel("Bigfoot", 2021);

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

		for (int i = 0; i < animalArray.size(); i++)
		{
			System.out.println(animalArray.get(i));
		}

	}

	public static void main(String[] args)
	{
		createCollection();
	}
}