package com.student_manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.print.DocFlavor.INPUT_STREAM;

public class Start {

	public static void main(String[] args) throws IOException {
		
		System.out.println();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("PRESS 1 TO ADD STUDENT");
			System.out.println("PRESS 2 TO DELETE STUDENT");
			System.out.println("PRESS 3 TO DISPLAY STUDENT");
			System.out.println("PRESS 4 TO EXIT");
			int c = Integer.parseInt(br.readLine());
			if(c==1)
			{
				System.out.println(" ENTER STUDENT NAME : ");
				String name = br.readLine();
				
				System.out.println(" ENTER STUDENT PHONE NUMBER : ");
				String phone = br.readLine();
				
				System.out.println(" ENTER STUDENT CITY : ");
				String city = br.readLine();
				
				Student st= new Student(name, city, phone);
				System.out.println(st);
				boolean ans = StudentDao.InsertintoStudent(st);
				if(ans) {
					System.out.println("STUDENT ADDED SUCCESSFULLY !!!!");
				}else {
					System.out.println("SOMETHING WENT WRONG !!!");
				}
				
				
			}else if(c==2)
			{
				System.out.println("ENTER STUDENT ID TO DELETE : ");
				int studentId = Integer.parseInt(br.readLine());
				boolean ans = StudentDao.deleteStudent(studentId);
				if(ans) {
					System.out.println(" SUCCESSFULLY DELETED ");
				}else {
					System.out.println(" SOMETHING WENT WRONG ");
				}
			}else if(c==3)
			{
				StudentDao.showAllstudents();
				
			}else if(c==4)
			{
				System.out.println("THANK YOU FOR USING MY APPLICATION ");
				break;
			}else {
				
			}
		}

	}

}
