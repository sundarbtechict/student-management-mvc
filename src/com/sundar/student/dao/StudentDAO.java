package com.sundar.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sundar.student.util.DBUtil;

public class StudentDAO {
	public  void insert(StudentVO st)
	{
		try{
			Connection c=DBUtil.getConnection();
			PreparedStatement ps=c.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?,?,?,?)");
			ps.setString(1, st.getRegNo());
			ps.setString(2, st.getName());
			ps.setString(3, st.getDob());
			ps.setString(4, st.getDept());
			ps.setString(5, st.getEmail());
			ps.setString(6, st.getMobile());
			int n=ps.executeUpdate();
			if(n==0)
				System.out.println("record is not inserted");
			else
				System.out.println("record is sucessfully inserted");
			ps.close();
			c.close();
		}catch (Exception e){System.out.println(e);}
	}
	public  StudentVO read(String regno)
	{
		StudentVO st=new StudentVO();
		try{
			Connection c= DBUtil.getConnection();
			String sql="SELECT * FROM STUDENT WHERE regno=?";
			PreparedStatement ps=c.prepareStatement(sql);
			ps.setString(1,regno);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				st.setRegNo(rs.getString("regno"));
				st.setName(rs.getString("name"));
				st.setDob(rs.getString("dob"));
				st.setEmail(rs.getString("email"));
				st.setMobile(rs.getString("mobile"));
				st.setDept(rs.getString("dept"));
				st.setF(true);
			}
			rs.close();
			ps.close();
			c.close();
			return st;
		}catch (Exception e){System.out.println(e);return st;}
	}
	public  void update(StudentVO st)
	{
	try{
		Connection c=DBUtil.getConnection();
		PreparedStatement ps=c.prepareStatement("UPDATE STUDENT "
				+ "SET NAME=?,DOB=?,DEPT=?,EMAIL=?,MOBILE=?"
				+ "WHERE REGNO=?");
		ps.setString(6, st.getRegNo());
		ps.setString(1, st.getName());
		ps.setString(2, st.getDob());
		ps.setString(3, st.getDept());
		ps.setString(4, st.getEmail());
		ps.setString(5, st.getMobile());
		int n=ps.executeUpdate();
		if(n==0)
			System.out.println("record is not inserted");
		else
			System.out.println("record is sucessfully inserted");
		ps.close();
		c.close();
	}catch (Exception e){System.out.println(e);}
	}
	public  void delete(String regno) 
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
	public  List<StudentVO> select() throws Exception
	{
		List<StudentVO> li=new ArrayList<StudentVO>();
		Connection c= DBUtil.getConnection();
		String sql="SELECT * FROM STUDENT";
		PreparedStatement ps=c.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			StudentVO st=new StudentVO();
			st.setRegNo(rs.getString("regno"));
			st.setName(rs.getString("name"));
			st.setDob(rs.getString("dob"));
			st.setDept(rs.getString("dept"));
			st.setEmail(rs.getString("email"));
			st.setMobile(rs.getString("mobile"));
			li.add(st);
		}
		rs.close();
		ps.close();
		c.close();
		return li;
	}


}
