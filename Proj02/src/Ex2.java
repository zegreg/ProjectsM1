import java.util.Scanner;


public class Ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println(" Digite um numero :");

		int resp = in.nextInt();

		int factor = 1;
		int i =1;

		if (i<0) 
		{ System.out.println( "O numero tem que ser positivo ");
		

		} else
		
		{
			for ( i = 1; i <= resp; i++)
			{

				factor = factor *i ;
			}
			System.out.println(factor); 
		}

	}

}
