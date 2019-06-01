package kingdom;

public class Fish extends AbstractAnimal
{
	String moveMethod;
	String breathMethod;
	String reproduceMethod;

	public Fish(String name, int year)
	{
		super(name, year);
		this.moveMethod = "swim";
		this.breathMethod = "gills";
		this.reproduceMethod = "eggs";
	}

	@Override
	public String move() {
		return "The movement method of " + name + " is " + moveMethod;
	}

	@Override
	public String breath()
	{
		return "The breathing method of " + name + " is " + breathMethod;
	}

	@Override
	public String reproduce()
	{
		return "The reproduction method of " + name + " is " + reproduceMethod;
	}
}