/**
 * Um emissor pode registar
 * @author Jos� Oliveira
 *
 */
public interface Sender{


	public boolean registerUser(  User user) ;
	
	public boolean removeUser(  User user) ;

	public void sendMessageToSender(Message message);
}