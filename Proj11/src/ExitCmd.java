/**
 * Class whose instance represent the command exit.
 * <p>Finish the Application.
 *  
 * @author José Oliveira
 * @since 4/11/2014
 *
 */
public class ExitCmd extends ICommand {
	
	
	
	public ExitCmd() {
		super("exit");
		
	}

	@Override
	public void execute(String[] strings) {
		System.exit(0);
		
	}
	
	
}
