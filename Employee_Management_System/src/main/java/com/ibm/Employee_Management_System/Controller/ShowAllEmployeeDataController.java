package com.ibm.Employee_Management_System.Controller;

import java.io.IOException;
import java.util.List;

import com.ibm.Employee_Management_System.DTO.Employee;
import com.ibm.Employee_Management_System.Services.ManagersActionsOnEmploye;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AllEmployeeData")
public class ShowAllEmployeeDataController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ManagersActionsOnEmploye service = new ManagersActionsOnEmploye();
		List<Employee> employes = service.showAllEmployeData();
		req.setAttribute("employes", employes);
		resp.sendRedirect("/EmployeesData.jsp");
	}
}
