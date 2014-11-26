/**
 * Class whose instance represent the command print.
 * <p>show a the message put as a parameter.
 *  
 * @author José Oliveira
 * @since 4/11/2014
 *
 */
public class PrintCmd extends ICommand {

	public PrintCmd() {
		super("print");
	}



	@Override
	public void execute(String[] strings) {
		String results = "";

		for (int i = 1; i < strings.length; i++) {
			results += strings[i]+ " ";
		}

		
		System.out.println( "Print :" +results);
	}

	
}
