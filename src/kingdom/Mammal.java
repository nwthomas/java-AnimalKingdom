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