
public class App {

	
	public static void main(String[] args) {


		User user1 = new User ("Paulo");
		User user2 = new User("Carlos");
		User user3 = new User("José");
		User user4 = new User("José");
		Sender sender = new UserRegister();
		
		
		//Add user to Sender
		
		sender.registrationUser(user1);
		sender.registrationUser(user2);
		sender.registrationUser(user3);
		sender.registrationUser(user4);
	
		System.out.println("Users registados no Sender : ");
		int count = 0;
		for( User element : sender.getUsersRegistationArray() ) {
			count ++;
			System.out.println(count+ " -> "+element.getName());
		}
		System.out.println();
		
		
		
		
		//Send Message From Use1 To Sender
		
		Message message = new Message("Olá", user1);
		System.out.println("User1 envia mensagem para Sender : "+user1.sendMessageToSender(message)+ "\n");
		
		
		//Send the message receive to all register user 
		System.out.println(user1.printMessage(sender));
		System.out.println(user3.printMessage(sender));
		System.out.println(user2.printMessage(sender));

	}


}
