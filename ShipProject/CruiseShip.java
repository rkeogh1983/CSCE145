
public class CruiseShip extends Ship {

	//instance variables
	private int passengerCapacity;
	private int crewMembers;
	
	//default constructor
	public CruiseShip()
	{
		super();
		this.passengerCapacity = 0;
		this.crewMembers = 0;
	}
	
	public CruiseShip(String xName, String xLaunchDate, int xPassengerCapacity, int xCrewMembers)
	{
		super(xName, xLaunchDate);
		this.setPassengerCapacity(xPassengerCapacity);
		this.setCrewMembers(xCrewMembers);	
	}
	
	//accessors
	public int getPassengerCapacity()
	{
		return this.passengerCapacity;
	}
	
	public int getCrewMembers()
	{
		return this.crewMembers;
	}
	
	//mutators
	public void setPassengerCapacity(int xPassengerCapacity)
	{
		if(xPassengerCapacity > 0)
		{
			this.passengerCapacity = xPassengerCapacity;
		}
		else
		{
			System.out.println("Invalid value for passenger capacity.");
		}
	}
	
	
	public void setCrewMembers(int xCrewMembers)
	{
		if(xCrewMembers > 0) 
 		{
			this.crewMembers = xCrewMembers;
		}
		else 
		{
			System.out.println("Invalid value for crew members.");
		}
	}
	
	
	public String toString() 
	{
    		return "Ship Name: " + getName() + "\nCrew Members: " + crewMembers + "\nPassenger Capacity: " + passengerCapacity;
	}

}
	
	
	
	
	
	

