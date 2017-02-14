package cooker;

import java.util.Arrays;
import java.util.List;

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

		demonstrateAppliances();
	}

	private static void demonstrateAppliances() {
		System.out.println("***************************");
		System.out.println("The GM is responsible for turning on the power");

		// We can't instantiate abstract classes or interfaces
		// Appliance genericAppliance = new Appliance();
		Appliance myDishwasher = new Dishwasher();
		System.out.println("Is my dishwasher on? " + myDishwasher.isPowered());
		myDishwasher.togglePower();
		System.out.println("Is my dishwasher on? " + myDishwasher.isPowered());

		// Grills are both Appliances and Cookers 
		Grill myGrill = new Grill();
		// We can power them on/off since they are Appliances
		System.out.println("Is my grill on? " + myGrill.isPowered());
		myGrill.togglePower();
		System.out.println("Is my grill on? " + myGrill.isPowered());
		// We can cook on them since they are Cookers
		System.out.print("When I cook: ");
		myGrill.cook();
		
		// we can refer to the grill as a an Appliance
		Appliance grillAsAnAppliance = myGrill;
		// then we can toggle its power
		grillAsAnAppliance.togglePower();
		// but we can't cook on it - the following line would not compile
		// grillAsAnAppliance.cook();
		
		// we can refer to the grill as a Cooker
		Cooker grillAsACooker = myGrill;
		// then we can cook on it
		grillAsACooker.cook();
		// but we can't toggle it's power - the following line would not compile
		// grillAsACooker.togglePower();

		System.out.println("Do your job, GM!");
		
		GeneralManager gm = new GeneralManager();
		List<Appliance> appliances = Arrays.asList(myDishwasher, myGrill);
		
		gm.powerEverything(appliances);
		
		PizzaOven myPizzaOven = new PizzaOven();
		// this won't compile because PizzaOven is not an Appliance
		// List<Appliance> notAppliances = Arrays.asList(myPizzaOven);
	}

}
