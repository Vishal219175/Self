package com.spring.JDBC.com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/JDBC/com/springjdbc/com.spring.jdbc.xml");	
    
      StudentDao s1=(StudentDao) context.getBean("sd11");	
    	
		/*
		 * // insert
		 * 
		 * Student s=new Student(); s.setId(5); s.setName("cristiano");
		 * s.setCity("portugal");
		 * 
		 * int res=s1.insert(s);
		 * 
		 * 
		 * System.out.println(res+"student added successfully");
		 */ 
      
      // delete operation
     // Student s= new Student();
   //   s.setId(5);
   //   s.setName("sachin");
   //   s.setCity("mumbai");
      
   //   int res=s1.change(s);
      
    //  System.out.println(res+"Student updated successfully");
     
      
	/* for delete operation
	 * Student s= new Student();
	 * 
	 * int res=s1.delete(5);
	 * 
	 * System.out.println("deletion successfully");
	 */
      
      
	/*
	 * // for select operation
	 * 
	 * Student stud=s1.getStudent(7);
	 * 
	 * System.out.println(stud);
	 * 
	 */      
      
      
     // List
      
      List<Student> stud1=s1.getAllStudents();
      
      for(Student n: stud1)
      {
       System.out.println(n);
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    }  	
}
