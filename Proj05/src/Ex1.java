import java.util.Random;
import java.util.Scanner;


public class Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println( "Enter array size : " );
		int n = kb.nextInt();
		int numbers[] = new int[n];

		// Get the n random numbers 
		showRandomGenerator(n, numbers);

		// Get the numbers from input.
		System.out.println("Array size : " + n + " elements ");

		// Calculated Average of the elements's array
		showAverage(numbers);

		//  Show the Highest number
		showHighestNumber(numbers);

		// Show odd numbers

		showOddNumbers(numbers);


		// Scope the result

		printOutput(numbers);
		
	}



private static void printOutput(int[] numbers) {
		System.out.print("Original array : [");
		for (int i = 0; i < numbers.length; i++){

			System.out.print(numbers[i] + ((i == numbers.length - 1)? "" : ";"));
		}
		System.out.print("]");  
}

private static void showOddNumbers(int[] numbers) {

	System.out.print("Odd Numbers : [");
	boolean isFirstOne = true;
	for (int i = 0; i < numbers.length; i++) {

		if ((numbers[i] % 2) != 0){
			System.out.print((isFirstOne == true) ? " "+ numbers[i] : ";"+ numbers[i]);
			isFirstOne = false;
		}

	}

	System.out.print("]");
	System.out.println();

}

private static void showHighestNumber(int[] numbers) {
		int highestNumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			while (highestNumber < numbers[i])  {

				highestNumber = numbers[i];

			} 
		}

		

	System.out.println( "Highest number :"+highestNumber);
	}

private static void showRandomGenerator(int n, int[] numbers) {
	Random randomGenerator = new Random();
	for (int idx = 0; idx < n; ++idx){
		int randomInt = randomGenerator.nextInt(100);
		numbers[idx] = randomInt;
		//System.out.println("Generated : " + randomInt);
	}
}

private static void showAverage(int[] numbers) {
	int sumElements = 0;

	for (int i = 0; i < numbers.length; i++) {
		sumElements += numbers[i];

	}
	System.out.println( "Average : " + (double)(sumElements)/numbers.length);
}
}


