
public class Ex2 {

	/** José Oliveira
	 * finding match interval 
	 */
	public static void main(String[] args) {
		
		
		// Declaração e inicialização de uma variável
		int i=5;
		
		// expoente recorrendo à classe pow da biblioteca Math
		double j=Math.pow(i, 3);
		
		// Declaração do numero inteiro dos carateres
		int a = 'a';
		int z = 'z';
		int o = '0';
		int l = '9';
		int A = 'A';
		int Z = 'Z';

		// Verificação das condições do intervalo
		
		if ((i < l) & ( i > o)) // entre 48 e 57
		{
			System.out.println(" A variável i pertence ao intervalo de caracteres ASCII : 0 a 9");
		} else if ((i < z) & (i > a)) //entre 97 e 122
		{
			System.out.println(" A variável i pertence ao intervalo de caracteres ASCII : a a z");
		} else if((i < Z) & (i > A )) // entre 65 e 90
		{
			System.out.println(" A variável i pertence ao intervalo de caracteres ASCII : A a Z");
		} else {
			System.out.println(" Um numero inteiro elevado a 3 não se encontra nos intervalos mencionados ");
		}
		
		
	}

}
