//Robert Keogh
import java.util.Scanner;

public class ShipNavigator {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		String answer = null;
		
		
		do {
			
			System.out.println("Enter the name of the ship:");
		
			String name1 = key.nextLine();
		
			System.out.println("Enter its launch date (mm/dd/yyyy):");
		
			String date1 = key.nextLine();
		
			System.out.println("Is it a cruise ship or a cargo ship?");
		
			String ship = key.nextLine();
			
			if(ship.equalsIgnoreCase("Cruise"))
			{
				System.out.println("Enter the ship's passenger capacity:");
				
				int passenger1 = key.nextInt();
			
				System.out.println("How many crew members are on this ship?");
			
				int crew1 = key.nextInt();
			
				key.nextLine();  //got this from AI to correct error
			
				CruiseShip ship1 = new CruiseShip(name1, date1, passenger1, crew1);
			
				System.out.println("Creating a cruise ship...");
			
				System.out.println("\nPrinting the ship's details:");
			
				System.out.println(ship1);
			
			}
			else if(ship.equalsIgnoreCase("Cargo"))
			{
				
				System.out.println("Enter the ship's tonnage (DWT):");
				
				double tonnage = key.nextDouble();
				
				System.out.println("Enter the maximum speed of the ship (in MPH) :");
				
				double maxSpeed = key.nextDouble();
				
				key.nextLine();
				
				CargoShip ship3 = new CargoShip(name1, date1, tonnage, maxSpeed);	
				
				System.out.println("Creating a cargo ship...");
				
				System.out.println("\nPrinting the ship's details:");
			
				System.out.println(ship3);
				
			}
			else
			{
				System.out.println("Invalid input.  Please use \"Cruise ship\" or \"Cargo ship\".");
			}
			

			System.out.println("\nDo you want to create another ship object? Enter yes or no:");

			answer = key.nextLine();

           
			
			}while (answer.equalsIgnoreCase("yes"));
		
			System.out.println("Thank you! Program ended.");
			
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		


