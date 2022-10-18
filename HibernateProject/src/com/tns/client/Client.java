package com.tns.client;
import com.tns.entity.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;
public class Client
{
	public static void main(String[] args) 
	{
		//Debug this program as Debug -> Debug as Java
		StudentService service = new StudentServiceImpl();
		Student student = new Student();
		// Create Operation
//		student.setStudentId(105);
//		student.setName("Ravi");
//		service.addStudent(student);
		//at this breakpoint, we have added one record to table
		// Retrieve Operation
		student = service.findStudentById(105);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());
//		//Update Operation
//		student = service.findStudentById(101);
//		student.setName("Sachin Tendulkar");
//		service.updateStudent(student);
//		//at this breakpoint, we have updated record added in first section
//		student = service.findStudentById(101);
//		System.out.print("ID:"+student.getStudentId());
//		System.out.println(" Name:"+student.getName());
//		//at this breakpoint, record is removed from table
//		//Delete Operation
//		student = service.findStudentById(101);
//		service.removeStudent(student);
		System.out.println("End of program/Life cycle completed...");
}
}
