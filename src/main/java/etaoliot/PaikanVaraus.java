package etaoliot;

import java.util.Date;

public class PaikanVaraus {
	private IstumaPaikka istumaPaikka = new IstumaPaikka();
	private Matkustaja   matkustaja   = new Matkustaja();
	private Date         dtVarausPvm  = new Date();
	private Matka        matka        = new Matka();
	private int          iPrioriteetti;
	private boolean      lAktiivinen;
	private double       hinta;
	
	public PaikanVaraus() {}
	
	public PaikanVaraus(IstumaPaikka istumaPaikka, 
			Matkustaja matkustaja,
			Date varausPvm,	
			int iPrioriteetti, boolean lAktiivinen,
			Matka matka,
			double hinta) {	
		this.istumaPaikka = istumaPaikka;
		this.matkustaja = matkustaja;
		this.dtVarausPvm = varausPvm;
		this.iPrioriteetti = iPrioriteetti;
		this.lAktiivinen = lAktiivinen;
		this.hinta = hinta;
		this.matka = matka;
	}
	
	public IstumaPaikka getIstumaPaikka() {
		return istumaPaikka;
	}
	
	public void setIstumaPaikka(IstumaPaikka istumaPaikka) {
		this.istumaPaikka = istumaPaikka;
	}
	
	public Matkustaja getMatkustaja() {
		return matkustaja;
	}
	
	public void setMatkustaja(Matkustaja matkustaja) {
		this.matkustaja = matkustaja;
	}
	
	public Date getDtVarausPvm() {
		return dtVarausPvm;
	}
	
	public void setDtVarausPvm(Date dtVarausPvm) {
		this.dtVarausPvm = dtVarausPvm;
	}
	
	public int getiPrioriteetti() {
		return iPrioriteetti;
	}
	
	public void setiPrioriteetti(int iPrioriteetti) {
		this.iPrioriteetti = iPrioriteetti;
	}
	
	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}


	public boolean islAktiivinen() {
		return lAktiivinen;
	}

	public void setlAktiivinen(boolean lAktiivinen) {
		this.lAktiivinen = lAktiivinen;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Matkustaja:\n");
		sb.append(matkustaja);
		sb.append("Istumapaikka:\n");
		sb.append(istumaPaikka);
		sb.append("Varauspäivä: " + dtVarausPvm.toString() + "\n");
		sb.append("Prioriteetti: " + new Integer(iPrioriteetti).toString() + "\n");
		if (lAktiivinen)
			sb.append("Aktiivinen\n");
		else
			sb.append("Ei aktiivinen\n");
		sb.append("Hinta " + new Double(hinta).toString() + "\n");
		sb.append("Matka " + matka.toString());
		return sb.toString();
	}

	public Matka getMatka() {
		return matka;
	}

	public void setMatka(Matka matka) {
		this.matka = matka;
	}
	
}
