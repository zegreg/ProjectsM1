import java.util.Random;
import java.util.Scanner;


public class Ex2 {

	/** José Oliveira 16/10/2014
	 *shows the count of the occurrences  elements  in the array.
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);


		// Input array elements

		int elements = 0;

		while (elements < 2) { 
			System.out.println("Coloque o numero de elementos do array: ");
			elements = input.nextInt ();

			if (elements < 2)
				System.out.println ("-- Opção inválida --");
		}
		
		 // Array with elements size
		int[] vector = arrayDeveloped(elements);
		
		// Print Original Array
		showArray(vector);
				
		// Order the numbers in ascending order with insertion sort algorithm.
		ascendingSortArray(vector);
		
		//Print Array Sort
		showArray(vector);
		
		// Get the occurrence elements
		elementsRepeating(vector);
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

	private static void showArray(int[] vector) {
		System.out.print("Array : [");
		for (int i = 0; i < vector.length; i++){

			System.out.print(vector[i] + " ");
		}
		System.out.print("]");
		
		System.out.print("\n");
	}
	
	private static void elementsRepeating(int[] vector) {
	
		System.out.print("Result : [");
		
	      int count = 1; 
		  for (int i = 1; i < vector.length; i++) {
			
			  if (vector[i] != vector[i-1]) {
			  System.out.print(  count +" ");
				  count = 1;
						  
			  }	else
			  {
			      count += 1;
				  
			  }
			  
		  }

		  
		System.out.print(  count +" ");	
		
	        
	        
		System.out.print("]");

		System.out.print("\n");
		
		
		
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

	

}
