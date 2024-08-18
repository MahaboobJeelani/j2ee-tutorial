package org.jsp.projectApp;
import java.sql.*;
public class Project {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class is loaded and register");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			System.out.println("Connection Between java Application and driver");
			stmt = con.createStatement();
			System.out.println("platfrom is Created");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Closed the all costly resourses");
		}
	}
}
