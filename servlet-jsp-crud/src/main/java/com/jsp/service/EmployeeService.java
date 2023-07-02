package com.jsp.service;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class EmployeeService {
	EmployeeDao dao = new EmployeeDao();

	public Employee saveEmployee(Employee employee) {
		return dao.saveEmployee(employee);
	}

	public Employee getEmployeeById(int id) {
		return dao.getEmployeeById(id);
	}

	public List<Employee> getAll() {
		return dao.getAll();
	}
	
	public Employee deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}
	
	public Employee updateEmployee(Employee employee) {
		return dao.updateEmployee(employee);
	}
	
	public Employee login(String name, long phno) {
		return dao.login(name, phno);
	}
	
	public Employee deleteByName(Employee employee) {
		return dao.deleteByName(employee);
	}
}
