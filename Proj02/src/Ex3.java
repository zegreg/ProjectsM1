import java.util.Scanner;


public class Ex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println(" Digite um numero :");

		int resp = in.nextInt();


		int f1 = 0;
		int f2 = 1;
		int fn = 1;

		for (int i = 1; i <= resp; i++) 
		{
			System.out.print(fn + ", ");
			fn = f1 + f2;
			f1 = f2;
			f2 = fn;
		}

	}

}


