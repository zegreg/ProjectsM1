
public class Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// Declaração da variável e inicialização
		
		int i=12;
		
		// Um numero é par quando o resto da sua divisão por ele proprio é 0
		
		double d = (double)i / 2;
		double s = i * 2;
		System.out.println(((s % 2) == 0));
		System.out.println(( d % 2) == 0);
		 
		if ((((s % 2) == 0) || (( d % 2) == 0)) && ( (i % 2) == 0)) // se a condição se verificar então a variável i é par
		{
			System.out.println("O valor  " + i + " é par " );
		}else // caso contrário a variável i é impar
		{
			System.out.println("O valor  " + i + " é impar " );
		}
 
	}
}


