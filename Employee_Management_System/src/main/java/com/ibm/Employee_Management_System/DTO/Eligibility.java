package com.ibm.Employee_Management_System.DTO;

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

public class Eligibility {

	@Id
	private int eligibilityId;
	private String degree1;
	private String degree2;
	private String degree3;
	private String degree4;
	private String degree5;
	private String degree6;
	private String degree7;
	private String degree8;
	private String degree9;
	private String degere10;


	
}
