/**
 * Class, that extends {@link Evaluation}, whose instance represent Simple element of Evaluation.
 * 
 * <p> Implementation Notes:
 * <ul><li> Simple element are represented by description and grade.
 * </ul>
 * @author José Oliveira
 *
 */
public class Simple extends Evaluation {

	
	private int grade; 
	
	public Simple(String desc, int grade) {
		super(desc);
		this.grade = grade;
		
	}

	@Override
	public int getGrade() {
		
		return grade;
	}

}
