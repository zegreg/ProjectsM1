import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;







public class CodeMorse {

	public static CodeCharImplemented[] morseTable;
	
	
	/**
	 * Este método retorna uma tabela com os códigos morse lidos do ficheiro de texto com nome filename.
	 *  Cada linha do ficheiro de texto contém um caracter seguido do respetivo código em morse (morseCodes.txt em anexo). 
	 *  Assim, cada elemento do seu array terá um carácter e o respectivo código associado. 
	 *  Considere que o tamanho do array é igual ao número de carácters no ficheiro de texto fornecido.
	 * @param filename
	 * @return
	 * @throws IOException 
	 */
	public static CodeChar[] getMorseTable( String filename ) throws IOException{

		BufferedReader br = new BufferedReader(new FileReader(filename));

		morseTable = new CodeCharImplemented[ 36 ];
		String nextLine = null;
		int index = 0;

		while( (nextLine = br.readLine()) != null )
		{
			morseTable[ index++ ] = new CodeCharImplemented(nextLine.charAt( 0 ), nextLine.split(" ")[ 1 ]);
			
		}
		return morseTable;

	}


	
	/**
	 * Uma vez que se pretende que a codificação seja suportada para letras maiúsculas e minúsculas, 
	 * este método servirá para criar uma tabela alargada para esse efeito.
	 *  Assim, este método recebe por parâmetro um array de códigos e deve retornar um novo array
	 *   que contemple todos os caracteres mencionados no início do exercício.
	 *   Para isto deve ter em conta que:
	 *   O array a retornar pode ter elementos sem valor;
	 *   A letra ‘z’ é representada pelo código decimal 122.
	 * @param codes
	 * @return
	 */
	public static CodeChar[] makeTableIndex( CodeChar[] codes ){

		CodeCharImplemented[]  tableIndex = new CodeCharImplemented[36+26 +2];


		
		
		for (int i = 0; i < morseTable.length; i++) 
		{

			tableIndex[i] = morseTable[i];

		}

		char character = 97 ;
		int index = 10;
		
		for (int i = morseTable.length; i < tableIndex.length-2; i++)
		{

			tableIndex[i] = new CodeCharImplemented(character ++, morseTable[index ++].getCode());

		}		

		tableIndex[tableIndex.length -1 ] = new CodeCharImplemented(' ', " ");
		tableIndex[tableIndex.length -2 ] = new CodeCharImplemented('\n', "\r\n ");
		return tableIndex;
	}




	
	/**
	 * Este método codifica para o stream w o texto lido do stream r.
	 *  O texto é codificado linha a linha e o código de cada carácter é obtido da tabela tableIndex.
	 *  O separador entre códigos é o espaço, pelo que o carácter espaço é duplicado. 
	 *  Caracteres que não constem na tabela são ignorados.
	 * @param r
	 * @param w
	 * @param tableIndex
	 * @throws IOException 
	 */
	public static void encodeChar(Reader r, Writer w, CodeChar[] tableIndex) throws IOException{
		
		
		BufferedReader fileReader = new BufferedReader(r);
		BufferedWriter bufferedWriter = new BufferedWriter(w);
		
		String character ;
		String[] code;
		int count = 1;
		while ((character =  fileReader.readLine() )!= null) {
			for (int i = 0; i < character.length(); i++) {
				code = new String[count ++];
				
				for (int j = 0; j < tableIndex.length; j++) {
					if (character.charAt(i) == tableIndex[j].getChar()) {
						code[i] = tableIndex[j].getCode() + " ";
						break;
					}else{
						code[i] ="";
					}
					
				}
				
				bufferedWriter.write(code[i]);
			}

		}
		fileReader.close();
		bufferedWriter.close();


	}
	
	
	/**
	 * Este método descodifica para o stream w o texto lido do stream r.
	 *  Assuma que o stream r foi produzido pelo método encodeChar, 
	 *  e tenha em atenção a questão dos espaços referida anteriormente.
	 * @param r
	 * @param w
	 * @param decodeTable
	 * @throws IOException 
	 */
	public static void decodeChar(BufferedReader r, PrintWriter w, CodeChar[] decodeTable) throws IOException{
		BufferedReader fileReader = new BufferedReader(r);
		BufferedWriter bufferedWriter = new BufferedWriter(w);

		String [] morseLetter = new String[decodeTable.length] ;
		String morseLine = null;
		char [] decode = new char [decodeTable.length +1];
		
		
		while ((morseLine =  fileReader.readLine() )!= null) {

			morseLetter = morseLine.split(" ");

			for (int i = 0; i < morseLetter.length; i++) {
			
				for (int j = 0; j < decodeTable.length; j++) {
					
					
					if ( morseLetter[i].equals(decodeTable[j].getCode())) {
						
						decode [i] = decodeTable[j].getChar();
						break;
					}
				}

			}

			bufferedWriter.write(decode);
		}

		fileReader.close();
		bufferedWriter.close();

	}
}
	
	

