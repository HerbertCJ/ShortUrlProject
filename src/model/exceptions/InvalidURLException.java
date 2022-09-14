package model.exceptions;

public class InvalidURLException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidURLException(String msg) {
		super(msg);
	}

}
