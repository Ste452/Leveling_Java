package section16_Database_Access_with_JDBC.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import section16_Database_Access_with_JDBC.database.DB;
import section16_Database_Access_with_JDBC.database.DBIntegrityException;

public class class_86 {

	public static void main(String[] args) {
		
		 Connection conn = null;
		 PreparedStatement st = null;
		 
		 try {
			 conn = DB.getConnection();
			 
			 st = conn.prepareStatement(
					 "DELETE FROM department "
					 + "WHERE DELETE "
					 + "Id = ?"
			    );
			 
			 st.setInt(1, 2);
             
			 int rowsAffected = st.executeUpdate();
			 
			 System.out.println("Done rows affected: " + rowsAffected);
		 
		 } catch (SQLException e) {
			 
			 throw new DBIntegrityException(e.getMessage());
		 } finally {
			 DB.closeStatement(st);
			 DB.closeConnection();
		 }

	}

}
