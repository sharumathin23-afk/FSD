package Day6;

public class FoodDelivery {

	public static void main(String[] args) {
		PizzaRestaurant pr = new PizzaRestaurant();
		BurgerRestaurant br = new BurgerRestaurant();
        pr.displayMenu();
        pr.calculateBill();
        System.out.println();
        br.displayMenu();
        br.calculateBill();
	}

}
abstract class Restaurant{
	abstract void displayMenu();
	abstract void calculateBill();
	
}
class PizzaRestaurant extends Restaurant{

	void displayMenu() {
		System.out.println("1.Veg Pizza, 2.Pepperoni Pizza, 3.Cheesy Volcano Chicken Pizza");
	}
	void calculateBill() {
		System.out.println("1.Rs150, 2.Rs200, 3.Rs270");
	}
	
}
class BurgerRestaurant extends Restaurant{

	void displayMenu() {
		System.out.println("1.Veg Burger, 2.Chicken Burger, 3.Cheese Burger");
	}
	void calculateBill() {
		System.out.println("1.Rs170, 2.Rs415, 3.Rs300");
	}
	
}