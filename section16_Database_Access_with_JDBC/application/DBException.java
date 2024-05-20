package section16_Database_Access_with_JDBC.application;

public class DBException extends RuntimeException {

	private static final long serialVersionUID = 1L;
		
	public DBException(String msg) {
		super(msg);
	}

}
