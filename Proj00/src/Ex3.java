
public class Ex3 {

	/** Jos� Oliveira 2/10/2014
	 * finding opposite ASCII value char 
	 */
	public static void main(String[] args) {
		
		// Declara��o de constantes
		final   int MAX_VALUE=122;
		final   int MIN_VALUE=97;
		
		
		// Declara�ao de vari�veis
		int v= 'm';
		 
		 // Verifica��o da condi��o
		 
		if (v >  96 &  v <  109 ) {
			char c= (char)(MIN_VALUE+25- (v-MIN_VALUE));
			System.out.println("O seu sim�trico � : " + c);
		} else if (v > 109 & v < 123) {
			char c = (char)(MAX_VALUE-25-(v-MAX_VALUE));
			System.out.println("O seu sim�trico � : " + c);
		} else{
			System.out.println("n�o tem caracter sim�trico  ");
		}
		
		
		
	}

}
