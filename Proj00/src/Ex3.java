
public class Ex3 {

	/** José Oliveira 2/10/2014
	 * finding opposite ASCII value char 
	 */
	public static void main(String[] args) {
		
		// Declaração de constantes
		final   int MAX_VALUE=122;
		final   int MIN_VALUE=97;
		
		
		// Declaraçao de variáveis
		int v= 'm';
		 
		 // Verificação da condição
		 
		if (v >  96 &  v <  109 ) {
			char c= (char)(MIN_VALUE+25- (v-MIN_VALUE));
			System.out.println("O seu simétrico é : " + c);
		} else if (v > 109 & v < 123) {
			char c = (char)(MAX_VALUE-25-(v-MAX_VALUE));
			System.out.println("O seu simétrico é : " + c);
		} else{
			System.out.println("não tem caracter simétrico  ");
		}
		
		
		
	}

}
