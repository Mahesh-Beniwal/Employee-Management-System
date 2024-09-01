package com.ibm.Employee_Management_System.DTO;

import java.util.Objects;

import jakarta.persistence.Entity;

@Entity
public class BonouToEmployee {

	private String employeeId;
	private double amountOfBonous;
	private String message;
	
	
	
	public BonouToEmployee() {
		super();
	}



	public BonouToEmployee(String employeeId, double amountOfBonous, String message) {
		super();
		this.employeeId = employeeId;
		this.amountOfBonous = amountOfBonous;
		this.message = message;
	}



	public String getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}



	public double getAmountOfBonous() {
		return amountOfBonous;
	}



	public void setAmountOfBonous(double amountOfBonous) {
		this.amountOfBonous = amountOfBonous;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	@Override
	public int hashCode() {
		return Objects.hash(amountOfBonous, employeeId, message);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BonouToEmployee other = (BonouToEmployee) obj;
		return Double.doubleToLongBits(amountOfBonous) == Double.doubleToLongBits(other.amountOfBonous)
				&& Objects.equals(employeeId, other.employeeId) && Objects.equals(message, other.message);
	}



	@Override
	public String toString() {
		return "BonouToEmployee [employeeId=" + employeeId + ", amountOfBonous=" + amountOfBonous + ", message="
				+ message + "]";
	}
	
	
	
	
}
