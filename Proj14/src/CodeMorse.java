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
	 * Este m�todo retorna uma tabela com os c�digos morse lidos do ficheiro de texto com nome filename.
	 *  Cada linha do ficheiro de texto cont�m um caracter seguido do respetivo c�digo em morse (morseCodes.txt em anexo). 
	 *  Assim, cada elemento do seu array ter� um car�cter e o respectivo c�digo associado. 
	 *  Considere que o tamanho do array � igual ao n�mero de car�cters no ficheiro de texto fornecido.
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
	 * Uma vez que se pretende que a codifica��o seja suportada para letras mai�sculas e min�sculas, 
	 * este m�todo servir� para criar uma tabela alargada para esse efeito.
	 *  Assim, este m�todo recebe por par�metro um array de c�digos e deve retornar um novo array
	 *   que contemple todos os caracteres mencionados no in�cio do exerc�cio.
	 *   Para isto deve ter em conta que:
	 *   O array a retornar pode ter elementos sem valor;
	 *   A letra �z� � representada pelo c�digo decimal 122.
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
	 * Este m�todo codifica para o stream w o texto lido do stream r.
	 *  O texto � codificado linha a linha e o c�digo de cada car�cter � obtido da tabela tableIndex.
	 *  O separador entre c�digos � o espa�o, pelo que o car�cter espa�o � duplicado. 
	 *  Caracteres que n�o constem na tabela s�o ignorados.
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
	 * Este m�todo descodifica para o stream w o texto lido do stream r.
	 *  Assuma que o stream r foi produzido pelo m�todo encodeChar, 
	 *  e tenha em aten��o a quest�o dos espa�os referida anteriormente.
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
	
	

