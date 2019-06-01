package kingdom;

public class Mammal extends AbstractAnimal
{
	String moveMethod;
	String breathMethod;
	String reproduceMethod;

	public Mammal(String name, Integer year)
	{
		super(name, year);
		this.moveMethod = "walk";
		this.breathMethod = "lungs";
		this.reproduceMethod = "live births";
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