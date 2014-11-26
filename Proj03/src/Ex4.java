import java.util.Random;
import java.util.Scanner;


public class Ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		random.nextInt(); // valor aleatório entre Integer.MIN_VALUE (-2147483648)
		// Integer.MAX_VALUE (2147483647)
		 int c= random.nextInt(10); // valor aleatório entre 0 e 9
		System.out.println(c);
		Scanner input = new  Scanner(System.in);
		System.out.println("Enter a number : ");
		  
		  int count = 0;
		while ( c != 0) {
			int numberChosen = input.nextInt();
		     count++;
		     //System.out.println(count);
		     if (numberChosen < c) {
		    	 System.out.println("O valor é maior que :" + numberChosen);
		    	 
		    	 
			} else if (numberChosen > c) {
				 System.out.println("O valor é menor que :" + numberChosen);
				 
				 
			} else if (numberChosen == c) {
				 System.out.println("Acertou : numeros de tentativas :" + count);
				 
				
			}
		    
		}
		
		
		
	}

}
