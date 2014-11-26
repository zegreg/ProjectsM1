import java.util.Scanner;

/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * @author Challenge.IT
 *
 * Copyright (c) 2014, Challenge.IT and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is distributed in the hope that it will be useful for learning purposes, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.
 * */
public class App {
	
	private static final String ADD_BOOK     = "add";
	private static final String REQUEST_BOOK = "request";
	private static final String RETURN_BOOK  = "return";
	private static final String REMOVE_BOOK  = "remove";
	private static final String TOP_BOOKS    = "top";
	private static final String SHOW_BOOKS   = "show";
	private static final String HELP_APP     = "help";
	private static final String END_APP      = "quit";
	
	private Scanner scanner;
	private Library library;
	
	private String[] commands = { 
			ADD_BOOK, 
			REQUEST_BOOK, 
			RETURN_BOOK, 
			REMOVE_BOOK, 
			TOP_BOOKS, 
			SHOW_BOOKS,
			HELP_APP,
			END_APP
	};
	
	public App() {
		scanner = new Scanner (System.in);
	    library = new Library(3);
	} 
	
	private  Date readDate(String msg) {
		
		int day, month, year;
		boolean isDateValid = false;
		
		do {
			System.out.println(msg);
			System.out.print("Day: "); day = scanner.nextInt(); 
			System.out.print("Month: "); month = scanner.nextInt(); 
			System.out.print("Year: "); year = scanner.nextInt();
			
			isDateValid = Date.isValid(day, month, year);
			
			if(!isDateValid){
				System.out.println("Invalid date");
			} 
		} while (!isDateValid);
		
		return new Date(day,month,year);
	}
	
	private void showCommands() {

		for (int i = 0; i < commands.length; ++i) {
			
			System.out.println(commands[i]);
		}
	}
	
	private String readCommand() {
		
		return scanner.nextLine();
	}
	
	private  Book readBook() {
		
		String title, publisher;
		System.out.print("Title? ");
		title = scanner.nextLine();
		System.out.print("Publisher? ");
		publisher = scanner.nextLine();
		return new Book(title,  publisher); 
	}
	
	public void execute() {

		Book book;
		
		boolean done = false;

		showCommands();
		
		do {
			
			switch (readCommand()) {
			
				case ADD_BOOK:	
					
				    System.out.println("Add book:");
				    
					if (!library.addBook(readBook())){
						System.out.println("Invalid book");	
					}
				    break;
				    
				case  REQUEST_BOOK:
					
				    System.out.println("Request book: ");
					System.out.print("Book title? ");

					if ((book = library.requestBook(scanner.nextLine())) == null) {
						System.out.println("Book already requested or doesnt exists");
					} else {
						book.print();
					}
					break;
					
				case RETURN_BOOK:
					
					System.out.print("Book title? ");

					if ((book= library.returnBook(scanner.nextLine())) == null) {
						System.out.println("Book not requested or doesnt exists");
					} else {
						book.print();
					}
					break;
					
				case REMOVE_BOOK:
					
				    System.out.println("Remove books:");
					Date ld = readDate("Limit date: ");
					System.out.print("Minimum requests: ");
					library.removeBooks(ld, scanner.nextInt());
					break;
					
				case TOP_BOOKS:	
					
					System.out.println("Show top requested books:");
				    
					Book[] top = library.topRequestBooks();
					
					if (top==null) {
						System.out.println("Error generating top requested books");
					} else {
						for (int i= 0; i < top.length; ++i) {
							top[i].print();
						}
				    }
					break;
					
				case SHOW_BOOKS:
					
					Book[] books = library.getBooks();
					
					if (books==null) {
						System.out.println("Error getting all books");
					} else {
						for (int i= 0; i < books.length; ++i) {
							books[i].print();
						}
				    }
					break;	
					
				case HELP_APP:
					
					 showCommands();
					 break;
					 
				case END_APP:
					
					 done = true;
					 break;
					 
				default:
					
					System.out.println("Invalid command");
			}
		}
		while(!done);
	}
	
	public static void main(String [] args ) {
		App app = new App();
		app.execute();
	}
}


