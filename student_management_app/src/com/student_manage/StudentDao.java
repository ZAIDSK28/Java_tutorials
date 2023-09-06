package com.student_manage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;

public class StudentDao {
	
	public static boolean InsertintoStudent(Student st) {
		boolean f = false;
		
		try {
			
			// JDBC code ....
			Connection con = CP.CreacteC();
			String q = "insert into students(sname , sphone , scity ) values(? , ? , ?)";
			// prepared Statement
			PreparedStatement pstmt =con.prepareStatement(q);
			// set values of parameters 
			pstmt.setString(1, st.getStudnet_name());
			pstmt.setString(2, st.getStudent_phone());
			pstmt.setString(3, st.getStudent_city());
			
			//Execute .....
			pstmt.executeUpdate();
			f= true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int studentId) {
		boolean f= false;
		try {
			Connection con = CP.CreacteC();
			String q= "delete from studentS where sid=?";
			PreparedStatement ptsmt = con.prepareStatement(q);
			ptsmt.setInt(1, studentId);
			ptsmt.executeUpdate();
			f=true;
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		return f;
	}

	public static void showAllstudents() {
		
		try {
			Connection con = CP.CreacteC();
			String q= "select * from students ";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			
			while(set.next()) {
				int id =set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString(4);
				
				
				System.out.println("id :"+id );
				System.out.println("name :"+name );
				System.out.println("phone :"+phone );
				System.out.println("city :"+city );
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
