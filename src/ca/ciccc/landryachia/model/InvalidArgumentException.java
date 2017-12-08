package ca.ciccc.landryachia.model;

/**
 * Class to handle exception if argument is not of type as requested
 * @author Landry Achia
 *
 */
public class InvalidArgumentException extends Exception {

	public InvalidArgumentException() {
		// TODO Auto-generated constructor stub
	}

	public InvalidArgumentException(String arg0) {
		super(arg0);
		
	}

	public InvalidArgumentException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public InvalidArgumentException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public InvalidArgumentException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
