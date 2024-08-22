package com.ibm.Employee_Management_System.DTO;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
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
	public Eligibility() {
		super();
	}
	
	public Eligibility(int eligibilityId, String degree1, String degree2, String degree3, String degree4,
			String degree5, String degree6, String degree7, String degree8, String degree9, String degere10) {
		super();
		this.eligibilityId = eligibilityId;
		this.degree1 = degree1;
		this.degree2 = degree2;
		this.degree3 = degree3;
		this.degree4 = degree4;
		this.degree5 = degree5;
		this.degree6 = degree6;
		this.degree7 = degree7;
		this.degree8 = degree8;
		this.degree9 = degree9;
		this.degere10 = degere10;
	}

	public int getEligibilityId() {
		return eligibilityId;
	}

	public void setEligibilityId(int eligibilityId) {
		this.eligibilityId = eligibilityId;
	}

	public String getDegree1() {
		return degree1;
	}

	public void setDegree1(String degree1) {
		this.degree1 = degree1;
	}

	public String getDegree2() {
		return degree2;
	}

	public void setDegree2(String degree2) {
		this.degree2 = degree2;
	}

	public String getDegree3() {
		return degree3;
	}

	public void setDegree3(String degree3) {
		this.degree3 = degree3;
	}

	public String getDegree4() {
		return degree4;
	}

	public void setDegree4(String degree4) {
		this.degree4 = degree4;
	}

	public String getDegree5() {
		return degree5;
	}

	public void setDegree5(String degree5) {
		this.degree5 = degree5;
	}

	public String getDegree6() {
		return degree6;
	}

	public void setDegree6(String degree6) {
		this.degree6 = degree6;
	}

	public String getDegree7() {
		return degree7;
	}

	public void setDegree7(String degree7) {
		this.degree7 = degree7;
	}

	public String getDegree8() {
		return degree8;
	}

	public void setDegree8(String degree8) {
		this.degree8 = degree8;
	}

	public String getDegree9() {
		return degree9;
	}

	public void setDegree9(String degree9) {
		this.degree9 = degree9;
	}

	public String getDegere10() {
		return degere10;
	}

	public void setDegere10(String degere10) {
		this.degere10 = degere10;
	}

	@Override
	public int hashCode() {
		return Objects.hash(degere10, degree1, degree2, degree3, degree4, degree5, degree6, degree7, degree8, degree9,
				eligibilityId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eligibility other = (Eligibility) obj;
		return Objects.equals(degere10, other.degere10) && Objects.equals(degree1, other.degree1)
				&& Objects.equals(degree2, other.degree2) && Objects.equals(degree3, other.degree3)
				&& Objects.equals(degree4, other.degree4) && Objects.equals(degree5, other.degree5)
				&& Objects.equals(degree6, other.degree6) && Objects.equals(degree7, other.degree7)
				&& Objects.equals(degree8, other.degree8) && Objects.equals(degree9, other.degree9)
				&& eligibilityId == other.eligibilityId;
	}

	@Override
	public String toString() {
		return "Eligibility [eligibilityId=" + eligibilityId + ", degree1=" + degree1 + ", degree2=" + degree2
				+ ", degree3=" + degree3 + ", degree4=" + degree4 + ", degree5=" + degree5 + ", degree6=" + degree6
				+ ", degree7=" + degree7 + ", degree8=" + degree8 + ", degree9=" + degree9 + ", degere10=" + degere10
				+ "]";
	}
	


	
}
