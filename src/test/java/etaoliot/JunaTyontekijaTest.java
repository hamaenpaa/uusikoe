package etaoliot;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class JunaTyontekijaTest {
	private static final int    TESTI_IKA    = 20;
	private static final String TESTI_OSOITE = "Väinönkatu 26";
	private static final String TESTI_KUNTA  = "Jyväskylä";
	private static final String TESTI_MAA    = "Suomi";
	private static final String TESTI_NIMI   = "Ville";
	private static final String TESTI_EMAIL  = "kalle@gmail.com";
	private static final String TESTI_PUHNUMERO = "0444302300";
	private static final int    TESTI_ZIPKOODI  = 40500;
	private static final double TESTI_PALKKA    = 2000.0;
	
	
	@Test
	public void junatyontekijanLuonti() throws HenkilonNimiException {
		Date dtNow = new Date();
		JunaTyontekija junaTyontekija = new JunaTyontekija();
		junaTyontekija.setNimi(TESTI_NIMI);
		junaTyontekija.setEmail(TESTI_EMAIL);
		junaTyontekija.setOsoite(TESTI_OSOITE);
		junaTyontekija.setPalkka(TESTI_PALKKA);
		junaTyontekija.setPuhNumero(TESTI_PUHNUMERO);
		junaTyontekija.setMaa(TESTI_MAA);
		junaTyontekija.setIka(TESTI_IKA);
		junaTyontekija.setTyosuhteenAlkupvm(dtNow); 
		junaTyontekija.setKunta(TESTI_KUNTA);
		junaTyontekija.setZipKoodi(TESTI_ZIPKOODI);
		
		assertEquals(junaTyontekija.getNimi(),TESTI_NIMI);
		assertEquals(junaTyontekija.getEmail(), TESTI_EMAIL);
		assertEquals(junaTyontekija.getOsoite(), TESTI_OSOITE);
		assertEquals(junaTyontekija.getPalkka(), TESTI_PALKKA, 0.001);
		assertEquals(junaTyontekija.getPuhNumero(),TESTI_PUHNUMERO);
		assertEquals(junaTyontekija.getMaa(), TESTI_MAA);
		assertEquals(junaTyontekija.getIka(), TESTI_IKA);
		assertEquals(junaTyontekija.getTyosuhteenAlkupvm(),dtNow); 
		assertEquals(junaTyontekija.getKunta(), TESTI_KUNTA);
		assertEquals(junaTyontekija.getZipKoodi(),TESTI_ZIPKOODI);
	}
	
	@Test
	public void junaTyontekijanLuonti2() throws HenkilonNimiException
	{
		Date dtNow = new Date();
		JunaTyontekija junaTyontekija = new 
				JunaTyontekija(TESTI_NIMI, TESTI_IKA, TESTI_OSOITE, 
						TESTI_ZIPKOODI, TESTI_KUNTA, TESTI_MAA, 
						TESTI_PUHNUMERO, TESTI_EMAIL,			
						TESTI_PALKKA, dtNow);
		assertEquals(junaTyontekija.getNimi(),TESTI_NIMI);
		assertEquals(junaTyontekija.getEmail(), TESTI_EMAIL);
		assertEquals(junaTyontekija.getOsoite(), TESTI_OSOITE);
		assertEquals(junaTyontekija.getPalkka(), TESTI_PALKKA, 0.001);
		assertEquals(junaTyontekija.getPuhNumero(),TESTI_PUHNUMERO);
		assertEquals(junaTyontekija.getMaa(), TESTI_MAA);
		assertEquals(junaTyontekija.getIka(), TESTI_IKA);
		assertEquals(junaTyontekija.getTyosuhteenAlkupvm(),dtNow); 
		assertEquals(junaTyontekija.getKunta(), TESTI_KUNTA);
		assertEquals(junaTyontekija.getZipKoodi(),TESTI_ZIPKOODI);
	}
	
	@Test(expected = HenkilonNimiException.class)
	public void junaTyontekijaNimiException1() throws HenkilonNimiException {
		JunaTyontekija junaTyontekija = new JunaTyontekija();
		junaTyontekija.setNimi("h");
	}
	
	@Test(expected = HenkilonNimiException.class)
	public void junaTyontekijaNimiException2() throws HenkilonNimiException {
		Date dtNow = new Date();
		JunaTyontekija junaTyontekija = new 
				JunaTyontekija("h", TESTI_IKA, TESTI_OSOITE, 
						TESTI_ZIPKOODI, TESTI_KUNTA, TESTI_MAA, 
						TESTI_PUHNUMERO, TESTI_EMAIL,			
						TESTI_PALKKA, dtNow);
	}
}
