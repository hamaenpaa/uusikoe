package etaoliot;

import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import static org.junit.Assert.*;

import org.junit.Test;

public class VaunuTest {

	private List<IstumaPaikka> getMockIstumaPaikat() {
		List<IstumaPaikka> istumaPaikat = new ArrayList<IstumaPaikka>();
		int iPaikkoja = (int)(Math.random() * 7 + 20);
		for(int i=0; i < iPaikkoja; i++)
			istumaPaikat.add(mock(IstumaPaikka.class));
		return istumaPaikat;
	}
	
	
	
	private List<PaikanVaraus> getMockPaikanVaraukset(
			List<IstumaPaikka> istumaPaikat) {
		int iPaikanVarauksia = (int)(Math.random() * istumaPaikat.size() + 1);
		List<PaikanVaraus> paikanVaraukset = new ArrayList<PaikanVaraus>();
		Iterator<IstumaPaikka> iterIstumaPaikka = istumaPaikat.iterator();
		for(int i=0; i < iPaikanVarauksia; i++) {
			PaikanVaraus paikanVaraus = mock(PaikanVaraus.class);
			paikanVaraukset.add(paikanVaraus);
			if (iterIstumaPaikka.hasNext()) {
				IstumaPaikka istumaPaikka = iterIstumaPaikka.next();
				paikanVaraus.setIstumaPaikka(istumaPaikka);
			}
		}
		return paikanVaraukset;
	}
	
	private List<Matkustaja> getMockMatkustajat(List<PaikanVaraus> paikanVaraukset) {
		List<Matkustaja> matkustajat = new ArrayList<Matkustaja>();
		for(int i=0; i < paikanVaraukset.size(); i++)
			matkustajat.add(mock(Matkustaja.class));
		return matkustajat;
	}

	@Test
	public void testLuoVaunu1() throws TooManyMatkustajaException {
		Vaunu vaunu = new Vaunu();
		List<IstumaPaikka> istumaPaikat = getMockIstumaPaikat();
		List<PaikanVaraus> paikanVaraukset = getMockPaikanVaraukset(istumaPaikat);
		List<Matkustaja> matkustajat = getMockMatkustajat(paikanVaraukset);
		vaunu.setIstumaPaikat(istumaPaikat);
		vaunu.setPaikanVaraukset(paikanVaraukset);
		vaunu.setMatkustajat(matkustajat);
		
		Matkustaja[] mGetMatkustajat = vaunu.getMatkustajat();
		assertTrue("Matkustajien määrä ei täsmää", mGetMatkustajat.length == matkustajat.size());
		for(int i=0; i < mGetMatkustajat.length; i++)
			assertTrue("matkustajat ei täsmää", matkustajat.contains(mGetMatkustajat[i]));
		List<PaikanVaraus> mGetPaikanVaraukset = vaunu.getPaikanVaraukset();
		assertTrue("paikanvarausten määrä ei täsmää", mGetPaikanVaraukset.size() ==
				paikanVaraukset.size());
		for(PaikanVaraus mGetPaikanVaraus : mGetPaikanVaraukset)
			assertTrue("paikanvaraukset ei täsmää", paikanVaraukset.contains(mGetPaikanVaraus));
		List<IstumaPaikka> mGetIstumaPaikat = vaunu.getIstumaPaikat();
		assertTrue("istumapaikkojen määrä ei täsmää", mGetIstumaPaikat.size() ==
				istumaPaikat.size());
		for(IstumaPaikka mGetIstumaPaikka : mGetIstumaPaikat)
			assertTrue("paikanvaraukset ei täsmää", istumaPaikat.contains(mGetIstumaPaikka));
	}
	
	@Test
	public void testLuoVaunu2() throws TooManyMatkustajaException {
		Vaunu vaunu = new Vaunu();
		List<IstumaPaikka> istumaPaikat = getMockIstumaPaikat();
		List<PaikanVaraus> paikanVaraukset = getMockPaikanVaraukset(istumaPaikat);
		List<Matkustaja> matkustajat = getMockMatkustajat(paikanVaraukset);
		Matkustaja[] matkustajaArr = new Matkustaja[matkustajat.size()];
		int i=0;
		for(Matkustaja m: matkustajat) {
			matkustajaArr[i] = m;
			i++;
		}
		vaunu.setPaikanVaraukset(paikanVaraukset);
		vaunu.setIstumaPaikat(istumaPaikat);
		vaunu.setMatkustajat(matkustajaArr);
		
		Matkustaja[] mGetMatkustajat = vaunu.getMatkustajat();
		assertTrue("Matkustajien määrä ei täsmää", mGetMatkustajat.length == matkustajat.size());
		for(i=0; i < mGetMatkustajat.length; i++)
			assertTrue("matkustajat ei täsmää", matkustajat.contains(mGetMatkustajat[i]));
		List<PaikanVaraus> mGetPaikanVaraukset = vaunu.getPaikanVaraukset();
		assertTrue("paikanvarausten määrä ei täsmää", mGetPaikanVaraukset.size() ==
				paikanVaraukset.size());
		for(PaikanVaraus mGetPaikanVaraus : mGetPaikanVaraukset)
			assertTrue("paikanvaraukset ei täsmää", paikanVaraukset.contains(mGetPaikanVaraus));
		List<IstumaPaikka> mGetIstumaPaikat = vaunu.getIstumaPaikat();
		assertTrue("istumapaikkojen määrä ei täsmää", mGetIstumaPaikat.size() ==
				istumaPaikat.size());
		for(IstumaPaikka mGetIstumaPaikka : mGetIstumaPaikat)
			assertTrue("paikanvaraukset ei täsmää", istumaPaikat.contains(mGetIstumaPaikka));
	}
	
	@Test
	public void testLuoVaunu3() throws TooManyMatkustajaException {
		List<IstumaPaikka> istumaPaikat = getMockIstumaPaikat();
		Vaunu vaunu = new Vaunu(istumaPaikat.size(), istumaPaikat);
		List<PaikanVaraus> paikanVaraukset = getMockPaikanVaraukset(istumaPaikat);
		List<Matkustaja> matkustajat = getMockMatkustajat(paikanVaraukset);
		vaunu.setMatkustajat(matkustajat);
		vaunu.setPaikanVaraukset(paikanVaraukset);
		
		Matkustaja[] mGetMatkustajat = vaunu.getMatkustajat();
		assertTrue("Matkustajien määrä ei täsmää", mGetMatkustajat.length == matkustajat.size());
		for(int i=0; i < mGetMatkustajat.length; i++)
			assertTrue("matkustajat ei täsmää", matkustajat.contains(mGetMatkustajat[i]));
		List<PaikanVaraus> mGetPaikanVaraukset = vaunu.getPaikanVaraukset();
		assertTrue("paikanvarausten määrä ei täsmää", mGetPaikanVaraukset.size() ==
				paikanVaraukset.size());
		for(PaikanVaraus mGetPaikanVaraus : mGetPaikanVaraukset)
			assertTrue("paikanvaraukset ei täsmää", paikanVaraukset.contains(mGetPaikanVaraus));
		List<IstumaPaikka> mGetIstumaPaikat = vaunu.getIstumaPaikat();
		assertTrue("istumapaikkojen määrä ei täsmää", mGetIstumaPaikat.size() ==
				istumaPaikat.size());
		for(IstumaPaikka mGetIstumaPaikka : mGetIstumaPaikat)
			assertTrue("paikanvaraukset ei täsmää", istumaPaikat.contains(mGetIstumaPaikka));
		
	}
	
	
}
