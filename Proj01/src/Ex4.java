import java.util.Scanner;


public class Ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in); // l� o input e coloca-o em tokens 
		System.out.println("Insira um numero  (a) : ");
		int numFirst = in.nextInt(); // l� o numero do System.in
		System.out.println("Introduza um segundo numero (b) : ");
		int numSecond = in.nextInt();
		System.out.println("Introduza um numero (c) : ");
		int numThird = in.nextInt();
		
		
		

		for (int i = numSecond; i <= numThird; i++) {

			if ( ( numFirst % i == 0) ) {

				int mult = i;
                 // System.out.println(mult);
			System.out.println( "O " + numFirst + " � multiplo de "+ numSecond + " a "+ numThird);
			} else {
				System.out.println( "O " + numFirst + " n�o � multiplo de "+ numSecond + " a "+ numThird);
			}

		}




	}

}
