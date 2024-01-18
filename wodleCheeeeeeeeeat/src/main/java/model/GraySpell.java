package model;

import java.io.Serializable;

public class GraySpell implements Serializable {
	private String alphabet;
	
	public GraySpell(String alphabet) {
		this.alphabet = alphabet;
	}

	public String getAlphabet() {
		return alphabet;
	}

	public void setAlphabet(String alphabet) {
		this.alphabet = alphabet;
	}

}
