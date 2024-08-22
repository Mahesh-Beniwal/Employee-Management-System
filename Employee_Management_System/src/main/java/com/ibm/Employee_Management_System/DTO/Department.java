package com.ibm.Employee_Management_System.DTO;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {

	@Id
	private int departmentId;
	private String DepartmentName;
	
	
	public Department() {
		super();
	}


	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		DepartmentName = departmentName;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public String getDepartmentName() {
		return DepartmentName;
	}


	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}


	@Override
	public int hashCode() {
		return Objects.hash(DepartmentName, departmentId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(DepartmentName, other.DepartmentName) && departmentId == other.departmentId;
	}


	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", DepartmentName=" + DepartmentName + "]";
	}
	
	
	
	
}
