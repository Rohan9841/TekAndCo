package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2 {

	public Connection dbConnect() {
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return connection;
	}
	
	public void uploadFile(String filePath) {
		Connection con = dbConnect();
		String sql = "INSERT INTO person (first_name,last_name,photo) values (?,?,?)";
		try {
			InputStream inputStream = new FileInputStream(new File(filePath));
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1,"Doctor");
			preparedStatement.setString(2, "Strange");
			preparedStatement.setBlob(3, inputStream);
			
			int row = preparedStatement.executeUpdate();
			
			System.out.println(row>0?("File uploaded"):("Error during file upload"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void downloadFile(String firstName) {
	
		Connection con = dbConnect();
		String sql = "SELECT photo FROM person WHERE first_name = "+firstName;
		File file = new File("Doctor_Strange.jpg");
		ResultSet rs = null;
		try {
			OutputStream out = new FileOutputStream(file);
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				InputStream input = rs.getBinaryStream("photo");
				byte[] buffer = new byte[1024];
				while(input.read(buffer)>0) {
					out.write(buffer);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null) {
					rs.close();
				}
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		JDBC2 jdbc2 = new JDBC2();
		
		String filePath = "D:/Photos/Dr.Strange.jpg";
		jdbc2.uploadFile(filePath);
		jdbc2.downloadFile("Doctor");
	}
	
}
