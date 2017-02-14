package cooker;

// interfaces differ from classes by using the interface keyword in declaration
public interface Cooker {

	// interfaces declare *abstract* methods
	// this says that all Cookers must implement a cook() method
	public void cook();
 
}
