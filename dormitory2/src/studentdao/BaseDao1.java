package studentdao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class BaseDao1 {
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}//

	public void getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/aa?useUnicode=true&characterEncoding=utf-8";
			this.conn = (Connection) DriverManager.getConnection(url, "root",""); // 创建Connection对象con,olLearn为SQLServer数据库名称
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//

	public Connection getConn() {
		if (conn == null)
			this.getConnection();
		return conn;
	}//

	public Statement getStmt() {
		if (stmt != null)
			return stmt;
		if (conn == null)
			this.getConnection();
		try {
			this.stmt = (Statement) this.conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stmt;
	}//

	

}
