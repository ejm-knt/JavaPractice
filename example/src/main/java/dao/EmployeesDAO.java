package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Employee;

public class EmployeesDAO {
	//DB接続に使用する情報
	private final String JDBC_URL = "jdbc:mysql://localhost:3306/example_db_20230719am?useUnicode=true&characterEncoding=utf8";
	private final String DB_USER  = "root";
	private final String DB_PASS  = "root";
	
	public List<Employee> findAll(){
		List<Employee> empList = new ArrayList<>();
		
		//JDBCドライバを読み込む
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		//DBに接続
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			
			//SELECT文を準備
			String sql = "SELECT ID, NAME, AGE FROM EMPLOYEES";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();
			
			//結果表に格納されたレコードの内容を
			//Employeeインスタンスに設定し、ArrayListインスタンスに追加
			while (rs.next()) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");
				Employee employee = new Employee(id, name, age);
				empList.add(employee);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return empList;
	}
	
	public boolean remove (String id){
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
		String sql = "DELETE FROM EMPLOYEES WHERE ID = ?";
		PreparedStatement pStmt = conn.prepareStatement(sql);
		pStmt.setString(1, id);
		int result = pStmt.executeUpdate();
		return (result == 1);
		
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
