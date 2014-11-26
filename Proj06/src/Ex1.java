import java.lang.reflect.Array;
import java.security.acl.LastOwnerException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;


public class Ex1 {

	/** José Oliveira 10/10/2014
	 *Shows all values that occur only once in one array
	 */
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);


		// Array elements

		int elements = 0;

		while (elements < 2) { 
			System.out.println("Coloque o numero de elementos do array: ");
			elements = input.nextInt ();

			if (elements < 2)
				System.out.println ("-- Opção inválida --");
		}
		
		 // Array creation
		int[] vector = arrayDeveloped(elements);
		
		// Print Original Array
		showArray(vector);
		
		
		// Order the numbers in ascending order with insertion sort algorithm.
		ascendingSortArray(vector);
			if (vector [vector.length-1] == vector [vector.length-2]) {
				showArray(vector);
				elementsRepeating(vector, elements);
				
			}
			
			else  {
				
				descendingSortArray(vector);
				showArray(vector);
				elementsRepeating(vector, elements);
			}
		
	}



	private static void descendingSortArray(int[] vector) {
		for (int i = 1 ; i < vector.length ; i++)
		{
			int key = vector[i];
			int j = i-1 ;
			while(j >= 0 && key > vector[j] )
			{
				vector[j+1] = vector[j];
				j = j - 1;
			}

			vector[j + 1] = key;
		}
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
	
	private static void elementsRepeating(int[] vector, int elements) {
	
		boolean isEqual = false ;
		System.out.print("Result : [");
		
		  int last = -1 ; 
			  
		  for (int i = 0; i < vector.length; i++) {

			  
				  if (i != vector.length-1 ) { 
					  if (vector[i]!= last  && vector [i] != vector [i+1]) {
						  isEqual = true;
						  System.out.print(  vector[i] +" ");
					  }
					  last = vector[i];

				  }
			  

		  }
		
		
	        
	        
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
