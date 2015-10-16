package etaoliot;

public class TooManyMatkustajaException extends Exception {

	private String selite;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TooManyMatkustajaException() {	}
	
	public String toString() {
		return "TooManyMatkustajaException " + selite + "\n";
	}
	
	public TooManyMatkustajaException(String selite) {
		this.selite = selite;
	}
}
