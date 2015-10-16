package etaoliot;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Date;

public class MatkaTest {
	private static final String TESTI_ALKUKOHDE = "Jyväskylä";
	private static final String TESTI_LOPPUKOHDE = "Tampere";
	private static final Date TESTI_ALKUPVM = new Date();
	private static final int  TESTI_ALKUAIKA = 360;
	private static final int  TESTI_LOPPUAIKA = 450;
	
	@Test
	public void MatkaLuonti1() {
		Matka matka = new Matka();
		matka.setAlkuaika(TESTI_ALKUAIKA);
		matka.setLoppuaika(TESTI_LOPPUAIKA);
		matka.setAlkuPvm(TESTI_ALKUPVM);
		matka.setAlkukohde(TESTI_ALKUKOHDE);
		matka.setLoppukohde(TESTI_LOPPUKOHDE);
		
		assertEquals(matka.getAlkukohde(), TESTI_ALKUKOHDE);
		assertEquals(matka.getLoppukohde(), TESTI_LOPPUKOHDE);
		assertEquals(matka.getAlkuPvm(), TESTI_ALKUPVM);
		assertEquals(matka.getAlkuaika(), TESTI_ALKUAIKA);
		assertEquals(matka.getLoppuaika(), TESTI_LOPPUAIKA);
		
		assertEquals(matka.toString(), 
				"Matka\nAlkukohde: " + TESTI_ALKUKOHDE + " loppukohde " + TESTI_LOPPUKOHDE +
				" alkupvm " + TESTI_ALKUPVM + 
 				" alkuaika " + new Integer(TESTI_ALKUAIKA / 60) + ":" + new Integer(TESTI_ALKUAIKA % 60) +
				" loppuaika " + new Integer(TESTI_LOPPUAIKA / 60) + ":" + new Integer(TESTI_LOPPUAIKA % 60) + "\n"
				);
	}
	
	@Test
	public void MatkaLuonti2() {
		Matka matka = new Matka(
				TESTI_ALKUKOHDE, TESTI_LOPPUKOHDE, TESTI_ALKUPVM, TESTI_ALKUAIKA,
				TESTI_LOPPUAIKA);
		assertEquals(matka.getAlkukohde(), TESTI_ALKUKOHDE);
		assertEquals(matka.getLoppukohde(), TESTI_LOPPUKOHDE);
		assertEquals(matka.getAlkuPvm(), TESTI_ALKUPVM);
		assertEquals(matka.getAlkuaika(), TESTI_ALKUAIKA);
		assertEquals(matka.getLoppuaika(), TESTI_LOPPUAIKA);
	}
}
