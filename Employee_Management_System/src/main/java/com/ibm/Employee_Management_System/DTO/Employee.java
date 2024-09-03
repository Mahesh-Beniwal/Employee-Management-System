package com.ibm.Employee_Management_System.DTO;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
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
	
	private List<Announcement> announcements;
	
	
	private List<Request> requests;
	
	
	
		
}
