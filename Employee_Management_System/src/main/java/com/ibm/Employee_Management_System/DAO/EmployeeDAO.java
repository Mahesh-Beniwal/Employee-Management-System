package com.ibm.Employee_Management_System.DAO;

import com.ibm.Employee_Management_System.DTO.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class EmployeeDAO {
	private static EntityManager entityManager = Persistence.createEntityManagerFactory("").createEntityManager();

	public Employee getEmployeeByID( String EmployeeId) {
			return entityManager.find(Employee.class, EmployeeId);
	}
	
}
