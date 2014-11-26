import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.text.DefaultStyledDocument.ElementBuffer;


/**
 * Class whose instance represent a Library with ability to a given book numbers.
 * <p>Implementation Note :
 * <ul><li> Add books that does not exist yet.
 * <li> Enables request book if it is there and it wasn't requested yet.
 * <li> Remove books by title and request number. 
 * <li> Top the most request books.
 * </ul>
 * @author José Oliveira
 */
public class Library {



	private int maxTitlesBook;
	Book[] listBooksInLibrary;
	boolean isAddBookSucessful = false;
	int indeX = 0;
	int numbersOfBooksInLibrary;
	int idxTopBook = 0;



	/**
	 * Constructor that receives an integer parameter of the maximum number of titles in Library
	 */
	public Library(int max ){
		this.maxTitlesBook = max;
		listBooksInLibrary = new Book[max];
		numbersOfBooksInLibrary = 0;

	}


	/**
	 * Request the book of the same title received as parameter. Returns a reference to the book requested,
	 *  or null if the title does not exist or is already required.
	 *  	
	 */

	public Book requestBook(String title){


		boolean isBookRequest = false;

		for (int i = 0; i < numbersOfBooksInLibrary; i++) {
			if (listBooksInLibrary[i].getTitle().equals(title) && listBooksInLibrary[i].requestIt() == true) {

				indeX= i;
				isBookRequest = true;
				break;

			} else  {
				isBookRequest = false;

			}

		}

		return (isBookRequest == true)?   listBooksInLibrary[indeX] : null;

	}


	/**Return the book  of the same title  received as parameter.
	 *  Returns a reference to the book requested,
	 *  or null if the title does not exist or is not required.
	 *  */

	public Book returnBook( String title){


		boolean isBookReturn = false;

		for (int i = 0; i < numbersOfBooksInLibrary; i++) {
			if (listBooksInLibrary[i].getTitle().equals(title) && listBooksInLibrary[i].returnIt() == true) {
				indeX= i;
				isBookReturn = true;

			} else  {
				isBookReturn = false;

			}
		}

		return (isBookReturn == true)?   listBooksInLibrary[indeX] : null;


	}



	/**adds the book in Library, if there is no book with the same title and 
	 * the number of titles is below of the maximum book in Library.
	 *  Returns true if the book has inserted successfully otherwise return false .*/

	public boolean addBook(Book book){

		if (numbersOfBooksInLibrary == 0) 
		{
			listBooksInLibrary[0]= book;
			isAddBookSucessful = true;
			numbersOfBooksInLibrary++;

		} else if(numbersOfBooksInLibrary > 0 && numbersOfBooksInLibrary < maxTitlesBook)
		{


			for (int i = 0; i < numbersOfBooksInLibrary ; i++) {
				if (!listBooksInLibrary[i].getTitle().equals(book.getTitle())){;
				listBooksInLibrary[numbersOfBooksInLibrary] = book;
				isAddBookSucessful = true;

				} else {
					listBooksInLibrary[numbersOfBooksInLibrary] = null;
					numbersOfBooksInLibrary --;
					i = numbersOfBooksInLibrary;
					isAddBookSucessful = false;	
				}

			}
			numbersOfBooksInLibrary ++;
		}

		return isAddBookSucessful;

	}



	/**
	 * Returns all the books in library
	 * 
	 */
	public Book[] getBooks(){


		Book[]  booksInLibrary = new  Book[numbersOfBooksInLibrary];

		for (int i = 0; i < booksInLibrary.length; i++) {
			booksInLibrary[i] = listBooksInLibrary[i];
		}



		return booksInLibrary;	 

	}



	/** Remove the library books whose date of last request is less than the limitiDate received as parameter,
	 *  and where the number of requests is less than the minReq received as parameter.*/

	public boolean removeBooks(Date limitDate, int minReq ){

		boolean isBookRemoved = false;

		int index = 0;

		for (int i = 0 ; i < numbersOfBooksInLibrary ; i++) {
			int temp = listBooksInLibrary[i].lastDateRequest.diffDays(limitDate);
			if (listBooksInLibrary[i].lastDateRequest.diffDays(limitDate) > 0 && listBooksInLibrary[i].numberRequest > minReq) {


				listBooksInLibrary[i] = listBooksInLibrary[numbersOfBooksInLibrary-1];
				listBooksInLibrary[numbersOfBooksInLibrary-1] = null;
				numbersOfBooksInLibrary--;
				i--;


				isBookRemoved = true;
			} else {


				isBookRemoved = false;
			}

		}

		return isBookRemoved;
	}


	/**
	 * Returns an array with 10 more books request
	 * 
	 */
	public Book[] topRequestBooks(){


		Book[] aux= new Book[numbersOfBooksInLibrary];

		for (int i = 0; i < numbersOfBooksInLibrary; i++) {
			for (int j = 1; j < numbersOfBooksInLibrary; j++) {
				if( listBooksInLibrary[j].getTotalRequests() > listBooksInLibrary[j-1].getTotalRequests()){
					aux[j] = listBooksInLibrary[j-1];
					listBooksInLibrary[j-1] = listBooksInLibrary[j];
					listBooksInLibrary[j] = aux[j];
				}

			}
		}
		Book[] topBooks = (numbersOfBooksInLibrary < 10)? new Book[numbersOfBooksInLibrary]: new Book[10];
		for (int i = 0; i < topBooks.length; i++) {
			topBooks[i] = listBooksInLibrary[i];
		}

		return topBooks;
	}

}
