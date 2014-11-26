import java.util.ArrayList;
import java.util.Set;


public class UserRegister {

	User[] usersRegistationArray;
	int index = 0;
	User temp;
	int maxNum;
	boolean isIndexNull = true;
	
	public UserRegister(int num) {
		this.maxNum = num;
		usersRegistationArray = new User[num];
	}
	
	public UserRegister() {
		// TODO Auto-generated constructor stub
	}

	public User[] getUsers() {
		return usersRegistationArray;
	}
	
		
	public boolean addRegister( User user) {

		if (index == 0) {
			usersRegistationArray[0] = user;
			index++;
            return true;
		} else{		
			if (existsUserInResister(user, usersRegistationArray) == false) {
				usersRegistationArray[index] = user;
				index++;
				return true;
			} 
		}
		return false;
	}

	
	/**
	 * Retorna se um dado valor existe dentro do array de valores do mesmo tipo.
	 * Caso um dos par�metros seja nulo, a execu��o do m�todo ser� interrompida e <code>FALSE</code> retornado.
	 * @param value Valor a ser pesquisado
	 * @param values Array de valores
	 * @return boolean Flag indicando se o valor foi encontrado ou n�o
	 */
	public static boolean existsUserInResister(User value, User[] values)  {
		if (values == null){
			return false;
		}
		if (value == null){
			return false;
		}
		for (User element: values){
			if ((element != null) && element.getName().equals(value.getName())) {
				return true;
			}
		}

		return false;
	}


	public void list (){
		
		for (int i = 0; i < usersRegistationArray.length; i++) {
			System.out.println(usersRegistationArray [i]);
		}
		
	}

	public boolean removeRegister(User user) {
		// TODO Auto-generated method stub
		return false;
	}
}
