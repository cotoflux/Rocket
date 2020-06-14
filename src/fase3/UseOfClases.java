package fase3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UseOfClases {

	
	public static void main(String[] args) {
		
		Scanner entradas = new Scanner(System.in);
		List<Rocket> listOfRockets = new ArrayList<Rocket>();
		int actualPower = 0;

		
		welcomeGame();
		printSpaceWithLine();
		
		Rocket Rocket3 = new Rocket("32WESSDS", 0);
		
			Propeller fristPropeller = new Propeller(1, 10, actualPower);
			Propeller secondPropeller = new Propeller(1, 30, actualPower);
			Propeller thirdPropeller = new Propeller(1, 80, actualPower);
			
			//Add propellers to the object firstRocket
			
			Rocket3.addPropellers(fristPropeller);
			Rocket3.addPropellers(secondPropeller);
			Rocket3.addPropellers(thirdPropeller);
			
		Rocket Rocket6 = new Rocket("LDSFJA32", 0);
		
			Propeller fristPropeller6 = new Propeller(1, 10, actualPower);
			Propeller secondPropeller6 = new Propeller(1, 30, actualPower);
			Propeller thirdPropeller6 = new Propeller(1, 80, actualPower);
			Propeller fourthPropeller6 = new Propeller(1, 10, actualPower);
			Propeller fifthPropeller6 = new Propeller(1, 30, actualPower);
			Propeller sixthPropeller6 = new Propeller(1, 80, actualPower);
				
			Rocket6.addPropellers(fristPropeller6);
			Rocket6.addPropellers(secondPropeller6);
			Rocket6.addPropellers(thirdPropeller6);
			Rocket6.addPropellers(fourthPropeller6);
			Rocket6.addPropellers(fifthPropeller6);
			Rocket6.addPropellers(sixthPropeller6);
			
			listOfRockets.add(Rocket3);
			listOfRockets.add(Rocket6);
			
		for(Rocket rocket: listOfRockets) {
			
			System.out.println("The rocket code is: " + rocket.getIdRocket());
			System.out.println("Thr propeller is: ");
			
			for(Propeller propeller: rocket.getPropellers()) {
				System.out.println(propeller);
;			}
			
		}
		
		Rocket3.start();
		
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		Rocket6.start();
		
		printSpaceWithLine();
		
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

	

}