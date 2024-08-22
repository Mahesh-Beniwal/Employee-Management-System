package com.ibm.Employee_Management_System.DTO;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Salary {

	@Id
	private int salary_id ;
	private int basic;
	private int HRA;
	private int PF;
	private int DA;
	
	
	public Salary() {
		super();
	}


	public Salary(int salary_id, int basic, int hRA, int pF, int dA) {
		super();
		this.salary_id = salary_id;
		this.basic = basic;
		HRA = hRA;
		PF = pF;
		DA = dA;
	}


	public int getSalary_id() {
		return salary_id;
	}


	public void setSalary_id(int salary_id) {
		this.salary_id = salary_id;
	}


	public int getBasic() {
		return basic;
	}


	public void setBasic(int basic) {
		this.basic = basic;
	}


	public int getHRA() {
		return HRA;
	}


	public void setHRA(int hRA) {
		HRA = hRA;
	}


	public int getPF() {
		return PF;
	}


	public void setPF(int pF) {
		PF = pF;
	}


	public int getDA() {
		return DA;
	}


	public void setDA(int dA) {
		DA = dA;
	}


	@Override
	public int hashCode() {
		return Objects.hash(DA, HRA, PF, basic, salary_id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salary other = (Salary) obj;
		return DA == other.DA && HRA == other.HRA && PF == other.PF && basic == other.basic
				&& salary_id == other.salary_id;
	}


	@Override
	public String toString() {
		return "Salary [salary_id=" + salary_id + ", basic=" + basic + ", HRA=" + HRA + ", PF=" + PF + ", DA=" + DA
				+ "]";
	}
	
	
	
	
}
