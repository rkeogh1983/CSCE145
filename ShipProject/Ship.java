
public class Ship 
{
	
	//variables
	private String name;
	private String launchDate; //mm/dd/yyyy format
			
	//default constructor
	public Ship()
	{
		this.name = "unknown";
		this.launchDate = "mm/dd/yyyy";
	}
	
	//parameterized constructor
	public Ship(String xName, String xLaunchDate)
	{
		this.setName(xName);
		this.setLaunchDate(xLaunchDate);
	}
	
	//accessor
	public String getName()
	{
		return name;
	}
	
	public String getLaunchDate()
	{
		return launchDate;
	}
	
	
	//mutator
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	public void setLaunchDate(String xLaunchDate)
	{
		int shipYear = Integer.parseInt(xLaunchDate.substring(6));
		
		if(shipYear >=1990 && shipYear <=2019)
		{
			this.launchDate = xLaunchDate;
		}
		else
		{
			System.out.println("Launch date is outside the specified field.");
		}
			
	}
	
	public String toString()
	{
		return "Ship Name: " + name + ", Launch Date: " + launchDate;
	}
}



