package com.sundar.studentmanagement.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sundar.studentmanagement.vo.StatusVO;
import com.sundar.studentmanagement.vo.StudentVO;
import com.sundar.studentmanagement.service.StudentServiceImpl;

/**
 * Servlet implementation class CreateStudentServlet
 */
public class CreateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CreateStudentServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("HELLO: ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		StudentVO st=new StudentVO();
		st.setName(request.getParameter("name"));
		st.setRegNo(request.getParameter("regno"));
		st.setDob(request.getParameter("dob"));
		st.setEmail(request.getParameter("email"));
		st.setMobile(request.getParameter("mobile"));
		st.setDept(request.getParameter("dept"));
		StudentServiceImpl s=StudentServiceImpl.getStudentService();
		StatusVO statusVO=s.createStudent(st);
			request.setAttribute("status", statusVO);
		ServletContext context= getServletContext();
		RequestDispatcher rd= context.getRequestDispatcher("/index");
		rd.forward(request, response);
	}
}

