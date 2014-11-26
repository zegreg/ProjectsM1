import java.util.Scanner;


public class Ex1 {

	/** José Oliveira 6/10/2014
	 * A prime number (or a prime) is a natural number greater than 1 that has no positive divisors 
	 * other than 1 and itself. The resolution is to find numbers with only two divisors.
	 */
	public static void main(String[] args) {
		
		// Prime number is divisible by him and one. it has only two divisors
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		
		int primeNumber = input.nextInt();
		int divisorsNumber = 0;



		for (int i = 1; i <= primeNumber; i++)
		{
			if (primeNumber % i == 0)
			{
				divisorsNumber++; //  variable count of prime numbers
				System.out.println(divisorsNumber);
			}

		}

		if (divisorsNumber == 2) {
			System.out.println("O numero "+ primeNumber + " é primo");
		} else 
		{
			System.out.println("O numero "+ primeNumber + " não é primo");
		}

	}
}

