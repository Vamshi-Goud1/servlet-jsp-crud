package com.jsp.dto.servlet;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

@WebServlet("/saveemployee")
public class EmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Employee employee = new Employee();

		employee.setName(req.getParameter("name"));
		employee.setPhone(Long.parseLong(req.getParameter("phone")));
		employee.setEmail(req.getParameter("email"));
		employee.setPassword(req.getParameter("pass"));

		EmployeeService service = new EmployeeService();
		service.saveEmployee(employee);

		if (employee != null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("employeehome.jsp");
			dispatcher.forward(req, resp);
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("register.jsp");
			dispatcher.include(req, resp);
		}
	}
}
