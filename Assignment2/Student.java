package org.student;
import org.department.*;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student Name : Gayathri");
	}
	public void studentDept()
	{
		System.out.println("Student Department : CSE");
	}
	public void studentId()
	{
		System.out.println("Student ID : STUD1001");
	}
	
	
	public static void main(String[] args)
	{
		Student stud=new Student();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		stud.deptName();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		
	}

}
