import java.util.Scanner;


public class Ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println(" Digite um numero :");

		 
		 int number = in.nextInt();
		
		 
		
		 
		while (number != 0) {
			System.out.print( number % 10);
			number /= 10;
		}
	}

	

		//		for (int i = 0; i < respOriginal.length(); i++) {
		//			 int digit = respOriginal.charAt(i);
		//			 System.out.println(digit);
		//		}
		
			
		
	}


