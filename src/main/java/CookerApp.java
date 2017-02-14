
public class CookerApp {

	public static void main(String[] args) {
		Cooker cooker = new Cooker();
		Cooker myGrill = new Grill();
		Cooker myStove = new Stove();
		Cooker myPizzaOven = new PizzaOven();
		
		cooker.cook();
		myGrill.cook();
		myStove.cook();
		myPizzaOven.cook();

	}
}
