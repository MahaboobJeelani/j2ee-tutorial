package org.jsp.demoApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Democlass {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("Com.mysql.jdbc.Driver");
			System.out.println("Driver class is loaded and registered");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			System.out.println("Establish the connection between the java Application and Driver");
			stmt = con.createStatement();
			System.out.println("Platfrom is created");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(stmt != null) {
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
		}
	}
}
