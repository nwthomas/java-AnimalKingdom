package kingdom;

public class Mammel extends AbstractAnimal
{
	String moveMethod;
	String breathMethod;
	String reproduceMethod;

	public Mammel(String name, int year)
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