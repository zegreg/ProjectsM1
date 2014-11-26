import java.util.Random;
import java.util.Scanner;


public class Ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = input.nextInt();

		Random random = new Random();
		int c= random.nextInt(10);

		int speedHorse1 = 0;
		int speedHorse2 = 0;
		int speedHorse3 = 0;
		int speedHorse4 = 0;


		while ( (speedHorse1 < 100) && (speedHorse2 < 100) && (speedHorse3 < 100) && (speedHorse4 < 100)) {

			int runHorse1 = (random.nextInt(11))*2;
			System.out.println( "cavalo (1)" +speedHorse1);
			speedHorse1 += runHorse1;

			int runHorse2 = (random.nextInt(11))*2;
			System.out.println( "cavalo (2)" +speedHorse2);
			speedHorse2  += runHorse2;

			int runHorse3 = (random.nextInt(11))*2;
			System.out.println( "cavalo (3)" +speedHorse3);
			speedHorse3 += runHorse3;

			int runHorse4 = (random.nextInt(11))*2;
			System.out.println( "cavalo (4)" + speedHorse4);
			speedHorse4 += runHorse4;




		}

		if ((speedHorse4 > speedHorse2) && (speedHorse4 > speedHorse3) && (speedHorse4 > speedHorse1)) {
			System.out.println( "cavalo (4)" + speedHorse4);
			System.out.println( "Terminou acorrida : O vencedor foi cavalo (4) "+"  A sua escolha foi "+ number);
			

		} else if ((speedHorse3 > speedHorse2) && (speedHorse3 > speedHorse1) && (speedHorse3 > speedHorse4)) {
			System.out.println( "cavalo (3)" +speedHorse3);
			System.out.println( "Terminou acorrida : O vencedor foi cavalo (3)"+" A sua escolha foi "+ number);
			
		}else if ((speedHorse2 > speedHorse3) && (speedHorse2 > speedHorse1) && (speedHorse2 > speedHorse4)) {
			System.out.println( "cavalo (2)" +speedHorse2);
			System.out.println( "Terminou acorrida : O vencedor foi cavalo (2)" +" A sua escolha foi "+ number);

		} else if ((speedHorse1 > speedHorse2) && (speedHorse1 > speedHorse3) && (speedHorse1 > speedHorse4)) {
			System.out.println( "cavalo (1)" +speedHorse1);
			System.out.println( "Terminou acorrida : O vencedor foi cavalo (1)" +" A sua escolha foi "+ number);

		}



	}

}


