package etaoliot;

import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Test;


public class ReittiTest {
	@Test
	public void testLuoReitti() {
		Reitti reitti = new Reitti();
		List<PaikanVaraus> paikanVaraukset = new ArrayList<PaikanVaraus>();
		for(int i=0; i < (int)(Math.random() * 3 + 1); i++) 
			paikanVaraukset.add(mock(PaikanVaraus.class));
		reitti.setPaikanVaraukset(paikanVaraukset);
		
		List<PaikanVaraus> mGetPaikanVaraukset = reitti.getPaikanVaraukset();
		assertEquals(mGetPaikanVaraukset.size(), paikanVaraukset.size());
		for(PaikanVaraus pv : paikanVaraukset)
			assertTrue("Paikanvaraukset ei täsmää", mGetPaikanVaraukset.contains(pv));
	}
}
