import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

/**
 * Class whose instance represent a User register.
 * <p> Implementation Notes:
 * <ul><li> This Class implements {@link Sender};
 * <li> Registration User in a Sender;
 * <li> Ensure that a User message is sent to other user register in a Sender;
 * 
 * </ul>
 * 
 * 
 * @author José Oliveira
 *
 */
public class UserRegister implements Sender {

	/**
	 * array of object User
	 */
	private User[] registerUser;
	/**
	 * This is the index that represent the initial length of array
	 */
	private int index = 1;
	

	/**
	 * Constructor default
	 * Declares the User array
	 */
	public UserRegister() {
		registerUser = new User[this.index];
	}

	
	@Override
	public void sendMessage(IUser user) {
		this.registerUser = ArrayUtilsDecrease(registerUser);
		for(User u : registerUser){
			
			if(!u.getName().equals(user.getName())){
				u.receiveMessageFromOtherUser(((User) user).getMessage());



			}
		}

	}
	@Override
	public String printMessage(User u){ 
		for (User element : registerUser) {
			if (!element.getName().equals(u.getName())) {
				return(u.getName() + " Receive Message : " + element.getMessage().getValue() + " From :" + element.getName());
			} else {
				return (u.getName() + " Receive Message : " + element.getMessage().getValue() + " From :" + u.getName());
			}
		}

		return null;
	}
	@Override
	public void registrationUser(IUser user){

		if (index == 1) {
			this.registerUser = UserRegister.ArrayUtilsIncrease(registerUser);
			registerUser[index - 1]= (User) user;
			index++;


		} else{		
			if (existsUserInRegister(user, registerUser) == false) {
				this.registerUser = UserRegister.ArrayUtilsIncrease(registerUser);
				registerUser[index-1] = (User) user;
				index++;

			} 
		}

	}
	

	public User[] getUsersRegistationArray() {
		this.registerUser = ArrayUtilsDecrease(registerUser);
		return registerUser;
	}
	

	/**
	 * Return true if a given value doesn't exists in a array otherwise return false
	 * 
	 * @param value Value to be searched
	 * @param values Value Arrays
	 * @return boolean Flag
	 */
	static boolean existsUserInRegister(IUser value, IUser[] values)  {
		if (values == null){
			return false;
		}
		if (value == null){
			return false;
		}
		for (IUser element: values){
			if ((element != null) && element.getName().equals(value.getName())) {
				return true;
			}
		}

		return false;
	}
	
	/**
	 * static method to increase one value size to a given array receive by parameter
	 * @param usersRegistationArray
	 * @return array with a larger size
	 */
	static User[] ArrayUtilsIncrease(User[] usersRegistationArray){

		User []newArray = new User [usersRegistationArray.length + 1];

		for (int i = 0; i < usersRegistationArray.length; i++) {
			newArray[i] = usersRegistationArray[i];
		}

		return newArray;
	}

	
	/**
	 * static method to decrease one value size to a given array receive by parameter
	 * @param usersRegistationArray
	 * @return array with a smaller size
	 */
	static User[] ArrayUtilsDecrease(User[] usersRegistationArray){

		User []newArray = new User [usersRegistationArray.length - 1];

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = usersRegistationArray[i];
		}
		return newArray;
	}



	
}
