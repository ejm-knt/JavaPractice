package model;

import java.io.Serializable;

public class YellowSpell implements Serializable{
	private int position;
	private String alphabet;
	
	public YellowSpell(int position, String alphabet) {
		this.position = position;
		this.alphabet = alphabet;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getAlphabet() {
		return alphabet;
	}

	public void setAlphabet(String alphabet) {
		this.alphabet = alphabet;
	}

}
