package com.student_manage;

import java.sql.DriverManager;
import java.sql.Connection;

public class CP {
	static Connection con;
	public static Connection  CreacteC (){
		try {
		 // #Step-1     Load the driver...... 
			Class.forName("com.mysql.cj.jdbc.Driver");
		// # Step-2     Create the connection.........
			String url = "jdbc:mysql://localhost:3306/student_manage";
			String user = "root";
			String pass = "root";
			con = DriverManager.getConnection(url, user, pass);
		
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
