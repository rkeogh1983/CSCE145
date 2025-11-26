
public class CargoShip extends Ship {
	
	//instance variables
	private double tonnage;
	private double maxSpeed;
	
	//default constructor
	public CargoShip()
	{
		super();
		this.tonnage = 0;
		this.maxSpeed = 0;	
	}
	
	public CargoShip(String xName, String xLaunchDate, double xTonnage, double xMaxSpeed)
	{
		super(xName, xLaunchDate);
		
		this.setTonnage(xTonnage);
		this.setMaxSpeed(xMaxSpeed);
	}
	
	//accessor
	public double getTonnage()
	{
		return this.tonnage;
	}
	
	public double getMaxSpeed()
	{
		return this.maxSpeed;
	}
	
	//mutators
	public void setTonnage(double xTonnage)
	{
		if(xTonnage > 0)
		{
			this.tonnage = xTonnage;
		}
		else
		{
			System.out.println("Invalid value for tonnage.");
		}
	}
	
	public void setMaxSpeed(double xMaxSpeed)
	{
		if(xMaxSpeed > 0)
		{
			this.maxSpeed = xMaxSpeed;
		}
		else
		{
			System.out.println("Invalid value for max speed.");
		}
	}
	
	
	//toString that only shows ship name, tonnage, maximum speed
	public String toString()
	{
		return "Name: " + getName() + "\nTonnage: " + tonnage + "\nMaximum Speed: "+ maxSpeed + "knots."; 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
