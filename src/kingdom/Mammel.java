package kingdom;

public class Mammel extends AbstractAnimal
{
	public Mammel(String name, int year)
	{
		this.moveMethod = "walk";
		this.breathMethod = "lungs";
		this.reproduceMethod = "live births";
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