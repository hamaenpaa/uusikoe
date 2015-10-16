package etaoliot;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LipunMyyntiTest {
	@Test 
	public void testLuoLipunMyynti1() {
		LipunMyynti lipunMyynti = new LipunMyynti();
		List<MatkaLippu> matkaLiput = new ArrayList<MatkaLippu>();
		for(int i=0; i < (int)(Math.random() * 100 + 1); i++) {
			matkaLiput.add(mock(MatkaLippu.class));
		}
		
		lipunMyynti.setMyydytLiput(matkaLiput);
		List<MatkaLippu> mGetMatkaLiput = lipunMyynti.getMyydytLiput();
		assertEquals(mGetMatkaLiput.size(), matkaLiput.size());
		for(MatkaLippu m : mGetMatkaLiput)
			assertTrue("matkaliput ei täsmää", matkaLiput.contains(m));
	}
}
