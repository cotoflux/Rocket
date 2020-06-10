package fase1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UsoClases {

	
	public static void main(String[] args) {
		
		Scanner entradas = new Scanner(System.in);
		List<Rocket> listOfRockets = new ArrayList<Rocket>();
		
		welcomeGame();
		requestData(entradas);
		

		
		
	}

	private static void requestData(Scanner entradas) {

		for(int i=0; i<2; i++) {  //We are asking to user for the two rockets we need to play
			askForId(entradas);
			askForPropellers(entradas);
		}
		
	}

	private static int askForPropellers(Scanner entradas) {
		System.out.println("The number of propellers");
		int numberOfPropellers= entradas.nextInt();
		return numberOfPropellers;
	}

	private static String askForId(Scanner entradas) {
		System.out.println("The rocket id: ");
		String rocketCodeEntered= entradas.next();
		return rocketCodeEntered;
	}
	
	private static void addRocketId(String rocketCodeEntered) {
		
	}

	private static void welcomeGame() {
		System.out.println("Welcome to Rocket race");
		System.out.println("For the race create a rocket with the number of propellers");
		System.out.println("To play you need to enter two codes");
	}
}
