package section16_Database_Access_with_JDBC.database;

public class DBIntegrityException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
		public DBIntegrityException(String msg) {
			super(msg);
		}
}
