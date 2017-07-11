package com.sundar.student.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sundar.student.dao.StudentVO;
import com.sundar.student.service.StudentService;

/**
 * Servlet implementation class IndexStudentServlet
 */
public class IndexStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			PrintWriter out = response.getWriter();	
			try{
				StudentService s=new StudentService();
			List<StudentVO> li=s.getAllStudents();
			request.setAttribute("studentList",li);
			}catch (Exception e){System.out.println(e);}
			out.println("hi");			
			ServletContext context= getServletContext();
			RequestDispatcher rd= context.getRequestDispatcher("/././index.jsp");
			rd.forward(request, response);
			out.println("sundar");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
