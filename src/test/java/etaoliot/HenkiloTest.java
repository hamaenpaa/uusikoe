package etaoliot;

import static org.junit.Assert.*;

import org.junit.Test;

public class HenkiloTest {

	private static final int    TESTI_IKA    = 20;
	private static final String TESTI_OSOITE = "Väinönkatu 26";
	private static final String TESTI_KUNTA  = "Jyväskylä";
	private static final String TESTI_MAA    = "Suomi";
	private static final String TESTI_NIMI   = "Ville";
	private static final String TESTI_EMAIL  = "kalle@gmail.com";
	private static final String TESTI_PUHNUMERO = "0444302300";
	private static final int    TESTI_ZIPKOODI  = 40500;
	
	@Test
	public void henkiloLuonti1() {
		Henkilo h = new Henkilo();
		h.setIka(TESTI_IKA);
		assertEquals(h.getIka(), TESTI_IKA);
		h.setKunta(TESTI_KUNTA);
		assertEquals(h.getKunta(), TESTI_KUNTA);
		h.setMaa(TESTI_MAA);
		assertEquals(h.getMaa(), TESTI_MAA);
		try {
			h.setNimi(TESTI_NIMI);
			assertEquals(h.getNimi(), TESTI_NIMI);
		} catch (HenkilonNimiException hne) {
			
		}
		h.setOsoite(TESTI_OSOITE);
		assertEquals(h.getOsoite(), TESTI_OSOITE);
		h.setPuhNumero(TESTI_PUHNUMERO);
		assertEquals(h.getPuhNumero(), TESTI_PUHNUMERO);
		h.setEmail(TESTI_EMAIL);
		assertEquals(h.getEmail(), TESTI_EMAIL);
		h.setZipKoodi(TESTI_ZIPKOODI);
		assertEquals(h.getZipKoodi(), TESTI_ZIPKOODI);
	}
	
	@Test
	public void HenkiloLuonti2() throws HenkilonNimiException {
		try {
			Henkilo h = new Henkilo(TESTI_NIMI, TESTI_IKA, TESTI_OSOITE,
					TESTI_ZIPKOODI, TESTI_KUNTA, TESTI_MAA, 
					TESTI_PUHNUMERO, TESTI_EMAIL);
			assertEquals(h.getIka(), TESTI_IKA);
			assertEquals(h.getKunta(), TESTI_KUNTA);
			assertEquals(h.getMaa(), TESTI_MAA);
			assertEquals(h.getNimi(), TESTI_NIMI);
			assertEquals(h.getOsoite(), TESTI_OSOITE);
			assertEquals(h.getPuhNumero(), TESTI_PUHNUMERO);
			assertEquals(h.getEmail(), TESTI_EMAIL);
			assertEquals(h.getZipKoodi(), TESTI_ZIPKOODI);
			assertEquals(h.toString(), 
					"Henkilo, nimi " + TESTI_NIMI +
					" osoite " + TESTI_OSOITE + 
					" zip koodi " + new Integer(TESTI_ZIPKOODI).toString() +
					" kunta " + TESTI_KUNTA + " maa " + TESTI_MAA +
					" puhelinnumero " + TESTI_PUHNUMERO + "\n");
		}
		catch (HenkilonNimiException hne) {
			throw hne;
		}
	}

	
	@Test(expected = HenkilonNimiException.class)
	public void henkilonKonstruktoriVirheellinenNimi() throws
		HenkilonNimiException {
		Henkilo h = new Henkilo("h", TESTI_IKA, TESTI_OSOITE,
				TESTI_ZIPKOODI, TESTI_KUNTA, TESTI_MAA, 
				TESTI_PUHNUMERO, TESTI_EMAIL);
	}
	
	@Test(expected = HenkilonNimiException.class)
	public void henkilonNimiAsetusVirheellinenNimi() throws
	HenkilonNimiException {
		Henkilo h = new Henkilo();
		h.setNimi("h");
	}
}
