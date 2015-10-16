package etaoliot;

import java.util.Date;

public class Matka {
	
	private String alkukohde;
	private String loppukohde;
	private Date   alkuPvm;
	private int    alkuaika;
	private int    loppuaika;
	
	public Matka() {}
	
	public Matka(String alkukohde, String loppukohde, Date alkuPvm, int alkuaika,
			int loppuAika) {
		this.alkukohde = alkukohde;
		this.loppukohde = loppukohde;
		this.alkuPvm   = alkuPvm;
		this.alkuaika = alkuaika;
		this.loppuaika = loppuAika;
	}

	public String getAlkukohde() {
		return alkukohde;
	}

	public void setAlkukohde(String alkukohde) {
		this.alkukohde = alkukohde;
	}

	public String getLoppukohde() {
		return loppukohde;
	}

	public void setLoppukohde(String loppukohde) {
		this.loppukohde = loppukohde;
	}

	public Date getAlkuPvm() {
		return alkuPvm;
	}

	public void setAlkuPvm(Date alkuPvm) {
		this.alkuPvm = alkuPvm;
	}

	public int getAlkuaika() {
		return alkuaika;
	}

	public void setAlkuaika(int alkuaika) {
		this.alkuaika = alkuaika;
	}

	public int getLoppuaika() {
		return loppuaika;
	}

	public void setLoppuaika(int loppuaika) {
		this.loppuaika = loppuaika;
	}
	
	public String toString() {
		return "Matka\nAlkukohde: " + alkukohde + " loppukohde " + loppukohde +
				" alkupvm " + alkuPvm + 
 				" alkuaika " + new Integer(alkuaika / 60) + ":" + new Integer(alkuaika % 60) +
				" loppuaika " + new Integer(loppuaika / 60) + ":" + new Integer(loppuaika % 60) + "\n";
	}
}
