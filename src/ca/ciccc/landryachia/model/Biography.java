package ca.ciccc.landryachia.model;

/**
 * Biography class that gives the biography  of each book author
 * @author Landry Achia
 *
 */
public final class Biography extends Book {
	private Name subject ;

	/**
	 * Constructor for the Biography class that extends Book class and by default takes four parameter from parent class (Book)
	 * @param firstName variable of type Name representing firstName of book author
	 * @param lastName variable of type Name representing lastName of book author
	 * @param title variable of type String representing title of book
	 * @param yearPublished variable of type int representing year book was published by author
	 * @throws InvalidArgumentException handle exception when author's lastname and firstname are not empty and not null
	 * @throws InvalidBookDateException handle exception when year book is released is over 2017
	 */
	public Biography(Name firstName, Name lastName, String title, int yearPublished) throws InvalidArgumentException, InvalidBookDateException {
		super(firstName, lastName, title, yearPublished);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
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
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Biography other = (Biography) obj;
		if (subject == null) {
			if (other.subject != null) {
				return false;
			}
		} else if (!subject.equals(other.subject)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Biography [subject=" + subject + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getTitle()=" + getTitle() + ", getYearPublished()=" + getYearPublished() + "]";
	}

	
}
