package cooker;

// we "extend" classes. we "implement" interfaces
public class PizzaOven implements Cooker {
	@Override
	public void cook() {
		System.out.println("I'm cooking from a pizza oven");
	}
}
