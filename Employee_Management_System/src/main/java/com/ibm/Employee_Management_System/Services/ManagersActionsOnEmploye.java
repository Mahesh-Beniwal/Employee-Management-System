package com.ibm.Employee_Management_System.Services;

import java.util.List;

import com.ibm.Employee_Management_System.DAO.EmployeeDAO;
import com.ibm.Employee_Management_System.DTO.Employee;

public class AdminActionsOnEmploye {
	private static EmployeeDAO dao= new EmployeeDAO();
	
	/*
	 * First Service which provide the Service to Senior-Manager to see Employees Data
	 */
	
	public List<Employee> showAllEmployeData(){
		List<Employee> employes = dao.fetchAllEmployeeData();
		return employes;
	}
	
}
