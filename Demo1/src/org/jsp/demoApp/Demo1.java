package org.jsp.demoApp;
import java.sql.*;
public class Demo1 {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("Com.mysql.jdbc.Driver");
			System.out.println("Driver Class is Loaded & registed");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			System.out.println("Connection is Established b/w java Application");
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Closed all the castly resources");
		}
	}
}
