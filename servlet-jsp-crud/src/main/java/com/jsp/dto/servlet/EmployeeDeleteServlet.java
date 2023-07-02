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

@WebServlet("/deleteemployee")
public class EmployeeDeleteServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
             
		Employee employee = new Employee();
		
		employee.setId(Integer.parseInt(req.getParameter("id")));
		
		EmployeeService service = new EmployeeService();
		
		service.deleteEmployee(employee.getId());
		
		if (employee != null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("employeehome.jsp");
			dispatcher.forward(req, resp);
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("deleteemployee.jsp");
			dispatcher.include(req, resp);
		}
	}
}
