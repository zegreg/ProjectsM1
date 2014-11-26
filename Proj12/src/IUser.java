/**
 * Interface who has the following methods :
 * <ul><li> getName();
 * <li> getMessage();
 * <li> receiveMessageFromOtherUser();
 * <li> sendMessageToSender();
 * </ul>
 * @author José Oliveira
 *
 */
public interface IUser {

	/**
	 * Abstract Method to get the User name
	 * @return
	 */
	public String getName();	
	
	/**
	 * Abstract Method to get the last message
	 * @return Message message
	 */
	public Message getMessage();
	
	/**
	 * Abstract Method that allows the User receive a message from other User
	 * @param message
	 * @return Message message
	 */
	public Message  receiveMessageFromOtherUser(Message message);
	
	/**
	 * Abstract Method that allows User send a Message
	 * @param message
	 * @return String message
	 */
	public String sendMessageToSender(Message message);



}
