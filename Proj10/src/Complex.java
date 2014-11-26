import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Class, that extends {@link Evaluation}, and whose instance represent a Collection of Evaluation
 * 
 * <p> Implementation Notes:
 * <ul><li> Make a Collection of Evaluation
 * <li> Add new Evaluation elements
 * <li> Output the Evaluation Information
 * </ul>
 * @author José Oliveira
 *
 */
public abstract class Complex extends Evaluation{

	java.util.List <Evaluation> list;
	
	public Complex(String des, int maxComp) {
		super(des);
	list = new ArrayList<Evaluation>();
		
	}

	public boolean add(Evaluation ev){
		
		if (!list.contains(ev)) {
			list.add(ev);
			return true;
		} else {
			return false;
		}
	
	}
	
	
	
	public void list(String prefix){
		for (Evaluation element : list) {
		System.out.println(prefix + " " +  element.getDescription() +" - "+ element.getGrade());	
		}
		
		
	}

}
