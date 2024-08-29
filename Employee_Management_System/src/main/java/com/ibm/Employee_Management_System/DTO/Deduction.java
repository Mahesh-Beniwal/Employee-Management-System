package com.ibm.Employee_Management_System.DTO;

import java.util.Objects;

import jakarta.persistence.Entity;

@Entity
public class Deduction {

	private String employeeId;
	private double deduction;
	private String message;
	
	
	public Deduction() {
		super();
	}


	public Deduction(String employeeId, double deduction, String message) {
		super();
		this.employeeId = employeeId;
		this.deduction = deduction;
		this.message = message;
	}


	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public double getDeduction() {
		return deduction;
	}


	public void setDeduction(double deduction) {
		this.deduction = deduction;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public int hashCode() {
		return Objects.hash(deduction, employeeId, message);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deduction other = (Deduction) obj;
		return Double.doubleToLongBits(deduction) == Double.doubleToLongBits(other.deduction)
				&& Objects.equals(employeeId, other.employeeId) && Objects.equals(message, other.message);
	}


	@Override
	public String toString() {
		return "Deduction [employeeId=" + employeeId + ", deduction=" + deduction + ", message=" + message + "]";
	}
	
	
	
	
	
}
