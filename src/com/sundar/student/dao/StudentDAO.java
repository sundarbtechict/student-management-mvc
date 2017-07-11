package com.sundar.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sundar.student.util.DBUtil;

public class StudentDAO {
	public  void createStudent(StudentVO studentVO)
	{
		try{
			Connection c=DBUtil.getConnection();
			PreparedStatement ps=c.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?,?,?,?)");
			ps.setString(1, studentVO.getRegNo());
			ps.setString(2, studentVO.getName());
			ps.setString(3, studentVO.getDob());
			ps.setString(4, studentVO.getDept());
			ps.setString(5, studentVO.getEmail());
			ps.setString(6, studentVO.getMobile());
			int n=ps.executeUpdate();
			if(n==0)
				System.out.println("record is not inserted");
			else
				System.out.println("record is sucessfully inserted");
			ps.close();
			c.close();
		}catch (Exception e){System.out.println(e);}
	}
	public  StudentVO getStudentById(String regno)
	{
		StudentVO studentVO=new StudentVO();
		try{
			Connection c= DBUtil.getConnection();
			String sql="SELECT * FROM STUDENT WHERE regno=?";
			PreparedStatement ps=c.prepareStatement(sql);
			ps.setString(1,regno);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				studentVO.setRegNo(rs.getString("regno"));
				studentVO.setName(rs.getString("name"));
				studentVO.setDob(rs.getString("dob"));
				studentVO.setEmail(rs.getString("email"));
				studentVO.setMobile(rs.getString("mobile"));
				studentVO.setDept(rs.getString("dept"));
				studentVO.setF(true);
			}
			rs.close();
			ps.close();
			c.close();
			return studentVO;
		}catch (Exception e){System.out.println(e);return studentVO;}
	}
	public  void updateStudent(StudentVO studentVO)
	{
	try{
		Connection c=DBUtil.getConnection();
		PreparedStatement ps=c.prepareStatement("UPDATE STUDENT "
				+ "SET NAME=?,DOB=?,DEPT=?,EMAIL=?,MOBILE=?"
				+ "WHERE REGNO=?");
		ps.setString(6, studentVO.getRegNo());
		ps.setString(1, studentVO.getName());
		ps.setString(2, studentVO.getDob());
		ps.setString(3, studentVO.getDept());
		ps.setString(4, studentVO.getEmail());
		ps.setString(5, studentVO.getMobile());
		int n=ps.executeUpdate();
		if(n==0)
			System.out.println("record is not inserted");
		else
			System.out.println("record is sucessfully inserted");
		ps.close();
		c.close();
	}catch (Exception e){System.out.println(e);}
	}
	public  void deleteStudent(String regno) 
	{
		try{
			Connection c= DBUtil.getConnection();
			String sql="DELETE FROM STUDENT WHERE regno=?";
			PreparedStatement ps=c.prepareStatement(sql);
			ps.setString(1,regno);
			ps.executeUpdate();
			ps.close();
			c.close();
		}catch (Exception e){System.out.println(e);}
	}
	public  List<StudentVO> getAllStudents() throws Exception
	{
		List<StudentVO> list=new ArrayList<StudentVO>();
		Connection c= DBUtil.getConnection();
		String sql="SELECT * FROM STUDENT";
		PreparedStatement ps=c.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			StudentVO studentVO=new StudentVO();
			studentVO.setRegNo(rs.getString("regno"));
			studentVO.setName(rs.getString("name"));
			studentVO.setDob(rs.getString("dob"));
			studentVO.setDept(rs.getString("dept"));
			studentVO.setEmail(rs.getString("email"));
			studentVO.setMobile(rs.getString("mobile"));
			list.add(studentVO);
		}
		rs.close();
		ps.close();
		c.close();
		return list;
	}


}
