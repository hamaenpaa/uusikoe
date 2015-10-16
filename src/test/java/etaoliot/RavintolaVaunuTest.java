package etaoliot;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RavintolaVaunuTest {
	@Test
	public void testLuoRavintolaVaunu1() {
		RavintolaVaunu ravintolaVaunu = new RavintolaVaunu();
		List<Tarjoiltava> tarjoiltavat = new ArrayList<Tarjoiltava>();
		for(int i=0; i < (int)(Math.random() * 10 + 1); i++) 
			tarjoiltavat.add(mock(Tarjoiltava.class));
		ravintolaVaunu.setTarjoiltavat(tarjoiltavat);
		
		List<JunaTyontekija> tarjoilijat = new ArrayList<JunaTyontekija>();
		for(int i=0; i < (int)(Math.random() * 20 + 1); i++) 
			tarjoilijat.add(mock(JunaTyontekija.class));
		ravintolaVaunu.setTarjoilijat(tarjoilijat);
		
		List<Tarjoiltava> mGetTarjoiltavat = ravintolaVaunu.getTarjoiltavat();
		assertEquals(mGetTarjoiltavat.size(), tarjoiltavat.size());
		for(Tarjoiltava mGetTarjoiltava : mGetTarjoiltavat)
			assertTrue("Tarjoiltavat eivät täsmää", tarjoiltavat.contains(mGetTarjoiltava));
		
		List<JunaTyontekija> mGetTarjoilijat = ravintolaVaunu.getTarjoilijat();
		assertEquals(mGetTarjoilijat.size(), tarjoilijat.size());
		for(JunaTyontekija mGetTarjoilija : mGetTarjoilijat)
			assertTrue("Tarjoilijat eivät täsmää", tarjoilijat.contains(mGetTarjoilija));
	}

	@Test
	public void testLuoRavintolaVaunu2() {
		List<Tarjoiltava> tarjoiltavat = new ArrayList<Tarjoiltava>();
		for(int i=0; i < (int)(Math.random() * 10 + 1); i++) 
			tarjoiltavat.add(mock(Tarjoiltava.class));

		List<JunaTyontekija> tarjoilijat = new ArrayList<JunaTyontekija>();
		for(int i=0; i < (int)(Math.random() * 20 + 1); i++) 
			tarjoilijat.add(mock(JunaTyontekija.class));

		RavintolaVaunu ravintolaVaunu = new RavintolaVaunu(tarjoilijat, tarjoiltavat);

		List<Tarjoiltava> mGetTarjoiltavat = ravintolaVaunu.getTarjoiltavat();
		assertEquals(mGetTarjoiltavat.size(), tarjoiltavat.size());
		for(Tarjoiltava mGetTarjoiltava : mGetTarjoiltavat)
			assertTrue("Tarjoiltavat eivät täsmää", tarjoiltavat.contains(mGetTarjoiltava));
		
		List<JunaTyontekija> mGetTarjoilijat = ravintolaVaunu.getTarjoilijat();
		assertEquals(mGetTarjoilijat.size(), tarjoilijat.size());
		for(JunaTyontekija mGetTarjoilija : mGetTarjoilijat)
			assertTrue("Tarjoilijat eivät täsmää", tarjoilijat.contains(mGetTarjoilija));
	}
}
