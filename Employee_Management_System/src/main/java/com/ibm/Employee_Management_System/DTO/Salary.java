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

public class Salary {

	@Id
	private int salary_id ;
	private int basic;
	private int HRA;
	private int PF;
	private int DA;

	public double getTotalSalary() {
		return basic + HRA + PF + DA;
	}
}
