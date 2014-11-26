
/**
 * Class whose instance represent the command minus.
 * <ul><li> Identify correct digit.
 * <li> Realize the addition operation ( value 1 - value 2).
 * <li> Show the results.
 *  </ul>
 * @author José Oliveira
 * @since 4/11/2014
 *
 */
public class SumCmd extends ICommand {

	public SumCmd() {
		super("sum");
	}


	@Override
	public void execute(String[] strings) {
		int[] results = new int[strings.length];
		boolean isACorrectNumber = true;
		for (int i = 1; i < strings.length; i++) {

			if (isDigit(strings[i]) ) {
				results[i] = Integer.parseInt(strings[i]);
				isACorrectNumber = true;

			} else{

				isACorrectNumber = false;
				break;
			}

		}

		System.out.println((isACorrectNumber == true)? "Result : " +(results [1] + results [2]) :  "Result : Put a Correct Numnber ") ;
	}


	public boolean isDigit(String s) { 

		for (int i = 0; i < s.length(); i++) {  
			char ch = s.charAt(i);  
			if (ch < 48 || ch > 57)  
				return false;  
		}  
		return true;  
	} 

}
