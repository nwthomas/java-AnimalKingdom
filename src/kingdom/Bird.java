package kingdom;

public class Bird extends AbstractAnimal
{
	String moveMethod;
	String breathMethod;
	String reproduceMethod;

	public Bird(String name, Integer year)
	{
		super(name, year);
		this.moveMethod = "fly";
		this.breathMethod = "lungs";
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