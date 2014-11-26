import java.util.Random;
import java.util.Scanner;


public class Ex2 {

	/** José Oliveira 9/1072014
	 *Rotate the elements of an array of integers to the right with 
	 *a certain number of revolutions.
	 * The user set the number of elements and rotations.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		// Elementos do array

		int elements = 0;

		while (elements < 2) { 
			System.out.println("Coloque o numero de elementos do array: ");
			elements = input.nextInt ();

			if (elements < 2)
				System.out.println ("-- Opção inválida --");
		}

		// Número de rotações

		int rotations = 0;

		while (rotations <= 0) { 
			System.out.println ("Coloque a quantidade de rotações: ");
			rotations = input.nextInt ();

			if (rotations <= 0)
				System.out.println ("-- Opção inválida --");
		}


		// Criar o array

		int[] arrayInput = showRandonNumberGenerator(elements);


		// Mostrar o array original

		System.out.print("Original array : [");
		for (int i = 0; i < arrayInput.length; i++){

			System.out.print(arrayInput[i] + " ");
		}
		System.out.print("]");


		//Rodar o array


		rotativeArrayRight(arrayInput, rotations);


		// Mostrar o array com rotação 

		System.out.println("\n");
		System.out.print("Rotative array : [");
		for (int i = 0; i < arrayInput.length; i++){

			System.out.print(arrayInput[i] + " ");
		}
		System.out.print("]");

	}

	private static void rotativeArrayRight(int[] arrayInput, int nRotations) {
		int lastNumber = 0;

		for (int i = 1 ; i <= nRotations; i++) {

			lastNumber = arrayInput[arrayInput.length-1];

			for (int j = arrayInput.length-2; j >= 0 ; j--) {

				arrayInput[j+1]=arrayInput[j];


			}

			arrayInput[0] = lastNumber;
		}
	}

	private static int[] showRandonNumberGenerator(int elements) {
		int [] arrayInput = new int [elements];
		Random randomGenerator = new Random();
		for (int i = 0; i < arrayInput.length; ++i){
			int randomInt = randomGenerator.nextInt(9);
			arrayInput[i] = randomInt;
			//System.out.println("Generated : " + randomInt);

		}
		return arrayInput;
	}


}


