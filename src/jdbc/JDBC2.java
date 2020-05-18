package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC2 {

	public Connection dbConnect() {
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/USA","root","root");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return connection;
	}
	
	
}
