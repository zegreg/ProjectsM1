import java.util.Scanner;


public class Ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		Scanner in = new Scanner(System.in); // l� o input e coloca-o em tokens 
		System.out.println("Insira um numero  : ");
		int numFirst = in.nextInt(); // l� o numero do System.in
		System.out.println("Introduza um segundo numero : ");
		int numSecond = in.nextInt();
		int res = 0;
		
 //  Temos que saber qual o numero que � maior
		if (numFirst >= numSecond)  // se for o primeiro numero for maior que o segundo, entao fazemos o seguinte for
		{
			for (int i = numSecond; i <= numFirst; i++)
			{
				res += i; 
			}
		}else if (numSecond > numFirst) // caso contr�rio se o segundo numero � maior que o primeiro, fazemos o segundo for
		
		{
			for (int j = numFirst; j <= numSecond; j++)
			{
				res += j;
			}
		}
		


		System.out.println("Resultado : " + res); // imprime o output
	}
}


