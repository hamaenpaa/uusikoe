package etaoliot;

import org.junit.Before;
import org.junit.Test;

public class BussiTest {
	@Before
	public void setUp() {
		
	}
	
	private static String[] KOHTEET = {"Tampere", "Jyväskylä", "Oulu", "Mikkeli", "Helsinki", 
			"Turku" };
	private static String[] ETUNIMET = {"Kalle", "Mikko", "Milla", "Jaana", "Heidi",
			"Mika", "Heikki", "Harri"};
	private static String[] SUKUNIMET = {"Mikkola", "Heikkinen", "Niemelä", "Mäenpää",
			"Haukkamäki", "Nenonen"};
	
	private Matkustaja1 getRandomMatkustaja() {
		Matkustaja1 m = new Matkustaja1();
		m.setKohde(KOHTEET[(int)(Math.random() * KOHTEET.length)]);
		m.setNimi(ETUNIMET[(int)(Math.random() * ETUNIMET.length)] + 
				  " " + SUKUNIMET[(int)(Math.random() * SUKUNIMET.length)]);
		m.setPaikanHinta(Math.random() * 100 + 10);
		return m;
	}
	
	@Test
	public void testBussiLuonti() {
		Bussi bussi = new Bussi();
		Matkustaja1[] matkustajat = new Matkustaja1[5];
		for(int i=0; i <matkustajat.length; i++) {
			matkustajat[i] = getRandomMatkustaja();
			bussi.lisaaMatkustaja(matkustajat[i]);
		}
	}
	
	@Test
	public void testBussiLuonti2() throws EiVaratujaPaikkojaPoikkeus {
		Bussi bussi = new Bussi(5);
		Matkustaja1[] matkustajat = new Matkustaja1[5];
		for(int i=0; i <matkustajat.length; i++) {
			matkustajat[i] = getRandomMatkustaja();
			bussi.lisaaMatkustaja(matkustajat[i]);
		}
		try {
			for(int i=0; i < matkustajat.length; i++)
				bussi.poistaViimeinen();
		}
		catch (EiVaratujaPaikkojaPoikkeus evpp) {
			throw evpp;
		}
	}
}
