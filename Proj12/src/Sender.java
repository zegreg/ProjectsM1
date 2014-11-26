
public interface Sender {


	/**
	 * Abstract Method that allows a message should not be received by the user sending it
	 * @param user
	 */
	public void sendMessage(IUser user);

	/**
	 * Abstract Method that allows a User registration
	 * @param user
	 */
	public void registrationUser(IUser user);

	/**
	 * Abstract Method to print the User Information in a Sender
	 * @param u User
	 * @return String
	 */
	public String printMessage(User u);

	
	
	/**
	 * Abstract Method return an array of User registration
	 * @return
	 */
	public User[] getUsersRegistationArray();




}
