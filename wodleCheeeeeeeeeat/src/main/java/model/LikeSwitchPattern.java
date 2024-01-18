package model;

import java.util.List;

public class LikeSwitchPattern {
	
	public String execute (List<YellowSpell> yellow) {
		StringBuilder containsSql = new StringBuilder();
		
		if (yellow.isEmpty()) {
			containsSql.append("");
		} else {
			for (int i=0; i < yellow.size(); i++) {
				
				switch (yellow.get(i).getPosition()) {
				case 1:
					containsSql.append(" AND WORD NOT LIKE '").append(yellow.get(i).getAlphabet()).append("____' AND WORD LIKE '%").append(yellow.get(i).getAlphabet()).append("%'");
				break;
					
				case 2:
					containsSql.append(" AND WORD NOT LIKE '_").append(yellow.get(i).getAlphabet()).append("___' AND WORD LIKE '%").append(yellow.get(i).getAlphabet()).append("%'");
				break;
				
				case 3:
					containsSql.append(" AND WORD NOT LIKE '__").append(yellow.get(i).getAlphabet()).append("__' AND WORD LIKE '%").append(yellow.get(i).getAlphabet()).append("%'");
				break;
				
				case 4:
					containsSql.append(" AND WORD NOT LIKE '___").append(yellow.get(i).getAlphabet()).append("_' AND WORD LIKE '%").append(yellow.get(i).getAlphabet()).append("%'");
				break;
				
				case 5:
					containsSql.append(" AND WORD NOT LIKE '____").append(yellow.get(i).getAlphabet()).append("' AND WORD LIKE '%").append(yellow.get(i).getAlphabet()).append("%'");
				break;
				}
			}
		}
		return containsSql.toString();
	}
	
}
