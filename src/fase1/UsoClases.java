package fase1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UsoClases {

	
	public static void main(String[] args) {
		
		Scanner entradas = new Scanner(System.in);
		List<Rocket> listOfRockets = new ArrayList<Rocket>();
		
		welcomeGame();
		
		rocket3Propellers(entradas, listOfRockets);

		
		
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
		System.out.println("The number of propellers");
		int numberOfPropellers= entradas.nextInt();
		return numberOfPropellers;
	}

	private static String askForId(Scanner entradas) {
		System.out.println("First the rocket id: ");
		String rocketCodeEntered= entradas.next();
		return rocketCodeEntered;
	}
	
	private static void welcomeGame() {
		System.out.println("Welcome to Rocket race");
		System.out.println("For the race create a rocket one with 3 propellers and the other one with 6 propellers");
	}
}
