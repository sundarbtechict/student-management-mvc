package com.sundar.student.service;

import java.util.List;

import com.sundar.student.dao.StudentDAO;
import com.sundar.student.dao.StudentVO;

public class StudentService {
	

	public  void insert(StudentVO st)
	{
		StudentDAO s=new StudentDAO();
		s.insert(st);
	}
	public  StudentVO read(String regno)
	{
		StudentDAO s=new StudentDAO();
		StudentVO st=s.read(regno);
		return st;
		
	}
	public  void update(StudentVO st){
		StudentDAO s=new StudentDAO();
		s.update(st);
	}
	public  void delete(String regno){
		StudentDAO s=new StudentDAO();
		s.delete(regno);
	}
	public  List<StudentVO> select() throws Exception{
		StudentDAO s=new StudentDAO();
		List<StudentVO> li=s.select();
		return li;
	}
}
