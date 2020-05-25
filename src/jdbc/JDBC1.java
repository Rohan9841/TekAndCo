package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC1 {

	public void executeJdbcProg() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/USA","root","root");
			String sql = "create table abd(eid int(20), ename varchar(30), esalary float(30)";
			Statement statement = connection.createStatement();
			statement.executeUpdate(sql);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void prepareOperations(int id, String name, float salary) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/USA","root","root");
			String sql = "insert into empdetails values(?,?,?)";
			
			PreparedStatement prepareStmt = con.prepareStatement(sql);
			
			prepareStmt.setInt(1,id);
			prepareStmt.setString(2,name);
			prepareStmt.setFloat(3,salary);
			
			int result = prepareStmt.executeUpdate();
	        
			if(result != 0) {
				System.out.println("EmpDetails successfully inserted");
			}else {
				System.out.println("Failed...");
			}
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("....catch Block...");
		}
	}
	
	public void callableOperations() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/USA","root","root");
			String sql = "select * from calculator";
			
			CallableStatement callableStatement = connection.prepareCall("{call calculateStatistics(?,?)}");
			
			callableStatement.setString(1,"param1");
			callableStatement.setInt(2,123);
			
			ResultSet rs = callableStatement.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1));
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		JDBC1 jdbcSample = new JDBC1();
		jdbcSample.executeJdbcProg();
		jdbcSample.prepareOperations(4,"Harry",25000);
		jdbcSample.callableOperations();
		
	}
}
