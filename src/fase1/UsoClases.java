package fase1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UsoClases {

	
	public static void main(String[] args) {
		
		Scanner entradas = new Scanner(System.in);
		List<Rocket> listOfRockets = new ArrayList<Rocket>();
		
		welcomeGame();
		printSpaceWithLine();
		rocket3Propellers(entradas, listOfRockets);

		
		
	}



	private static void printSpaceWithLine() {
		System.out.println("                                                                                                     ");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("                                                                                                     ");
	}



	private static void rocket3Propellers(Scanner entradas, List<Rocket> listOfRockets) {
		Rocket rocket = new Rocket(askForId(entradas));
		
		for(int i=0; i<3; i++) {
			Propeller propeller = new Propeller(askForPropellers(entradas));
			rocket.addPropellers(propeller);
		}
		System.out.println(rocket.toString());
		
	}

	private static int askForPropellers(Scanner entradas) {
		System.out.println("Now add the propulsive power of the propellers");
		System.out.println("**********************************************");
		int numberOfPropellers= entradas.nextInt();
		return numberOfPropellers;
	}

	private static String askForId(Scanner entradas) {
		System.out.println("First enter ROCKET 3 propellers - the rocket id: ");
		System.out.println("_________________________");
		String rocketCodeEntered= entradas.next();
		return rocketCodeEntered;
	}
	
	private static void welcomeGame() {
		System.out.println("Welcome to Rocket race");
		System.out.println("For the race create a rocket one with 3 propellers and the other one with 6 propellers");
	}
}
