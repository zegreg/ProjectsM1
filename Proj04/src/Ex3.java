import java.util.Scanner;


public class Ex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println( " Player 1 : ");
		String player1 = in.next();
		
		System.out.println(" Player 2 : ");
		String player2 = in.next();
		
		System.out.println("The game will start !");
		System.out.println(" ");
		
		int count = 0;
		
		while (count < 31) {
			
			System.out.println("Player 1 " + player1);
			int number = in.nextInt();
			count += number;
			System.out.println("The currente value is "+count);
			System.out.println(" ");
			
			if (count > 31) {
				System.out.println(" The Player " + player1 + " reached " + count);
				System.out.println("The player " + player2 +" has won. Congratulations!");
			}

			System.out.println("Player 2 " + player2);
			int number2 = in.nextInt();
			count += number2;
			System.out.println("The currente value is "+count);
			System.out.println(" ");
			
			if (count > 31) {
				System.out.println("The Player " + player2 + " reached " + count);
				System.out.println("The player " + player1 + " has won. Congratulations!");
			}
						
		}
		
		
	}

}
