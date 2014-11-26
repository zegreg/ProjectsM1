import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;


public class App14 {

	public static void main(String[] args) throws IOException {


		CodeChar[] morseTable;
		String  source = "morseCodes.txt";
		morseTable = CodeMorse.getMorseTable(source);

		for (int i = 0; i < morseTable.length; i++) {
			System.out.println(morseTable[i].getChar() + " " + morseTable[i].getCode());
		}

		CodeChar[] morseTabl1;

		
		
		morseTabl1 = CodeMorse.makeTableIndex(morseTable);


		for (int i = 0; i < morseTabl1.length; i++) {
			System.out.println(morseTabl1[i].getChar() + " " + morseTabl1[i].getCode());
		}



//		BufferedReader r = new BufferedReader(new FileReader("morseEncode.txt"));
//		PrintWriter w = new PrintWriter("textInCodeMorse.txt");
//
//		CodeMorse codeMorse = new CodeMorse();
//		codeMorse.encodeChar(r, w, morseTabl1);
		
		
		BufferedReader r1 = new BufferedReader(new FileReader("textInCodeMorse.txt"));
		PrintWriter w1 = new PrintWriter("textInEnglish.txt");
		
		CodeMorse codeMorse1 = new CodeMorse();
		codeMorse1.decodeChar(r1, w1, morseTabl1);


	}
}
