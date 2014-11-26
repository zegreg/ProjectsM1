import java.util.Scanner;

import javax.sound.sampled.Line;


public class Ex3c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println( "Formando 1 : ");
		String player1 = in.next();
		
		System.out.println("Formando 2 : ");
		String player2 = in.next();
		
		System.out.println("The game will start !");
		System.out.println(" ");
		
		int count = 0;
		
		
		while (count < 31  ) {
			
			
			int number = in.nextInt();
			System.out.println( player1 + " will add " + number);
			
			while (  number > 3) {
			System.out.println("Invalide Number : ");
			System.out.println(player1 + " try again : Choose 1,2 or 3");
			number = in.nextInt();
			System.out.println( player1 + " will add " + number);
			}
			
			count += number;
			
							
			System.out.println("The currente value is "+count);
			System.out.println(" ");
			
			
			if (count > 31 )
			{
				System.out.println(" The Player " + player1 + " reached " + count);
				System.out.println("The player " + player2 +" has won. Congratulations!");
				
				
				System.out.println(" Do you want to play again  (y/n)? ");
				
				char res = in.next().charAt(0);
				
				 if (res == 'y') {
					 count = 0;
					 System.out.println( "Formando 1 : ");
						String player1New = in.next();
						player1New = player1;
						
						System.out.println("Formando 2 : ");
						String player2New = in.next();
						player2New = player2;
					 continue;
					 
				 } else  {
					 break;
					
				}
					
			} else {
			
			
			int number2 = in.nextInt();
			System.out.println( player2 + " will add " + number2);
			while (  number2 > 3) {
				System.out.println("Invalide Number : ");
				System.out.println(player2 + " try again : Choose 1,2 or 3" );
				number2 = in.nextInt();
				System.out.println( player2 + " will add " + number2);
				}
			count += number2;
			
			
			System.out.println("The currente value is "+count);
			System.out.println(" ");
			
			if (count > 31) {
				System.out.println("The Player " + player2 + " reached " + count);
				System.out.println("The player " + player1 + " has won. Congratulations!");
				break;
			}
			}
						
		}
		
		
	}

}
