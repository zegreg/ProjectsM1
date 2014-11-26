import java.util.ArrayList;

/**
 * 
 * Class who instance represent  a user.
 * 
 * <p>Implementation Notes:
 * <ul><li> Each user is identified by name;
 * <li> A user can receive and send messages;
 * <li> A user has the responsibility to save the last message;
 * <li> It is possible receive more messages, after obtaining the last message received.
 * </ul>
 * @author José Oliveira
 *
 */
public class User implements IUser {



	private String name;
	private Message message;



	/**
	 * Private Constructor who receives a {@link Message} by parameter
	 * @param lastmessage receive
	 */
	private User(Message message) {
		this.message = message;

	}

	/**
	 * Constructor who receive the User name
	 * @param name
	 */
	public User(String name) {
		this.name = name;

	}



	@Override
	public String getName() {
		return name;
	}


	@Override
	public String sendMessageToSender(Message message) {

		this.message = message;

		return message.getValue();

	}

	@Override
	public Message receiveMessageFromOtherUser(Message message) {

		return this.message = message;
	}


	@Override
	public Message getMessage() {
		return message;
	}

	/**
	 * Method who call the printMessage() method.
	 * @param sender
	 * @return
	 */
	public String printMessage(Sender sender){

		return sender.printMessage(this);

	}



}
