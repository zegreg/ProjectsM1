
/**
 * <i> Abstract Class Evaluation 
 * 
 * <p>  Implementation notes:
 * <ul>
 * <li> An constructor that receives a String description;
 * <li> An getGrade method abstract;
 * <li> An list() method; 
 * </ul>
 * 	@see Class AscendigSort,
 *  @see Class Inverse, 
 *  @see Class Unique,
 *  @see Class SerieTransform.
 * 
 * 
 * @author José Oliveira
 *
 */

public abstract class Evaluation {
	
	
	private String description;


	public Evaluation( String desc) {
		this.description = desc;
	}

	public abstract int getGrade();

	public void list(String prefix){

		System.out.println(prefix + " " + toString());
		
	}

	public String getDescription() {
		return description;
	}
	

	public String toString(){
		
		return description + " - " + getGrade();

	}


}
