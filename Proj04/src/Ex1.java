import java.util.Scanner;


public class Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner input = new Scanner(System.in);
 System.out.println("Enter a number : ");
 int number = input.nextInt();
int count = 0;

 
 for (char i =  (char) (number + 96)  ; i < 'z';  i += number) {
	 count++;
	System.out.print((count != (Math.round(25/number)))?(int)i +"-":(int)i);
}
 
 
 
	}

}
