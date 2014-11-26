
public class A {
	//Declaration of variable value
	int value;
	public A() {
		// Default Constructor , initializes the variable value
		this.value= 0;
	}
	
	public A(int i) {
		// Constructor A that received a integer i and updates the variable
		this.value= i;
	}
	
	public A(A a) {
		// Constructor A that received a variable of A type and updates the variable
		this.value= a.getValue();
	}
	
	// Setters and Getters 
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	// The Method equals that validates equality between variables  of  the  A type
	public boolean equals( A a) {
		if (this.value == a.getValue()) {
			return true;
		} else {
			return false;
		}
	}
	
}
