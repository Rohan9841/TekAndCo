package collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC1 {

	public void executeJdbcProg() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/USA","root","root");
			String sql = "create table abd(eid int(20), ename varchar(30), esalary float(30)";
			Statement statement = connection.createStatement();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
