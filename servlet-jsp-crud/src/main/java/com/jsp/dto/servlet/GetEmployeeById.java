package com.jsp.dto.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

@WebServlet("/editemployee")
public class GetEmployeeById extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		int id =(Integer.parseInt(req.getParameter("id")));
		
		EmployeeService service = new EmployeeService();
		
		                Employee employee2= service.getEmployeeById(id);
		
		if (employee2 != null) {
			req.setAttribute("emp", employee2);
			RequestDispatcher dispatcher = req.getRequestDispatcher("updateemployee.jsp");
			dispatcher.forward(req, resp);
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("editemployee.jsp");
			dispatcher.include(req, resp);
		}
	}
}
