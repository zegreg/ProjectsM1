
public class CodeCharImplemented implements CodeChar {

	private char character;
	private String codeMores;
	
	
	
	public CodeCharImplemented( char character, String codeMorse) {
		this.character = character;
		this.codeMores = codeMorse;
	}
	
	
	
	@Override
	public char getChar() {

		return character;
	}

	@Override
	public String getCode() {

		return codeMores;
	}

}
