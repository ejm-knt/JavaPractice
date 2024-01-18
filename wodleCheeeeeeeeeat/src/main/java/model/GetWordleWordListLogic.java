package model;

import java.util.List;

import dao.WordleWordsDAO;

public class GetWordleWordListLogic {

	public List<WordleWords> execute(String sql) {
		WordleWordsDAO dao = new WordleWordsDAO();
		List<WordleWords> wordleWordsList = dao.requestSQL(sql);
		return wordleWordsList;
	}
	
}
