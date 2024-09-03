package com.ibm.Employee_Management_System.DTO;

import java.time.LocalDate;

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

public class Requirements {

	@Id
	private String hiringId;
	private LocalDate startingDate;
	private LocalDate endingDate;
	private String nameOfJob;
	
	private Skills skill;
	private int startingPackage;
	private int maximumPackage;
	
	private Description description;
	
	private Eligibility eligibility;

	
	
	
}
