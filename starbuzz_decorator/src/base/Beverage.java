package base;

public abstract class Beverage {
	String description="unknown beverage";
    
	public String getDescription()
	{
		return this.description;
	}
	public abstract double cost();
	
}
