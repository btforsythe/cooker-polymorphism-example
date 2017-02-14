package cooker;

import java.util.List;

public class GeneralManager {

	public void powerEverything(List<Appliance> appliances) {
		for (Appliance a: appliances) {
			a.togglePower();
		}
	}
}
