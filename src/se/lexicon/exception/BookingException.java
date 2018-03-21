package se.lexicon.exception;

// Refactor the name or copy for boilerplate exception code
public class BookingException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1775429853199670054L;
	public BookingException() { super(); }
	public BookingException(String message) { super(message); }
	public BookingException(String message, Throwable cause) { super(message, cause); }
}
