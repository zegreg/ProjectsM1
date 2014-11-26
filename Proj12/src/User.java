import java.awt.List;
import java.util.ArrayList;

/**
 * Cada utilizador tem um nome. Um utilizador pode receber e enviar mensagens. è da responsabilidade do utilizador guardar
 * a ultima mensagem.
 * @author José Oliveira
 *
 */
public class User implements Sender, Receiver{

	private String name;
	private java.util.List<Message> messageList;
	private UserRegister register;
	
	public User(String name, int num) {
		this.name = name;
		register = new  UserRegister(num);
		messageList = new ArrayList<Message>();
	}
	
	public String getName() {
		return name;
	}
	
	public java.util.List<Message> getMessageList() {
		return messageList;
	}


	@Override
	public void sendMessageToSender( Message messageToPublish) {
	
			 this.messageList.add(messageToPublish);
		
		
		
	}


	@Override
	public void ReceiverMessage(Message message) {
		 	this.messageList.add(message);
		
	}

	@Override
	public boolean registerUser(User user) {
		
		if (register.addRegister(user) == true) {
			return true;
		}
		return false;
	}

	@Override
	public boolean removeUser( User user) {
		if (register.removeRegister(user) == true) {

			return true;
		}
		return false;

	}

	public String print(User user){
		String senderUser = null;
		String value = null;
		for (Message element : messageList) {
			try {
				if (!element.getUser().getName().equals(user)) {
				senderUser = element.getUser().getName();
				value = element.getValue();
			}
			} catch (Exception e) {
				
			return "Invalid user";
			}
		}

		return "From : "+ senderUser +" \nMessage: "+ value;

	}

}
