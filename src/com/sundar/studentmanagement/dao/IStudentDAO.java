package com.sundar.studentmanagement.dao;

import java.util.Map;

import com.sundar.studentmanagement.vo.StatusVO;
import com.sundar.studentmanagement.vo.StudentVO;

public interface IStudentDAO {
	public  StatusVO createStudent(StudentVO studentVO);
	public  Map<String,Object> getStudentById(String regno);
	public  StatusVO updateStudent(StudentVO studentVO);
	public  StatusVO deleteStudent(String regno);
	public  Map<String,Object> getAllStudents();
}
