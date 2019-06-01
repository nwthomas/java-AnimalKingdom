package kingdom;

public abstract class AbstractAnimal
{
	private static int maxId = 0;
	protected int id;
	protected String name;
	protected int year;

	public AbstractAnimal(String name, int year)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.year = year;
	}

	public String eat()
	{
		return "The " + name + " ate some food.";
	}

	public abstract String move();
	public abstract String breath();
	public abstract String reproduce();
}