import java.util.ArrayList;

/**
 *Class whose insctance represent a Messages
 *<p> Implementation Notes:
 *<ul><li>Message are composed by user name and its text
 *</ul>
 * @author José Oliveira
 *
 */
public class  Message  {


	private User user;
	private String value;


	/**
	 * Constructor
	 * @param value String
	 * @param user User
	 */
	public Message(String value, User user) {
		this.value = value;
		this.user = user;


	}

	/**
	 * Method that get the text message
	 * @return
	 */
	public String getValue() {
		return value;
	}


}
