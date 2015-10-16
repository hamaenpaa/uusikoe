package etaoliot;

public class EiVaratujaPaikkojaPoikkeus extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String selite;

	public EiVaratujaPaikkojaPoikkeus() {
		
	}
	
	public EiVaratujaPaikkojaPoikkeus(String selite) {
		this.selite = selite;
	}
	
	public String toString() {
		return "Ei varattuja paikkoja, poikkeus " + selite + "\n";
	}
	
}
