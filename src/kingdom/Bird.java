package kingdom;

public class Bird extends AbstractAnimal
{
	public Bird(String name, int year)
	{
		this.moveMethod = "fly";
		this.breathMethod = "lungs";
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