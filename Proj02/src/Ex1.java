import java.util.Scanner;


public class Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println(" Digite um numero :");
		
		int resp = in.nextInt();
		int numberDigit = 0;
		while (resp  > 0) 
		{
			numberDigit++;
			resp /=10;
		}
		System.out.println(numberDigit);
	}

}
