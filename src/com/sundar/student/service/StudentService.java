package com.sundar.student.service;

import java.util.List;

import com.sundar.student.dao.StudentDAO;
import com.sundar.student.dao.StudentVO;

public class StudentService {
	

	public  void createStudent(StudentVO studentVO)
	{
		StudentDAO studentDAO=new StudentDAO();
		studentDAO.createStudent(studentVO);
	}
	public  StudentVO getStudentById(String regno)
	{
		StudentDAO studentDAO=new StudentDAO();
		StudentVO studentVO=studentDAO.getStudentById(regno);
		return studentVO;
		
	}
	public  void updateStudent(StudentVO studentVO){
		StudentDAO studentDAO=new StudentDAO();
		studentDAO.updateStudent(studentVO);
	}
	public  void deleteStudent(String regno){
		StudentDAO studentDAO=new StudentDAO();
		studentDAO.deleteStudent(regno);
	}
	public  List<StudentVO> getAllStudents() throws Exception{
		StudentDAO studentDAO=new StudentDAO();
		List<StudentVO> list=studentDAO.getAllStudents();
		return list;
	}
}
