package etaoliot;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class JunaTest {

	@Test
	public void testLuoJuna1() {
		Juna juna = new Juna();
		
		List<Vaunu> vaunut = new ArrayList<Vaunu>();
		for(int i=0; i < (int)(Math.random() * 10 + 1); i++) 
			vaunut.add(mock(Vaunu.class));
		juna.setVaunut(vaunut);
		
		List<JunaTyontekija> junaTyontekijat = new ArrayList<JunaTyontekija>();
		for(int i=0; i < (int)(Math.random() * 20 + 1); i++) 
			junaTyontekijat.add(mock(JunaTyontekija.class));
		juna.setJunatyontekijat(junaTyontekijat);
		
		RavintolaVaunu ravintolaVaunu = mock(RavintolaVaunu.class);
		juna.setRavintolaVaunu(ravintolaVaunu);
		
		Veturi veturi = mock(Veturi.class);
		juna.setVeturi(veturi);
		
		List<Vaunu> mGetVaunut = juna.getVaunut();
		assertEquals(mGetVaunut.size(), vaunut.size());
		for(Vaunu mGetVaunu : mGetVaunut)
			assertTrue("Vaunut eivät täsmää", vaunut.contains(mGetVaunu));
		
		List<JunaTyontekija> mGetJunatyontekijat = juna.getJunatyontekijat();
		assertEquals(mGetJunatyontekijat.size(), junaTyontekijat.size());
		for(JunaTyontekija mGetJunaTyontekija : mGetJunatyontekijat)
			assertTrue("Vaunut eivät täsmää", junaTyontekijat.contains(mGetJunaTyontekija));
		
		assertEquals(ravintolaVaunu, juna.getRavintolaVaunu());
		assertEquals(veturi, juna.getVeturi());
	}
	
	@Test
	public void testLuoJuna2() {
		List<Vaunu> vaunut = new ArrayList<Vaunu>();
		for(int i=0; i < (int)(Math.random() * 10 + 1); i++) 
			vaunut.add(mock(Vaunu.class));
		List<JunaTyontekija> junaTyontekijat = new ArrayList<JunaTyontekija>();
		for(int i=0; i < (int)(Math.random() * 20 + 1); i++) 
			junaTyontekijat.add(mock(JunaTyontekija.class));
		RavintolaVaunu ravintolaVaunu = mock(RavintolaVaunu.class);
		Veturi veturi = mock(Veturi.class);

		Juna juna = new Juna(veturi, ravintolaVaunu, vaunut, junaTyontekijat);
		List<Vaunu> mGetVaunut = juna.getVaunut();
		assertEquals(mGetVaunut.size(), vaunut.size());
		for(Vaunu mGetVaunu : mGetVaunut)
			assertTrue("Vaunut eivät täsmää", vaunut.contains(mGetVaunu));
		
		List<JunaTyontekija> mGetJunatyontekijat = juna.getJunatyontekijat();
		assertEquals(mGetJunatyontekijat.size(), junaTyontekijat.size());
		for(JunaTyontekija mGetJunaTyontekija : mGetJunatyontekijat)
			assertTrue("Vaunut eivät täsmää", junaTyontekijat.contains(mGetJunaTyontekija));
		
		assertEquals(ravintolaVaunu, juna.getRavintolaVaunu());
		assertEquals(veturi, juna.getVeturi());
	}
	
}
