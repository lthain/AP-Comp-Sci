import java.util.Scanner;

public class OrderApp {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		MasterOrder myOrder = new MasterOrder();
		
		myOrder.addOrder(new CookieOrder("Tagalongs", 1));
		myOrder.addOrder(new CookieOrder("Thin Mints", 5));
		myOrder.addOrder(new CookieOrder("Samoas", 2));
		myOrder.addOrder(new CookieOrder("Tagalongs", 3));
		
		System.out.println("Your current order is: " + myOrder.getTotalBoxes()+ " boxes");
		System.out.println("What cookie variety would you like to remove? Or none?");
		String removal = input.nextLine();
		
		if(!removal.contentEquals("none")){
			myOrder.removeVariety(removal);
			System.out.println("You are removing " + removal);
		}
		System.out.println("Current Order: ");
		myOrder.showOrder();
	}

}
