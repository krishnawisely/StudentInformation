package com.dayone;

import java.util.List;

public class StudDAO {
	public void addstudent(Student student)
	{
		String query="insert into stud (studname,studid,studreg) values (?,?,?)";
		Object[] params={student.getStudname(),student.getStudid(),student.getStudreg()};
		ConnectionUtil.gettemplate().update(query,params);
		}
	public List<Student> retrive()
	{
		String query="select * from stud";
		List<Student> result=ConnectionUtil.gettemplate().query(query, (rs,rowNo)->{
			Student student=new Student();
			student.setStudname(rs.getString("studname"));
			student.setStudid(rs.getInt("studid"));
			student.setStudreg(rs.getLong("studreg"));
			return student; 
		});
		
		return result;
	}
	}
	
	

