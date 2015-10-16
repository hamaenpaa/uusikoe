package etaoliot;

import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Test;


public class MatkaLippuTest {
	@Test
	public void testLuoMatkaLippu1() {
		MatkaLippu matkaLippu = new MatkaLippu();
		List<PaikanVaraus> paikanVaraukset = new ArrayList<PaikanVaraus>();
		for(int i=0; i < (int)(Math.random() * 3 + 1); i++) 
			paikanVaraukset.add(mock(PaikanVaraus.class));
		matkaLippu.setPaikanVaraukset(paikanVaraukset);
		
		List<PaikanVaraus> mGetPaikanVaraukset = matkaLippu.getPaikanVaraukset();
		assertEquals(mGetPaikanVaraukset.size(), paikanVaraukset.size());
		for(PaikanVaraus pv : paikanVaraukset)
			assertTrue("Paikanvaraukset ei täsmää", mGetPaikanVaraukset.contains(pv));
	}
	
	@Test 
	public void testLuoMatkaLippu2() {
		List<PaikanVaraus> paikanVaraukset = new ArrayList<PaikanVaraus>();
		for(int i=0; i < (int)(Math.random() * 3 + 1); i++) 
			paikanVaraukset.add(mock(PaikanVaraus.class));
		MatkaLippu matkaLippu = new MatkaLippu(paikanVaraukset);
		List<PaikanVaraus> mGetPaikanVaraukset = matkaLippu.getPaikanVaraukset();
		assertEquals(mGetPaikanVaraukset.size(), paikanVaraukset.size());
		for(PaikanVaraus pv : paikanVaraukset)
			assertTrue("Paikanvaraukset ei täsmää", mGetPaikanVaraukset.contains(pv));
	}
}
