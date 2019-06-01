package kingdom;

public abstract class AbstractAnimal
{
	private static Integer maxId = 0;
	protected Integer id;
	protected String name;
	protected Integer year;

	public AbstractAnimal(String name, Integer year)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.year = year;
	}

	public abstract String move();
	public abstract String breath();
	public abstract String reproduce();

	public String eat()
	{
		return "The " + name + " ate some food.";
	}

	public Integer getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getYear()
	{
		return year;
	}

	public void setYear(Integer year)
	{
		this.year = year;
	}

	@Override
	public String toString()
	{
		return name + " was named in the year " + year + ".";
	}
}