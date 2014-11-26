import static org.junit.Assert.*;

import org.junit.Test;


public class UserTest {
	
	User user1 = new User ("Paulo");
	User user2 = new User("Carlos");
	User user3 = new User("Paulo");
	Sender sender = new UserRegister();
	
	
	@Test
	public void shouldRegisterUserInASender() {
		
		//Arrange
		
		
		//Act
		sender.registrationUser(user1);
		sender.registrationUser(user2);
		
		// Assert
		assertTrue(sender.getUsersRegistationArray()[0].getName().equals("Paulo"));
		
	}

	@Test
	public void shouldRegisterTheSameUserInASender() {
		
		//Arrange
		
		
		//Act
		sender.registrationUser(user1);
		sender.registrationUser(user3);
		sender.registrationUser(user2);
		
		// Assert
		
		assertTrue(sender.getUsersRegistationArray().length == 2);
		
	}



	@Test
	public void shouldUserSendMessageToAnotherUser(){
		
		//Arrange Act
		Message message = new Message("Olá", user1);
		sender.registrationUser(user1);
		sender.registrationUser(user2);
		user1.sendMessageToSender(message);


		sender.sendMessage(user1);
		
		//Assert
		assertTrue(user2.getMessage().getValue().equals(message.getValue()));
				


	}
	
	@Test
	public void shouldUserPrintCorrectMessageInformationFromAnotherUser(){
		
		//Arrange Act
		Message message = new Message("Olá", user1);
		sender.registrationUser(user1);
		sender.registrationUser(user2);
		user1.sendMessageToSender(message);


		sender.sendMessage(user1);
		
		
		
		
		//Assert
		assertFalse(user2.printMessage(sender).equals(user2.getName()
				+ "Receive Message : " + user2.getMessage().getValue() + " From :" +user1.getName()));


	}


	
	
	
	
}
