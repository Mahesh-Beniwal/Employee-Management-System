package com.ibm.Employee_Management_System.Controller;

import java.io.IOException;

import com.ibm.Employee_Management_System.DAO.EmployeeDAO;
import com.ibm.Employee_Management_System.DTO.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class EmployeeLoginController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String employeId =	req.getParameter("EmployeId");
		String password  = req.getParameter("Password");
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		
			if(employeId.equals(password) && firstEmployeeLogin(employeId , password)) {
				
				if(employeeDAO.getEmployeeByID(employeId) == null)
				{
					resp.sendRedirect("FirstEmployee.jsp");
				}
				else {
					req.setAttribute("message", "This work only once the Password has changed");
					resp.sendRedirect("Login.jsp");
				}
			}
		
			Employee employee = employeeDAO.getEmployeeByID("String");
			
			if(employee != null) {
				
				HttpSession session = req.getSession();
				session.setAttribute("Employe", employee);
				session.setMaxInactiveInterval(300);
				resp.sendRedirect(req.getContextPath()+"EmployeeDashBoard.jsp");
			
			}
			else {
			
				req.setAttribute("message", "No Such Datma Exist");
				resp.sendRedirect("Login.jsp");
			
			}
			
	}
	
	private static boolean firstEmployeeLogin( String employeeId , String password) {
		return employeeId.equals("SpecialString");
	}
}
