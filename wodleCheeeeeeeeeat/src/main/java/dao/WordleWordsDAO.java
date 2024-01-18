package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.WordleWords;

public class WordleWordsDAO {
	private final String JDBC_URL = "jdbc:mysql://localhost:3306/wordleword_db_20230719am?useUnicode=true&characterEncoding=utf8";
	private final String DB_USER  = "root";
	private final String DB_PASS  = "root";
	
	public List<WordleWords> requestSQL (String sql){
		List<WordleWords> wordleWordsList = new ArrayList<>();
		
			// JDBCドライバを読み込む
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			// DBに接続
			try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
				
				// SELECT文を準備				
				PreparedStatement pStmt = conn.prepareStatement(sql);
				
				// SELECTを実行
				ResultSet rs = pStmt.executeQuery();
				
				// SELECT文の実行結果をArrayListに格納
				
				while (rs.next()) {
					String word = rs.getString("WORD");
					int allSpellDifferent = rs.getInt("ALL_SPELL_DIFFERENT");
					WordleWords wordleWords = new WordleWords(word, allSpellDifferent);
					wordleWordsList.add(wordleWords);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			return wordleWordsList;
		}
}

