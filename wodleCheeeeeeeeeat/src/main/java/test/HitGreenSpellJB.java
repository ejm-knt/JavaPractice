package test;

public class HitGreenSpellJB {
	private String[] hits = new String[5];
	
	public HitGreenSpellJB(String[] hits) {
		this.hits = hits;
	}

	public String[] getHits() {
		return hits;
	}

	public void setHits(String[] hits) {
		this.hits = hits;
	}
	
	public String createSqlCode(String[] hits) {
		String hitGreenSpell = "LIKE '";
		
		for (int i = 0; i < hits.length; i++) {
			hitGreenSpell += hits[i];
		}
		hitGreenSpell += "'";
		
		return hitGreenSpell;
	}
	
	
}
