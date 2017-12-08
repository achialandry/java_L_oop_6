

package ca.ciccc.landryachia.controller;


import java.util.ArrayList;
import java.util.Collections;

import ca.ciccc.landryachia.model.Book;
import ca.ciccc.landryachia.model.InvalidArgumentException;
import ca.ciccc.landryachia.model.InvalidBookDateException;
import ca.ciccc.landryachia.model.Name;

/**
 * Controller Class book store where book author's names are added to arraylist and printed out before and after sorting
 * @author Landry Achia
 *
 */

public class Bookstore {
	private ArrayList<Book> books;
	
	/**
	 * no argument constructor for the Bookstore class
	 */
	public Bookstore() {
		books = new ArrayList<Book>();
	}
	
	/**
	 * addBook method which takes four parameters 
	 * @param firstName of Name type and takes value for the first name of author
	 * @param lastName of Name type and takes value for the last name of author
	 * @param title of type String and takes value for the title of the book
	 * @param yearPublished for the year book was published by author
	 */
	public void addBook(Name firstName, Name lastName, String title, int yearPublished)  {
		try {
			
			books.add(new Book(firstName, lastName, title, yearPublished));
			
		}catch(InvalidArgumentException e){
			System.out.println(e.getMessage());
		}catch(InvalidBookDateException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	/**
	 * method to display books before they are sorted and after they are sorted from the arraylist of type Book
	 */
	public void displayBooks() {
		
		
		for(Book book : books){
			System.out.println("Printing unsorted book list");
			System.out.println(book);
			System.out.println("");
		}
		
		Collections.sort(books);
		for(Book bookSorted : books) {
			System.out.println("Below is list of sorted books");
			System.out.println(bookSorted);
			System.out.println("");
		}
		
	}
	
	public static void main(String[] args) {
		Bookstore bookstore = new Bookstore();
		bookstore.addBook(new Name("Landry"), new Name ("Achia"), "Swift 3, PHP, Java", 2009);
		System.out.println("");
		bookstore.addBook(new Name ("Paulo"), new Name("Henrique"), "PHP", 2003);
	    System.out.println("");
		bookstore.addBook(new Name("Yorman"), new Name ("I dont know"), "Go Lang", 2019);
		System.out.println("");
		bookstore.addBook(new Name ("Jorge"), new Name("Fernandez"), "PHP", 2003);
		
		bookstore.displayBooks();
	}

}
