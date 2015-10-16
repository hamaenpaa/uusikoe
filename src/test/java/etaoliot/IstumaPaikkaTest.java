package etaoliot;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

import org.junit.Test;

public class IstumaPaikkaTest {

	@Test
	public void testLuoIstumaPaikka1() {
		IstumaPaikka istumaPaikka = new IstumaPaikka();
		Vaunu vaunu = mock(Vaunu.class);
		istumaPaikka.setVaunu(vaunu);
		istumaPaikka.setxPos(10);
		istumaPaikka.setyPos(20);
		istumaPaikka.setlNettiYhteys(true);
		
		assertEquals(istumaPaikka.getVaunu(), vaunu);
		assertEquals(istumaPaikka.getxPos(), 10);
		assertEquals(istumaPaikka.getyPos(), 20);
		assertEquals(istumaPaikka.islNettiYhteys(), true);
	}
	
	@Test
	public void testLuoIstumaPaikka2() {
		Vaunu vaunu = mock(Vaunu.class);
		IstumaPaikka istumaPaikka = 
				new IstumaPaikka(vaunu, 10, 20, true);
		assertEquals(istumaPaikka.getVaunu(), vaunu);
		assertEquals(istumaPaikka.getxPos(), 10);
		assertEquals(istumaPaikka.getyPos(), 20);
		assertEquals(istumaPaikka.islNettiYhteys(), true);
	}
}
