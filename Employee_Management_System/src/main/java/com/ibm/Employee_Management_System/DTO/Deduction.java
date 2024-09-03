package com.ibm.Employee_Management_System.DTO;

import jakarta.persistence.Entity;
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

public class Deduction {

	private String employeeId;
	private double deduction;
	private String message;
	
	
	
	
	
}
