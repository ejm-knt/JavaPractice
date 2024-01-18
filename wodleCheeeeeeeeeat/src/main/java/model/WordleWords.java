package model;

import java.io.Serializable;

public class WordleWords implements Serializable {
	private String word;
	private int allSpellDifferent;
	
	public WordleWords () {}
	public WordleWords (String word, int allSpellDifferent) {
		this.word = word;
		this.allSpellDifferent = allSpellDifferent;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getAllSpellDifferent() {
		return allSpellDifferent;
	}
	public void setAllSpellDifferent(int allSpellDifferent) {
		this.allSpellDifferent = allSpellDifferent;
	}

	
}
