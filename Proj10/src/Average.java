import java.awt.List;

/**
 *Class, that extends {@link Complex}, whose instance represent the arithmetic average of all  {@link Evaluation} elements.
 *<p> Implementation Notes:
 *<ul><li> Get list of grades and return the arithmetic average
 *</ul>
 * @author José Oliveira
 *
 */
public class Average extends Complex{

	
	/**

	 */
	public Average(String des, int maxComp) {
		super(des + " (average) ", maxComp);
		
		
	}
	
	@Override
	public int getGrade() {
		int sumTotal = 0; 
	for (Evaluation element : list) {
		sumTotal += element.getGrade(); 
	}
		
		return (sumTotal/list.size()) ;
	}

}
