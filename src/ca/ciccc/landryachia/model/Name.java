package ca.ciccc.landryachia.model;

/**
 * Class of type Name will be used as type object for the Book class fields of firstName and lastName of book author
 * @author Landry Achia
 *
 */
public class Name {
	private String name;
	
	/**
	 * Single argument constructor for the Name class to set name field 
	 * @param name that will be set for each book author
	 */
	public Name(String name) {
		this.name = name;
	}

	/**
	 * accessor method to get name field
	 * @return the name that will be set
	 */
	public String getName() {
		return name;
	}

	/**
	 * mutator method to set the name field
	 * @param name the name to set for author
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}
	
	

}
