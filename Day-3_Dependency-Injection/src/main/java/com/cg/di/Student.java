package com.cg.di;

//1.Dependencies in term of literals
public class Student {
	//variable
	private String Student_name;
	private int Student_rollno;
	
	//DI using constructor
	public Student(String student_name, int student_rollno) {
		super();
		Student_name = student_name;
		Student_rollno =student_rollno;
	}

	/*//setters method
	
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public void setStudent_rollno(int student_rollno) {
		Student_rollno = student_rollno;
	}*/
	
	//userDefined method
	public void display()
	{
		System.out.println("Student name is :"+Student_name+" "+"and Roll No is: "+Student_rollno);
	}




	
}
