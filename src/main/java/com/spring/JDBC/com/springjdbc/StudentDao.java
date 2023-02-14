package com.spring.JDBC.com.springjdbc;

import java.util.List;

public interface StudentDao {

	public int insert(Student stud);   // it is for insert operation
	public int change(Student stud);  //  it is for change operation
	public int delete(int id);         // it is for delete operation
	public Student getStudent(int id);  // it is for select operation
	
	
	public List<Student> getAllStudents();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
