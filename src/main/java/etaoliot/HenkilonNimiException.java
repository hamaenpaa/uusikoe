package etaoliot;

public class HenkilonNimiException extends Exception {

	private String selite;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HenkilonNimiException() {
		
	}
	
	public HenkilonNimiException(String selite) {
		this.selite = selite;
	}
	
	public String toString() {
		return "HenkilonNimiException, selite " + selite + "\n";
	}
	
}
