import java.util.ArrayList;

/**
 * As mensagens são compostas pelo nome do utilizador que a criou e pelo seu texto
 * @author José Oliveira
 *
 */
public class  Message  {


	private User user;
	private String value;
	UserRegister register;
	public Message() {

	}

	public Message(String value, User user) {
		this.value = value;
		register = new UserRegister();

		if (user.registerUser(user));
		this.user = user;

	}

	public String getValue() {
		return value;
	}

	public User getUser() {
		return user;
	}


	
}
