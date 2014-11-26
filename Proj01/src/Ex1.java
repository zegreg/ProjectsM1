import java.util.Scanner;


public class Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); // lê o input e coloca-o em tokens 
		System.out.println("Insira um numero inteiro : ");
		int num = in.nextInt(); // lê o numero do System.in
		int res = 0;
		for (int i = 1; i <= num; i++) {
			res += i; // faz a soma dos numeros até ao input. Se colocar 6 no input, o res = 1 + 2 + 3 + 4 + 5 + 6 = 21
		}
		System.out.println("Resultado : " + res); // imprime o output
	}

}
