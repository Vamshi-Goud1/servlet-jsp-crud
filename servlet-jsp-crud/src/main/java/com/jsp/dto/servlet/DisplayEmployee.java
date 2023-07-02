package com.jsp.dto.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;


@WebServlet("/displayemployee")
public class DisplayEmployee extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         EmployeeService service = new EmployeeService();
         List<Employee> list=service.getAll();
         
         if(list.size()>0) {
        	 req.setAttribute("emp", list);
        	 RequestDispatcher dispatcher = req.getRequestDispatcher("displayemployee.jsp");
        	 dispatcher.forward(req, resp);
         }else {
        	 RequestDispatcher dispatcher = req.getRequestDispatcher("displayemployee.jsp");
        	 dispatcher.include(req, resp); 
         }
	}
}
