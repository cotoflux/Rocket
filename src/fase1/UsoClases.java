package fase1;

import java.util.Scanner;

public class UsoClases {

	
	public static void main(String[] args) {
		
		Scanner entradas = new Scanner(System.in);
		
		welcomeGame();
		
		for(int i=0; i<=2; i++) {
			askForId(entradas);
			askForPropellers(entradas);
		}
		
		
	}

	private static void askForPropellers(Scanner entradas) {
		System.out.println("The number of propellers");
		String numberOfPropellers= entradas.next();
		
	}

	private static void askForId(Scanner entradas) {
		System.out.println("The rocket id: ");
		String rockedCodeEntered= entradas.next();
	}

	private static void welcomeGame() {
		System.out.println("Welcome to Rocket race");
		System.out.println("For the race create a rocket with the number of propellers");
		System.out.println("To play you need to enter two codes");
	}
}
