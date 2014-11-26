import java.util.Random;
import java.util.Scanner;

/** 
 * This application represent a instance of  asterisc histogram 
 * 
 *<p> Implementation notes:
 * <ul><li> Creates an array which receives the input numbers. 
 * <li>Each numbers input are converted into their digits and added to a new array.
 *<li> Digits are put in ascending order.
 * <li>Identify and count the repetitions digits.
 * <li>Identify the max count of repetitions.
 * <li>Show a asterisc diagram.
 * </ul>
 * @author José Oliveira
 */
public class Ex3 {

	

	public static void main(String[] args) {
		
		//Creates an array to save the positive numbers input with a given length.
		int[] list = new int [20];
		
		//Creates an array with positive numbers input
		int [] listNumbersInput = inputNumbers(list);
		
		// Creates an array with the digits of numbers input
		int [] digitNumbersInput = digitNumbers(listNumbersInput);
		
		// Print Original Array
		showArray(digitNumbersInput);
		
		// Order the numbers in ascending order with insertion sort algorithm.
		ascendingSortArray(digitNumbersInput);

		// Main Array for Asterisc Histograma
		int[] mainArray = {0,1,2,3,4,5,6,7,8,9};

		// Method to determine the repeated numbers in the main array
		int[] arrayOfDigitsrepetions = showNumbersRepetitionbyIndex(digitNumbersInput, mainArray);
		
		//Identify the largest repetition digits
		int _max = maxRepetition(arrayOfDigitsrepetions);

		// Method to show the Asterisc Histogram
		showAsteriscHistogrambyIndexNumberRepetion(arrayOfDigitsrepetions, _max);

	}
	
	
	private static int [] digitNumbers ( int [] listNumbersImput){	
		
		
		int idx = 0;
		int lastDigit = 0;
		int list [] = new int [100];
		for (int i = 0; i < listNumbersImput.length; i++) {
			
			
			int temp  = listNumbersImput[i];
			do {
				
			lastDigit = (temp %= 10);
			list[idx] = lastDigit;
			idx++;
			listNumbersImput[i] /= 10;
			temp = listNumbersImput[i];
			} while (temp > 0);
		
		
	}
		int [] newList = new int [idx];
		for(int i = 0; i < idx ; i++){
			newList[i] = list[i];
		}
		
		
		return newList;
}
	
	private  static int [] inputNumbers(int list []){

		Scanner input = new Scanner(System.in);
		int index = 0;
		int elements = 0;

		do {
			System.out.println("Valor: ");
			elements = input.nextInt ();
			list[index] = elements;
			index ++;

		} while (elements > 0);


		int [] numbers = new int[index-1];
		for (int i = 0; i < index-1; i++) {
			numbers [i] = list [i];
		}
		return numbers;

	}

	private static void showAsteriscHistogrambyIndexNumberRepetion(
			int[] ArrayTest, int max) {
		for (int i = max; i > 0; i--) 
		{
			for (int j = 0; j < 10; j++)
			{

				if (ArrayTest[j] >= i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			System.out.println( "\n");

		}

		for (int i = 0; i < 10; i++)
			System.out.print(i + " ");
	}

	private static int[] showNumbersRepetitionbyIndex(int[] numbers,
			int[] arraySort) {
		int[] ArrayTest = new int[10];
		int lastNumber = -1;
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < arraySort.length; j++) {

				if (numbers[i] == arraySort[j] && numbers[i]== lastNumber) {
					ArrayTest[j] = count++;
					lastNumber = numbers[i];



				}
				else if (numbers[i] == arraySort[j] && numbers[i] != lastNumber){
					count = 1;
					ArrayTest[j] = count;
					lastNumber = numbers[i];
					count++;

				}


			}
		}
		System.out.print("Repetitions : [");
		for (int i = 0; i < ArrayTest.length; i++) {

			System.out.print( ArrayTest [i]+" ");
		}
		System.out.println("]");


		System.out.println( "\n");
		return ArrayTest;
	}

	private static int maxRepetition(int [] ArrayTest){
		
		int max = ArrayTest [0];
		
		for(int i = 1; i< ArrayTest.length; i++){
			if(ArrayTest[i] > max)
				max =ArrayTest[i];
		}
		
		return max;
		
	}
	
	private static int[] arrayDeveloped(int elements) {

		int [] vector = new int [elements];
		Random randomGenerator = new Random();

		for (int i = 0; i < vector.length; ++i){
			int randomInt = randomGenerator.nextInt(9);
			vector[i] = randomInt;

		}
		return vector;
	}

	private static void showArray(int[] vector) {
		System.out.print("Array : [");
		for (int i = 0; i < vector.length; i++){

			System.out.print(vector[i] + " ");
		}
		System.out.print("]");

		System.out.print("\n");
	}
	
	private static void ascendingSortArray(int[] vector) {
		for (int i = 1; i < vector.length; i++)
		{
			int key = vector[i];
			int j = i - 1;
			while(j >= 0 && key < vector[j] )
			{
				vector[j + 1] = vector[j];
				j = j - 1;
			}

			vector[j + 1] = key;
		}
	}
}

