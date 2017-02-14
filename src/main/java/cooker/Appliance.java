package cooker;

// we don't want people to create an 'Appliance',
// only a specific type of Appliance (subclass).
// So I make it abstract.
public abstract class Appliance {

	private boolean powered;
	
	public boolean isPowered() {
		return powered;
	}
	public void togglePower() {
		powered = !powered;
	}
}
