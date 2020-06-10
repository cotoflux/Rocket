package fase3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UseOfClases {

	
	public static void main(String[] args) {
		
		Scanner entradas = new Scanner(System.in);
		List<Rocket> listOfRockets = new ArrayList<Rocket>();

		//ROCKET 3***************************************************
		welcomeGame();
		printSpaceWithLine();
		rocket3Propellers(entradas, listOfRockets);	
		printSpaceWithLine();
		
		//ROCKET 6**************************************************
		welcomeRoket6();
		printSpaceWithLine();
		rocket6Propellers(entradas, listOfRockets);	
		printSpaceWithLine();
		
	}

	
	private static void rocket6Propellers(Scanner entradas, List<Rocket> listOfRockets) {
		Rocket rocket = new Rocket(askForId(entradas));
		String getIdRocket = rocket.getIdRocket();
		int getLengthId = getIdRocket.length();
		if(getLengthId == 8) {
			for(int i=0; i<6; i++) {
				Propeller propeller = new Propeller(askForPropellers(entradas));
				rocket.addPropellers(propeller);
			}
			
			System.out.println(rocket.toString());
		}else {
			System.out.println("The id entered is not long enough");
		}
		
	}
	


	//ROCKET 6 NEW METHOD
	private static void welcomeRoket6() {
		System.out.println("Second enter ROCKET - WITH 6 PROPELLERS");

	}
	

	// GENERAL METHODS TO USE IN THE PROGRAM
		
	private static void printSpaceWithLine() {
		System.out.println("                                                                                                     ");
		System.out.println("                                     **************************                                      ");
		System.out.println("                                                                                                     ");
	}
	
	private static void welcomeGame() {
		System.out.println("Welcome to Rocket race");
		System.out.println("For the race create a rocket one with 3 propellers and the other one with 6 propellers");
	}

	// ROCKET 3 METHODS

	private static void rocket3Propellers(Scanner entradas, List<Rocket> listOfRockets) {
		Rocket rocket = new Rocket(askForId(entradas));
		String getIdRocket = rocket.getIdRocket();
		int getLengthId = getIdRocket.length();
		if(getLengthId == 8) {
			for(int i=0; i<3; i++) {
				Propeller propeller = new Propeller(askForPropellers(entradas));
				rocket.addPropellers(propeller);
			}
			System.out.println(rocket.toString());
		}else {
			System.out.println("The id entered is not long enough");
		}
		
	}

	private static int askForPropellers(Scanner entradas) {
		System.out.println("Now add the propulsive power of the propellers");
		System.out.println("**********************************************");
		int numberOfPropellers= entradas.nextInt();
		return numberOfPropellers;
	}

	private static String askForId(Scanner entradas) {
		System.out.println("First enter ROCKET propellers - the rocket id: ");
		System.out.println("________________________________________________ ");
		String rocketCodeEntered= entradas.next();
		return rocketCodeEntered;
	}
	

}