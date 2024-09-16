package com.ibm.Employee_Management_System.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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

public class Candidate {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id ;
	private String name;
	private int age ;
	private String gender;
	private String address;
	private String phone;
	private String email;
	private String status;
	private String resultOfHiringProcedure;
	@Lob
	private byte [] resume;

	private EducationQualification education;

	private Requirements requirement;




}
