package com.dayone;

import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		Student add=new Student();
		add.setStudname("anbu");
		add.setStudid(03);
		add.setStudreg(123458);
		StudDAO dao=new StudDAO();
		dao.addstudent(add);
		List<Student> data=dao.retrive();
		for(Student s:data)
		{
			System.out.println(s);
		}
	}


}
