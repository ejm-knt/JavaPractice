import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectEmployees {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DBに接続
		try(Connection conn = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/example_db_20230719am?useUnicode=true&characterEncoding=utf8",
						"root", "root")){
		// SELECT文を準備
			String sql = "SELECT ID,NAME,AGE FROM EMPLOYEES";
			PreparedStatement pStmt = conn.prepareStatement(sql);
		
		// SELECT文実行
			ResultSet rs = pStmt.executeQuery();
			
		//結果表に格納されたレコードの表示
			while(rs.next()) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");
				
				//取得したデータを出力
				System.out.println("ID:"+ id);
				System.out.println("NAME:"+ name);
				System.out.println("AGE:"+ age + "\n");
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
