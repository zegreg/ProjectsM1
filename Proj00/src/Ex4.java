
public class Ex4 {

	/** José Oliveira 2/10/2014
	 * FINDING ROOTS OF A QUADRATIC FUNCTION
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		int b = -3;
		int c = 1;
		
		double Exp = Math.pow(b, 2);
		double q = (Exp-(4*a*c));
		double Raiz = Math.sqrt(q);
		
		
		if (Raiz > 0) {
			System.out.println("A função quadrática tem duas raizes .");
		} else if (Raiz < 0) {
			System.out.println("A função quadrática não tem raizes .");
		} else if (Raiz == 0) {
			System.out.println("A função quadrática só tem  uma raiz .");
		}
		
	}

}
