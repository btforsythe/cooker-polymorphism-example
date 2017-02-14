package cooker;

public class CookerApp {

	public static void main(String[] args) {

		Cooker myGrill = new Grill();
		myGrill.cook();

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

		System.out.println("***************************");
		System.out.println("The GM is responsible for turning on the power");

		// We can't instantiate abstract classes or interfaces
		// Appliance genericAppliance = new Appliance();

		Appliance myDishwasher = new Dishwasher();
		System.out.println("Is my dishwasher on? " + myDishwasher.isPowered());
		myDishwasher.togglePower();
		System.out.println("Is my dishwasher on? " + myDishwasher.isPowered());

		Grill mahGrill = new Grill();
		
		// can refer to the grill as a Cooker or an Appliance
		Appliance grillAsAnAppliance = mahGrill;
		Cooker grillAsACooker = mahGrill;
		
		System.out.println("Is my grill on? " + mahGrill.isPowered());
		mahGrill.togglePower();
		System.out.println("Is my grill on? " + grillAsAnAppliance.isPowered());
	}

}
