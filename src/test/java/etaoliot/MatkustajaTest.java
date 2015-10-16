package etaoliot;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatkustajaTest {
	
	private static final String TESTI_NIMI = "Kalle";
	private static final String TESTI_OSOITE = "Vapaudenkatu 48-50";
	private static final int    TESTI_IKA    = 45;
	private static final int    TESTI_ZIPKOODI = 40100;
	private static final String TESTI_KUNTA  = "Jyväskylä";
	private static final String TESTI_MAA    = "Suomi";
	private static final String TESTI_PUHNUMERO = "0503882999";
	private static final String TESTI_EMAIL     = "ville@gmail.com";
	
	@Test
	public void MatkustajaLuonti1() {
		Matkustaja m = new Matkustaja();
		try {
			m.setNimi(TESTI_NIMI);
		}
		catch (HenkilonNimiException hne) {
			assertTrue(false);
		}
		m.setOsoite(TESTI_OSOITE);
		assertEquals(m.getOsoite(), TESTI_OSOITE);
		m.setIka(TESTI_IKA);
		assertEquals(m.getIka(), TESTI_IKA);
		m.setKunta(TESTI_KUNTA);
		assertEquals(m.getKunta(), TESTI_KUNTA);
		m.setMaa(TESTI_MAA);
		assertEquals(m.getMaa(), TESTI_MAA);
		m.setZipKoodi(TESTI_ZIPKOODI);
		assertEquals(m.getZipKoodi(), TESTI_ZIPKOODI);
		m.setPuhNumero(TESTI_PUHNUMERO);
		assertEquals(m.getPuhNumero(), TESTI_PUHNUMERO);
		m.setEmail(TESTI_EMAIL);
		assertEquals(m.getEmail(), TESTI_EMAIL);
	}
}
