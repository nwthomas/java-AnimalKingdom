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
	public String getMove() {
		return moveMethod;
	}

	@Override
	public String getBreath()
	{
		return breathMethod;
	}

	@Override
	public String getReproduce()
	{
		return reproduceMethod;
	}
}