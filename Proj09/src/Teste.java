
public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library(20);
		Book book = new Book("Lusiadas", "Porto Editora");
		Book book1 = new Book("Lusiada", "Porto Editora");
		Book book2 = new Book("Lusiad", "Porto Editora");
		Book book3 = new Book("Lusia", "Porto Editora");
		Book book4 = new Book("Lusi", "Porto Editora");
		Book book5 = new Book("Lus", "Porto Editora");
		Book book6 = new Book("Lu", "Porto Editora");
		Book book7 = new Book("L", "Porto Editora");
		Book book8 = new Book("usiadas", "Porto Editora");
		Book book9 = new Book("siadas", "Porto Editora");
		Book book10 = new Book("iadas", "Porto Editora");
		Book book11 = new Book("adas", "Porto Editora");
		Book book12 = new Book("das", "Porto Editora");
		Book book13 = new Book("as", "Porto Editora");
		Book book14 = new Book("s", "Porto Editora");
		Book book15 = new Book("Lusiadas1", "Porto Editora");
		Book book16 = new Book("Lusiadas2", "Porto Editora");
		Book book17 = new Book("Lusiadas3", "Porto Editora");
		Book book18 = new Book("Lusiadas4", "Porto Editora");
		Book book19 = new Book("Lusiadas5", "Porto Editora");

		library.addBook(book);
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		library.addBook(book5);
		library.addBook(book6);
		library.addBook(book7);
		library.addBook(book8);
		library.addBook(book9);
		library.addBook(book10);
		library.addBook(book11);
		library.addBook(book12);
		library.addBook(book13);
		library.addBook(book14);
		library.addBook(book15);
		library.addBook(book16);
		library.addBook(book17);
		library.addBook(book18);
		library.addBook(book19);

		for (int i = 0; i < library.listBooksInLibrary.length; i++) {
			System.out.println(library.listBooksInLibrary[i].getTitle());
		}



		library.requestBook("Lusiadas");
		//		 Date date1 =book.getLastRequestDate();
		//		 System.out.println(date1);
		library.returnBook("Lusiadas");

		Date date = new Date(30,10,2014);

		for (int i = 0; i < library.listBooksInLibrary.length; i++) {
			System.out.println(library.listBooksInLibrary[i].getTotalRequests());
		} 
		//		 for (int i = 0; i < library.listBooksInLibrary.length; i++) {
		//				System.out.println(library.listBooksInLibrary[i].getTotalRequests());
		//			}
		System.out.println(book.lastDateRequest.diffDays(date));
		System.out.println(library.numbersOfBooksInLibrary);
		System.out.println(library.removeBooks(date, 1));
		System.out.println(library.numbersOfBooksInLibrary);
		System.out.println(library.listBooksInLibrary.length);


		
		
			for (int i = 0; i < library.topRequestBooks().length; i++) {
				System.out.println(library.topRequestBooks()[i].getTitle());
			}
//		 System.out.println(library.returnBook("Lusiadas"));
//		 System.out.println(library.requestBook("L"));
//		 System.out.println(library.requestBook("Lusiadas"));
//		 //System.out.println(library.bookRequest);
		
		
		
	}

}

