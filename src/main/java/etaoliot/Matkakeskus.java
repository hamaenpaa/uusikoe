package etaoliot;

import java.util.List;

public class Matkakeskus {
	private List<LipunMyynti> lipunMyynnit;
	private List<Bussi> bussit;
	private List<Juna> junat;
	
	public List<LipunMyynti> getLipunMyynnit() {
		return lipunMyynnit;
	}
	
	public void setLipunMyynnit(List<LipunMyynti> lipunMyynnit) {
		this.lipunMyynnit = lipunMyynnit;
	}
	
	public List<Bussi> getBussit() {
		return bussit;
	}
	
	public void setBussit(List<Bussi> bussit) {
		this.bussit = bussit;
	}
	
	public List<Juna> getJunat() {
		return junat;
	}
	
	public void setJunat(List<Juna> junat) {
		this.junat = junat;
	}
}
