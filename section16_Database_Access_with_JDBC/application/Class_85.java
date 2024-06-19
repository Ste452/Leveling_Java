package section16_Database_Access_with_JDBC.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import section16_Database_Access_with_JDBC.database.DB;

public class Class_85 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement st = null;
		

		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					  
					"UPDATE seller " 
					+ "SET BaseSalary = BaseSalary + ?" 
					+ "WHERE "
					+ "(DepartmentId = ?)"
				);
			
			st.setDouble(1, 200.00);
			st.setInt(2, 2);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows Affected: " + rowsAffected);
		} catch (SQLException e) {
			
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
