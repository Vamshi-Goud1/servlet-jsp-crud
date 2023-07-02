package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Employee;

public class EmployeeDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vg");

	public Employee saveEmployee(Employee employee) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		if (employee != null) {
			et.begin();
			em.persist(employee);
			et.commit();

		}
		return employee;
	}

	public Employee getEmployeeById(int id) {

		EntityManager em = emf.createEntityManager();
		return em.find(Employee.class, id);

	}

	public List<Employee> getAll() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("select a from Employee a");
		return query.getResultList();
	}

	public Employee deleteEmployee(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Employee s = em.find(Employee.class, id);

		if (s != null) {
			et.begin();
			em.remove(s);
			et.commit();
		}
		return s;
	}

	public Employee updateEmployee(Employee student) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction etr = em.getTransaction();

		Employee s = em.find(Employee.class, student.getId());

		if (s != null) {
			etr.begin();
			em.merge(student);
			etr.commit();
		}
		return s;

	}

	public Employee login(String name, long phno) {
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select a from Student a where name=?1 and phno=?2");
		q.setParameter(1, name);
		q.setParameter(2, phno);

		List<Employee> list = q.getResultList();

		if (list.size() > 0) {
			return list.get(0);
		}
		return null;

	}

	public Employee deleteByName(Employee student) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction etr = em.getTransaction();

		Query q = em.createQuery("select a from Student a where name=?1");

		q.setParameter(1, student.getName());

		List<Employee> list = q.getResultList();

		if (list.size() > 0) {
            return list.get(0);
		}
      return null;
	}

}
