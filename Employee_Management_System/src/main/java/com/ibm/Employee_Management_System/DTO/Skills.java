package com.ibm.Employee_Management_System.DTO;

import java.util.Objects;

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
public class Skills {

	@Id
	private int skillId;
	private String skill1;
	private String skill2;
	private String skill3;
	private String skill4;
	private String skill5;
	private String skill6;
	private String skill7;
	private String skill8;
	private String skill9;
	private String skill10;
	
		
	
	
}
