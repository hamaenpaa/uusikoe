package etaoliot;

import java.util.List;

public class MatkaLippu {
	private List<PaikanVaraus> paikanVaraukset;
	
	public MatkaLippu() {}
	
	public MatkaLippu(List<PaikanVaraus> paikanVaraukset) {
		this.paikanVaraukset = paikanVaraukset;
	}

	public List<PaikanVaraus> getPaikanVaraukset() {
		return paikanVaraukset;
	}

	public void setPaikanVaraukset(List<PaikanVaraus> paikanVaraukset) {
		this.paikanVaraukset = paikanVaraukset;
	}
}
