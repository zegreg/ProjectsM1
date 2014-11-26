import java.util.ArrayList;

/**
 * Class whose instance represent a container of {@link ICommand}
 * <p>Implements {@link IComplexCommand}
 * @author José Oliveira
 *
 */
public class CommandContainer implements IComplexCommand {


	private ICommand[] listCmd ;

	int index = 2;

	int maxCmd;
	String name;

	public CommandContainer(int num) {
		this.maxCmd = num;
		listCmd = new ICommand[num];
		listCmd[0] = new HelpCmd(name);
	}

	
	
	@Override
	public String getName() {
	
		return "help";
	}

	

	@Override
	public void addCommand(ICommand cmd) {

		
		for (int i = index - 1; i < index; i++ ) {
			if (listCmd[i] == null) {
				listCmd[i] = cmd;
			}
			
		}

		index++;
	}

	@Override
	public void execute(String[] strings) {


		for (int j = 0; j < listCmd.length; j++) {

			if (strings[0].equals(listCmd[j].getName())) {
				listCmd[j].execute(strings);
			}


		}


	}

}


