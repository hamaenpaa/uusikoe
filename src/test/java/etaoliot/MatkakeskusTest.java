package etaoliot;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class MatkakeskusTest {

	@Test
	public void testLuoMatkaKeskus() {
		Matkakeskus matkakeskus = new Matkakeskus();

		List<LipunMyynti> lipunMyynnit = new ArrayList<LipunMyynti>();
		for(int i=0; i < (int)(Math.random() * 10 + 1); i++) 
			lipunMyynnit.add(mock(LipunMyynti.class));
		matkakeskus.setLipunMyynnit(lipunMyynnit);
		
		List<Bussi> bussit = new ArrayList<Bussi>();
		for(int i=0; i < (int)(Math.random() * 50 + 1); i++) 
			bussit.add(mock(Bussi.class));
		matkakeskus.setBussit(bussit);
		
		List<Juna> junat = new ArrayList<Juna>();
		for(int i=0; i < (int)(Math.random() * 10 + 1); i++) 
			junat.add(mock(Juna.class));
		matkakeskus.setJunat(junat);
		
		List<Juna> mGetJunat = matkakeskus.getJunat();
		assertEquals(mGetJunat.size(), junat.size());
		for(Juna mGetJuna : mGetJunat)
			assertTrue("Junat eivät täsmää", junat.contains(mGetJuna));

		List<Bussi> mGetBussit = matkakeskus.getBussit();
		assertEquals(mGetBussit.size(), bussit.size());
		for(Bussi mGetBussi : mGetBussit)
			assertTrue("Bussit eivät täsmää", bussit.contains(mGetBussi));
		
		List<LipunMyynti> mGetLipunmyynnit = matkakeskus.getLipunMyynnit();
		assertEquals(mGetLipunmyynnit.size(), lipunMyynnit.size());
		for(LipunMyynti mGetLipunMyynti : mGetLipunmyynnit)
			assertTrue("Lipunmyynnit eivät täsmää", lipunMyynnit.contains(mGetLipunMyynti));
	}
}
