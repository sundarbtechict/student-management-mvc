package com.sundar.studentmanagement.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

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
			StudentServiceImpl s=StudentServiceImpl.getStudentService();
			Map<String,Object> map=s.getAllStudents();
				@SuppressWarnings("unchecked")
				List<StudentVO> studentList=(List<StudentVO>) map.get("StudentList");
				StatusVO statusVO=(StatusVO) map.get("StatusVO");
				request.setAttribute("studentList",studentList);
				if(statusVO.getStatusCode() =="Problems")
					request.setAttribute("status",statusVO);
				else
				{
					StatusVO statusVO2=(StatusVO)request.getAttribute("status");
					request.setAttribute("status",statusVO2);
				}
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
