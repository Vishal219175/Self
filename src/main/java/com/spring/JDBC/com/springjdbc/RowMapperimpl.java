package com.spring.JDBC.com.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperimpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Student stud=new Student();
		
		stud.setId(rs.getInt(1)); // 1 means it will get the 1 st id's value from our sql
		stud.setName(rs.getString(2)); // 2 means it will return from our sql table's 2nd value that will be a string like string name
		stud.setCity(rs.getString(3));  // 3 means it will return the 3 rd value from our sql table like our string citu
		
		
		
		return stud;
	}

	
	
	
	
	
	
	
	
}
