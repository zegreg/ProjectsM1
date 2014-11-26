import java.util.Scanner;


public class Ex2 {

	/** José Oliveira 6/10/2014
	 *  Add the digits of an integer
	 */
	public static void main(String[] args) {
		// First we need to split an integer into digits to compute
		
		 Scanner in = new Scanner(System.in);
		 System.out.println( "Enter a number ");
		 int number = in.nextInt();
		 
		 int newNumber = 0;
		 
		
		while (number != 0) {
			newNumber += number % 10;
			number /= 10;
		}
		System.out.println(newNumber);
	}

}
