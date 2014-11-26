
public class C {
	
	//Declaration of variable target
	int target;
	
	// Default Constructor 
	public C( ) {

	}
	// Constructor B that received a b type B and updates the variable
	public C(B b ) {

		this.target = b.getValue();
	}
	
// Method verify that received a b type B with  the getValue() Method and updates the variable target
	public void verify(B b) {
		this.target = b.getValue();
		
	}

	// Method isPair() that assesses if a variable is even
	public boolean isPair() {
		int aux = this.target;
		
		if ((aux %= 2) == 0) {
			return true;
		} else {
			return false;
		}		
		
	}
	
// Method getHighestDigit() that assesses which digit, in a two digit number, is higher
	public int getHighestDigit() {
		
		int[] aux = new int [2];
		int i = 0;
		int auxTarget = target;
		
		while (target > 0 ) {
			
			aux[0] = C.this.target %= 10;
			aux[1] = auxTarget/=10;
			this.target /= 10;
			}
		
		if (aux[i+1]> aux [i]) {
				return aux [i+1];
			} else {
				return aux [i];
			}
		
	}

}
