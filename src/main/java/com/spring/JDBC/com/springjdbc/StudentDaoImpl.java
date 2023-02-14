package com.spring.JDBC.com.springjdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImpl implements StudentDao {

	
	private JdbcTemplate jdbcTemp11;  // it is the 
	
	public int insert(Student stud) {
		// TODO Auto-generated method stub
		
		String query="insert into student values(?,?,?)"; // you can write into student values(7,'vishal'
		
	 
		
		int r= this.jdbcTemp11.update(query,stud.getId(),stud.getName(),stud.getCity());
		
		return r;
	}

	
	public JdbcTemplate getJdbcTemp11() {
		return jdbcTemp11;
	}

	public void setJdbcTemp11(JdbcTemplate jdbcTemp11) {
		this.jdbcTemp11 = jdbcTemp11;
	}


	public int change(Student stud) {
		// TODO Auto-generated method stub
		
       String query= "update Student set name=? , city=? where id=?";
		
	 
		
		int r= this.jdbcTemp11.update(query,stud.getName(),stud.getCity(),stud.getId());
		
		return 0;
	}


	public int delete(int id) {
		// TODO Auto-generated method stub
		
     String query= "delete from student  where id=?";
		
	
		int r= this.jdbcTemp11.update(query,id);
		
		return 0;
	}


	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		
		String query="select * from student where id=?";
		
		RowMapper<Student> rowMapper=new RowMapperimpl();
		
		Student stud=this.jdbcTemp11.queryForObject(query, rowMapper,id);
		
		return stud;
	}


	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
	   String query="select * from student";	
		
	   RowMapper<Student> rowMapper=new RowMapperimpl();
		
		List<Student> studs =this.jdbcTemp11.query(query, rowMapper);
		
		return studs;

		
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
