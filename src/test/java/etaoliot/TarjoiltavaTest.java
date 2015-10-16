package etaoliot;

import static org.junit.Assert.*;

import org.junit.Test;

public class TarjoiltavaTest {
	@Test
	public void testLuoTarjoiltava1() {
		Tarjoiltava tarjoiltava = new Tarjoiltava();
		tarjoiltava.setNimi("Kahvi");
		tarjoiltava.setHinta(2.50);
		assertEquals(tarjoiltava.getNimi(), "Kahvi");
		assertEquals(tarjoiltava.getHinta(), 2.50, 0.001);
	}
	
	@Test
	public void testLuoTarjoiltava2() {
		Tarjoiltava tarjoiltava = new Tarjoiltava("Kahvi", 2.50);
		assertEquals(tarjoiltava.getNimi(), "Kahvi");
		assertEquals(tarjoiltava.getHinta(), 2.50, 0.001);
	}
}
