package model;

public class GrayRegexPattern {

	public String execute(String gray) {
		StringBuilder sql = new StringBuilder();
		
		if (gray.isEmpty()) {
			sql.append("");
		} else {
			sql.append(" AND WORD REGEXP BINARY '^[a-z]{5}$' AND WORD NOT REGEXP BINARY '[").append(gray).append("]'");
		}
		
		return sql.toString();
	}
}

	

