package section16_Database_Access_with_JDBC.application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import section16_Database_Access_with_JDBC.database.DB;
import section16_Database_Access_with_JDBC.database.DBException;

public class Class_87 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate(
					
					"UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1"
				);
			
			/*int x = 1;
			if (x < 2) {
				throw new SQLException("Fake error");
			}*/
			
			int rows2 = st.executeUpdate(
				    "UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2"		
				);
			
			conn.commit();
			
			System.out.println("rows1 " + rows1);
			System.out.println("rows2 " + rows2);
			
		} catch (SQLException e) {
			try {
				conn.rollback();
				throw new DBException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DBException("Error trying to rollback! Caused by: " + e1.getMessage());
			}
		
		} finally {
			DB.closeConnection();
			DB.closeStatement(st);
		}
	}
}
