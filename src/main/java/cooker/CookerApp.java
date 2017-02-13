package cooker;

public class CookerApp {

	public static void main(String[] args) {

		Cooker myCooker = new Cooker();
		myCooker.cook();

		myCooker = new Grill();
		myCooker.cook();
		
		Cooker myPizzaOven = new PizzaOven();
		myPizzaOven.cook();
		
		Cooker myStove = new Stove();
		myStove.cook();
		
		System.out.println("***************************");
		System.out.println("Let the manager handle the cooking!");
		KitchenManager manager = new KitchenManager();
		
		// declare one as the general type
		Cooker kmPizzaOven = new PizzaOven();
		
		// declare one as the specific type
		Grill kmGrill = new Grill();
		
		manager.handleCooking(kmPizzaOven);
		manager.handleCooking(kmGrill);
	}

}
