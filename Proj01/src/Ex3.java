import java.util.Scanner;


public class Ex3 {

	/**
	 * @param args
	 */
// Utilizado o método de o modo a eliminar codigo. Foi uma experiencia testada
	public static int method (int numFirst, int numSecond, int numThird){
		int res = 0;

		for (int i = numSecond; i <= numFirst; i++)
		{
			int mult = i % numThird;
			if (mult == 0) {
				res += i; 
			}

		}

		return res;
	}

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in); // lê o input e coloca-o em tokens 
		System.out.println("Insira um numero  : ");
		int numFirst = in.nextInt(); // lê o numero do System.in
		System.out.println("Introduza um segundo numero : ");
		int numSecond = in.nextInt();
		System.out.println("Introduza o multiplo : ");
		int numThird = in.nextInt();

		int res = 0;

		//  Temos que saber qual o numero que é maior

		if (numFirst >= numSecond)  // se for o primeiro numero for maior que o segundo, entao fazemos o seguinte for
		{
			res = method(numFirst, numSecond, numThird);
			/*for (int i = numSecond; i <= numFirst; i++)
			{
				int mult = i % numThird;
				 if (mult == 0) {
					res += i; 
				}

			}*/
		}else if (numSecond > numFirst) // caso contrário se o segundo numero é maior que o primeiro, fazemos o segundo for

		{
			res = method(numSecond, numFirst, numThird);

		}

		System.out.println("Resultado : " + res); // imprime o output
	}
}


