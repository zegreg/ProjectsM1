/**
 * Abstract class that has the following methods.
 * <ul><li> Constructor (String name);
 * <li> abstract <i>execute</i> method (Strings[] strings);
 * <li> getName (): String
 * </ul>
 * @author José Oliveira
 * @since 4/11/2014
 *
 */
public abstract class ICommand {

	private String name;


	public ICommand(String name) {
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public abstract void execute(String[] strings);	

}
