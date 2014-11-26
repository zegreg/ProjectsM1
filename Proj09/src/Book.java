/**
 * Class whose represent a instance of Book
 * 
 * <p>Implementation Notes:
 * <ul><li> Each Book are caractherized  by a title and a publisher.
 * <li> When the Book is request, return the actual date, and add his request number.
 * <li> While the Book is requested can not be requested again, must be returned it.
 * <li> The information Book is available to output.
 * </ul>
 * @author José Oliveira
 * 
 */
public class Book {
	
	
	private String title;
	private String publisher;
	private boolean IsBookExist;
	int numberRequest= 0;
	protected Date dateRequest ;
	protected Date lastDateRequest ;
	
	
	
/**
 * Default Constructor
 */
	public Book(){

	}

	/**
	 * Constructor that receives a title and a publisher.
	 */
	public Book( String title , String publisher){
		this.title = title;
		this.publisher = publisher;
		dateRequest = new Date();
		lastDateRequest = dateRequest;
		IsBookExist = true;

	}

	
	/**
	 * Method that return the title.
	 */
	public String getTitle(){
		return title;
		
				
	}
	
	
	/**
	 * Method that return a publisher
	 */
	public String getPublisher(){
		return publisher;
	}
	
	
	/**
	 * Method that return the actual date
	 */
	public Date getRequestDate(){
		
		return dateRequest;
		
		
	}
	
	
	/**
	 * Method that return tha last date request
	 */
	public Date getLastRequestDate(){
				
		return lastDateRequest;
		
		
	}

	
	/**
	 * Method that return the Book request number
	 */
	public int getTotalRequests(){
		return numberRequest;
		
		
	}
	
	
	/**
	 * Request the book, if possible returns true, otherwise returns false.
	 */
	public boolean requestIt(){
		
		
		if (IsBookExist){
			IsBookExist = false;
			numberRequest += 1;
			getLastRequestDate();
			return true;
		}
		else
			return false;
	}
	

	
	/**
	 * Returns the book, if possible returns true, otherwise returns false.
	 */
	public boolean returnIt(){
		
		if (IsBookExist){
			return false;
		} else
		{
			IsBookExist = true;
			return true;
		}
		
		
	}

	
	/**
	 * Show the Book Information: title, publisher, request date, and request number
	 * 
	 */
	public void print(){
		
			System.out.println(" Titulo :" + title + ";  Editora :"+ publisher +";  Data de Requisição :" 
				+ dateRequest.toString() + ";  Número da Requisição :" +numberRequest);
		

	}

}
