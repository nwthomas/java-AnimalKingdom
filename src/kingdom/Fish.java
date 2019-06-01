package kingdom;

public class Fish extends AbstractAnimal
{
	String moveMethod;
	String breathMethod;
	String reproduceMethod;

	public Fish(String name, Integer year)
	{
		super(name, year);
		this.moveMethod = "swim";
		this.breathMethod = "gills";
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