import java.util.ArrayList;
import java.util.Scanner;

/**
 * Interface class that has the following methods.
 * <ul><li> addCommand(ICommand cmd);
 * <li> execute (Strings[] strings);
 * <li> getName (): String
 * </ul>
 * @author José Oliveira
 * @since 4/11/2014
 *
 */
public interface IComplexCommand {

		
	public void addCommand(ICommand cmd); 
	
	
	public void execute(String[] strings);


	public String getName();


	

}
