import java.util.Scanner;


public class Ex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println( "Enter a number ");
		int number = in.nextInt();
		String coluna = "";
		String linha = "";

		for (int i = 1; i <= number; i++)
		{
			linha += ""  + i ;


			switch (i)
			{
			case 1:coluna =  "0" + "0" + "0" + "0" ;
			linha = coluna + linha;
			System.out.println(linha);
			break;
			case 2:coluna =  "0" + "0" + "0"  ;
			linha = coluna + linha +linha;
			System.out.println(linha);
			break;
			case 3:coluna =  "0" + "0"  ;
			linha = coluna + linha+linha+linha;
			System.out.println(linha);
			break;
			case 4:coluna =  "0" ;
			linha = coluna + linha + linha + linha + linha;
			System.out.println(linha);
			break;
			case 5:
				linha =  linha+linha+linha+linha+linha;
				System.out.println(linha);
				break;
			}
			linha = "";

		}
	}

}
