
public class Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// Declara��o da vari�vel e inicializa��o
		
		int i=12;
		
		// Um numero � par quando o resto da sua divis�o por ele proprio � 0
		
		double d = (double)i / 2;
		double s = i * 2;
		System.out.println(((s % 2) == 0));
		System.out.println(( d % 2) == 0);
		 
		if ((((s % 2) == 0) || (( d % 2) == 0)) && ( (i % 2) == 0)) // se a condi��o se verificar ent�o a vari�vel i � par
		{
			System.out.println("O valor  " + i + " � par " );
		}else // caso contr�rio a vari�vel i � impar
		{
			System.out.println("O valor  " + i + " � impar " );
		}
 
	}
}


