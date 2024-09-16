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
public class EducationQualification {

	@Id
	private int cousre_id;
	private String course1;
	private double course1Percentage;
	private String course2;
	private double course2Percentage;
	private String course3;
	private double course3Percentage;





}
