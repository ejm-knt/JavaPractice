package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Account;
import model.Login;

public class AccountsDAO {
	// DB接続に使用する情報
	private final String JDBC_URL = "jdbc:mysql://localhost:3306/sukkirishop_20230719am?useUnicode=true&characterEncoding=utf8";
	private final String DB_USER  = "root";
	private final String DB_PASS  = "root";
	
//	public List<Mutter> findAll() {
//		List<Mutter> mutterList = new ArrayList<>();
		
	
	public Account findbyLogin (Login login) {
		Account account = null;
		
		// JDBCドライバを読み込む
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try (Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {
			// select文を準備
			String sql = "SELECT * FROM ACCOUNTS WHERE USER_ID = ? AND PASS = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, login.getUserId());
			pStmt.setString(2, login.getPass());
			
			// select文の実行、結果表取得
			ResultSet rs = pStmt.executeQuery();
			
			if (rs.next()) {
				// ユーザーが存在したらデータ取得
				// そのユーザーを表すAccountインスタンスの生成
				
				String userId = rs.getString("USER_ID");
				String pass = rs.getString("PASS");
				String mail = rs.getString("MAIL");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");
				account = new Account(userId,pass,mail,name,age);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		return account;
	}
}