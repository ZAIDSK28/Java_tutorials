package com.student_manage;

public class Student {

	private int Student_id;
	private String studnet_name;
	private String Student_city;
	private String Student_phone;
	public Student(int student_id, String studnet_name, String student_city, String student_phone) {
		super();
		Student_id = student_id;
		this.studnet_name = studnet_name;
		Student_city = student_city;
		Student_phone = student_phone;
	}
	public Student(String studnet_name, String student_city, String student_phone) {
		super();
		this.studnet_name = studnet_name;
		Student_city = student_city;
		Student_phone = student_phone;
	}
	public Student() {
		super();
		
	}
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	@Override
	public String toString() {
		return "Student [Student_id=" + Student_id + ", studnet_name=" + studnet_name + ", Student_city=" + Student_city
				+ ", Student_phone=" + Student_phone + "]";
	}
	public String getStudnet_name() {
		return studnet_name;
	}
	public void setStudnet_name(String studnet_name) {
		this.studnet_name = studnet_name;
	}
	public String getStudent_city() {
		return Student_city;
	}
	public void setStudent_city(String student_city) {
		Student_city = student_city;
	}
	public String getStudent_phone() {
		return Student_phone;
	}
	public void setStudent_phone(String student_phone) {
		Student_phone = student_phone;
	}
}
