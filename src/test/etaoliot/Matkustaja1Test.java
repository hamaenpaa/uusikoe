package etaoliot;

import static org.junit.Assert.*;

import org.junit.Test;

public class Matkustaja1Test {
	private static final String TESTI_NIMI = "Kalle";
	private static final double TESTI_PAIKAN_HINTA = 57.50;
	private static final String TESTI_KOHDE = "Tampere";
	
	@Test
	public void Matkustaja1Luonti1() {
		Matkustaja1 m = new Matkustaja1();
		m.setNimi(TESTI_NIMI);
		assertEquals(m.getNimi(), TESTI_NIMI);
		m.setKohde(TESTI_KOHDE);
		assertEquals(m.getKohde(), TESTI_KOHDE);
		m.setPaikanHinta(TESTI_PAIKAN_HINTA);
		assertEquals(m.getPaikanHinta(), TESTI_PAIKAN_HINTA, 0.001);
	}
	
	@Test
	public void Matkustaja1Luonti2() {
		Matkustaja1 m = new Matkustaja1(TESTI_NIMI, TESTI_KOHDE, TESTI_PAIKAN_HINTA);
		assertEquals(m.getNimi(), TESTI_NIMI);
		assertEquals(m.getKohde(), TESTI_KOHDE);
		assertEquals(m.getPaikanHinta(), TESTI_PAIKAN_HINTA, 0.001);
	}
}
