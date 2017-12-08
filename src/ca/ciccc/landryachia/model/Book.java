package ca.ciccc.landryachia.model;

/**
 * Book Class to set primary parameters for name, title and year published of each book
 * @author Landry Achia
 *
 */
public class Book implements Comparable<Book> {
	
	/**
	 * variable firstName of type Name which represents first name of Book author
	 */
	private Name firstName;
	
	/**
	 * variable lastName of type Name which represents last name of book author
	 */
	private Name lastName;
	
	/**
	 * Variable title of String type representing title of book
	 */
	private String title ;
	
	/**
	 * variable of type int representing year book was published
	 */
	private int yearPublished;
	
	
	/**
	 * Four parameter constructor for the Book which takes in first name, lastname, title and year book was published
	 * @param firstName variable of type Name representing firstName of book author
	 * @param lastName variable of type Name representing lastName of book author
	 * @param title variable of type String representing title of book
	 * @param yearPublished variable of type int representing year book was published by author
	 * @throws InvalidArgumentException handle exception when author's lastname and firstname are not empty and not null
	 * @throws InvalidBookDateException handle exception when year book is released is over 2017
	 */
	public Book(Name firstName, Name lastName, String title, int yearPublished)  throws InvalidArgumentException, InvalidBookDateException
	{
		setFirstName(firstName);
		setLastName(lastName);
		setTitle(title);
		setYearPublished(yearPublished);
	}

	/**
	 * accessor method to get first name of book author
	 * @return the firstName of book author
	 */
	public final Name getFirstName() {
		return firstName;
	}

	/**
	 * mutator method to set first name of book author and exception to verify if firstname is null or is empty
	 * @param firstName the firstName to set for the author
	 */
	public final void setFirstName(Name firstName) throws InvalidArgumentException {
		if(firstName == null || firstName.getName().isEmpty()) {
			throw new InvalidArgumentException("First Name is Null");
		}else {
			this.firstName = firstName;
		}
		
	}

	/**
	 * accessor method to get the last name of the book author
	 * @return the lastName of the book author
	 */
	public final Name getLastName() {
		return lastName;
	}

	/**
	 * mutator method to set the last name of the book author with exception handling to verify if last name is null or is empty
	 * @param lastName the lastName to set last name of book author
	 */
	public final void setLastName(Name lastName) throws InvalidArgumentException  {
	
			if (lastName == null || lastName.getName().isEmpty()){
				throw new InvalidArgumentException("Name is Null");
			}else {
				
				this.lastName = lastName;
			}
			
		
	}

	/**
	 * accessor method to get the title of the book
	 * @return the title of the book
	 */
	public final String getTitle() {
		return title;
	}

	/**
	 * mutator method to set the title of the book
	 * @param title the title to set for the book
	 */
	public final void setTitle(String title) throws InvalidArgumentException {
		if (title == null || title.isEmpty()){
			throw new InvalidArgumentException("Name is Null");
		}else {
			this.title = title;
		}
		
	}

	/**
	 * accessor method to get the year book was published
	 * @return the yearPublished when book was published
	 */
	public final int getYearPublished()  {
		
			return yearPublished;
		
		
	}

	/**
	 * mutator method to set the year book was published with an exception handling to see if year is not over 2017
	 * @param yearPublished the yearPublished to set year book was published
	 */
	public final void setYearPublished(int yearPublished) throws InvalidBookDateException {
		if(yearPublished > 2017) {
			throw new InvalidBookDateException("Year published is over 2017");
		}else {
			
			this.yearPublished = yearPublished;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearPublished;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Book other = (Book) obj;
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		if (yearPublished != other.yearPublished) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Book o) {
		if(this.yearPublished > o.yearPublished) {
			return  1;
		}else if(this.yearPublished < o.yearPublished) {
			return -1;
		}else
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [firstName=" + firstName + ", lastName=" + lastName + ", title=" + title + ", yearPublished="
				+ yearPublished + "]";
	}
			

}
