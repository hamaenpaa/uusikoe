package etaoliot;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

import org.junit.Test;


public class VeturiTest {
	@Test
	public void testLuoVeturi1() {
		Veturi veturi = new Veturi();
		JunaTyontekija kuljettaja = mock(JunaTyontekija.class);
		veturi.setKuljettaja(kuljettaja);
		veturi.setTyyppi(2);
		assertEquals(kuljettaja, veturi.getKuljettaja());
		assertEquals(2, veturi.getTyyppi());
	}
	
	@Test
	public void testLuoVeturi2() {
		JunaTyontekija kuljettaja = mock(JunaTyontekija.class);
		Veturi veturi = new Veturi(kuljettaja, 2);
		assertEquals(kuljettaja, veturi.getKuljettaja());
		assertEquals(2, veturi.getTyyppi());
	}
}
