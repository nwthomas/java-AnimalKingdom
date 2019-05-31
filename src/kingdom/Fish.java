package kingdom;

public class Fish extends AbstractAnimal
{
	public Fish(String name, int year)
	{
		this.moveMethod = "swim";
		this.breathMethod = "gills";
		this.reproduceMethod = "eggs";
	}

	@Override
	public String move() {
		return "The movement method of " + this.name + " is " + this.moveMethod;
	}

	@Override
	public String breath()
	{
		return "The breathing method of " + this.name + " is " + this.breathMethod;
	}

	@Override
	public String reproduce()
	{
		return "The reproduction method of " + this.name + " is " + this.reproduceMethod;
	}
}