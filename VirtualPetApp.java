import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userChoice = "";
		
		VirtualPet matt = new VirtualPet("Matt", 50, 50, 50, 50, 50);
		
		System.out.println("Welcome ");
		System.out.println("Type exit to leave the app");
		System.out.println("press 1 to see " + matt.getName() + "'s stats");
		System.out.println("press 2 to feed " + matt.getName());
		System.out.println("Press 3 to give " + matt.getName() + " a drink");
		System.out.println("Press 4 to play with " + matt.getName());
		System.out.println("Press 5 for " + matt.getName() + " to go to sleep");
		System.out.println("Press 6 to walk " + matt.getName());
		
		userChoice = input.nextLine();
		
		do {
			if(userChoice.contentEquals("2")) {
				System.out.println("you are feeding " + matt.getName());
				matt.feed();
			}
			else if(userChoice.contentEquals("3")) {
				System.out.println("you are giving water to " + matt.getName());
				matt.drink();
			}
			else if(userChoice.contentEquals("4")) {
				System.out.println("you are playing with " + matt.getName());
				matt.play();
			}
			else if(userChoice.contentEquals("5")) {
				System.out.println(matt.getName() + " is going to sleep");
				matt.sleep();
			}
			else if(userChoice.contentEquals("1")) {
				System.out.println(matt.getName()+ "'s are: " + matt);
			}
			else if(userChoice.contentEquals("6")) {
				System.out.println("you're taking " +matt.getName()+ " on a walk");
				matt.walk();
			}
			
		System.out.println("Welcome ");
		System.out.println("Type exit to leave the app");
		System.out.println("press 1 to see " + matt.getName() + "'s stats");
		System.out.println("press 2 to feed " + matt.getName());
		System.out.println("Press 3 to give " + matt.getName() + " a drink");
		System.out.println("Press 4 to play with " + matt.getName());
		System.out.println("Press 5 for " + matt.getName() + " to go to sleep");
		System.out.println("Press 6 to walk " + matt.getName());
		userChoice = input.nextLine();
		
		matt.tick();
				
		}while (!userChoice.contentEquals("exit"));
		System.out.println("Thanks for playing");
		

	}

}
