package etaoliot;

public class TooManyPaikanVarausException extends Exception {

	private String selite;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TooManyPaikanVarausException() {	}
	
	public String toString() {
		return "TooManyMatkustajaException " + selite + "\n";
	}
	
	public TooManyPaikanVarausException(String selite) {
		this.selite = selite;
	}
}
