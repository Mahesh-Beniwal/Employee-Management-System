package com.ibm.Employee_Management_System.DTO;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@Column(name = "Employee_Id")
	private String employeeId;
	
	private Salary salary;
	private double totalIncrement;
	private LocalDate DateOfJoining;
	private String jobRole;
	private Candidate candidate;
	private Branch branch;
	private Department department;
	private String stateOfemployee;
	private byte[] profilePicture;
	public Employee() {
		super();
	}

	public Employee(String employeeId, Salary salary, double totalIncrement, LocalDate dateOfJoining, String jobRole,
			Candidate candidate, Branch branch, Department department, String stateOfemployee) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
		this.totalIncrement = totalIncrement;
		DateOfJoining = dateOfJoining;
		this.jobRole = jobRole;
		this.candidate = candidate;
		this.branch = branch;
		this.department = department;
		this.stateOfemployee = stateOfemployee;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public double getTotalIncrement() {
		return totalIncrement;
	}

	public void setTotalIncrement(double totalIncrement) {
		this.totalIncrement = totalIncrement;
	}

	public LocalDate getDateOfJoining() {
		return DateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		DateOfJoining = dateOfJoining;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getStateOfemployee() {
		return stateOfemployee;
	}
	
	public void setStateOfemployee(String stateOfemployee) {
		this.stateOfemployee = stateOfemployee;
	}
	

	public byte[] getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(byte[] profilePicture) {
		this.profilePicture = profilePicture;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", salary=" + salary + ", totalIncrement=" + totalIncrement
				+ ", DateOfJoining=" + DateOfJoining + ", jobRole=" + jobRole + ", candidate=" + candidate + ", branch="
				+ branch + ", department=" + department + ", stateOfemployee=" + stateOfemployee + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(DateOfJoining, branch, candidate, department, employeeId, jobRole, salary, stateOfemployee,
				totalIncrement);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(DateOfJoining, other.DateOfJoining) && Objects.equals(branch, other.branch)
				&& Objects.equals(candidate, other.candidate) && Objects.equals(department, other.department)
				&& Objects.equals(employeeId, other.employeeId) && Objects.equals(jobRole, other.jobRole)
				&& Objects.equals(salary, other.salary) && Objects.equals(stateOfemployee, other.stateOfemployee)
				&& Double.doubleToLongBits(totalIncrement) == Double.doubleToLongBits(other.totalIncrement);
	}
	
	
	
		
}
