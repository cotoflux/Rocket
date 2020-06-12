package fase3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UseOfClases {

	
	public static void main(String[] args) {
		
		Scanner entradas = new Scanner(System.in);
		List<Rocket> listOfRockets = new ArrayList<Rocket>();
		int current=0;

		//ROCKET 3***************************************************
		welcomeGame();
		printSpaceWithLine();
		rocket3_6Propellers(entradas, listOfRockets, current);	
		printSpaceWithLine();
		
	}

	
	private static void rocket3_6Propellers(Scanner entradas, List<Rocket> listOfRockets, int current) {
		
		System.out.println("ROCKET 3 propellers");
		Rocket rocket3 = new Rocket(askForId(entradas), current);
		String getIdRocket3 = rocket3.getIdRocket();
		int getLengthId3 = getIdRocket3.length();
		int conta3=3;
		
		System.out.println("ROCKET 6 propellers");
		Rocket rocket6 = new Rocket(askForId(entradas), current);
		String getIdRocket6 = rocket6.getIdRocket();
		int getLengthId6 = getIdRocket6.length();
		int conta6=6;
		
		
		if(getLengthId3 == 8 || getLengthId6 == 8) {
			for(int i=0; i<conta3; i++) {
				Propeller propeller = new Propeller(askForPropellers(entradas));
				rocket3.addPropellers(propeller);
			}
			welcomeRoket6();
			for(int i=0; i<conta6; i++) {
				Propeller propeller = new Propeller(askForPropellers(entradas));
				rocket6.addPropellers(propeller);
			}
			
			System.out.println(rocket3.toString());
			System.out.println(rocket6.toString());
			
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


	private static int askForPropellers(Scanner entradas) {
		System.out.println("Now add the propulsive power of the propellers");
		System.out.println("**********************************************");
		int numberOfPropellers= entradas.nextInt();
		return numberOfPropellers;
	}

	private static String askForId(Scanner entradas) {
		System.out.println("Rocket id: ");
		System.out.println("________________________________________________ ");
		String rocketCodeEntered= entradas.next();
		return rocketCodeEntered;
	}
	

}