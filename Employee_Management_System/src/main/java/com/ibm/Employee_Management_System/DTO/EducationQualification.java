package com.ibm.Employee_Management_System.DTO;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EducationQualification {

	@Id
	private int cousre_id;
	private String course1;
	private double course1Percentage;
	private String course2;
	private double course2Percentage;
	private String course3;
	private double course3Percentage;
	
	
	
	public EducationQualification() {
		super();
	}



	public EducationQualification(int cousre_id, String course1, double course1Percentage, String course2,
			double course2Percentage, String course3, double course3Percentage) {
		super();
		this.cousre_id = cousre_id;
		this.course1 = course1;
		this.course1Percentage = course1Percentage;
		this.course2 = course2;
		this.course2Percentage = course2Percentage;
		this.course3 = course3;
		this.course3Percentage = course3Percentage;
	}



	public int getCousre_id() {
		return cousre_id;
	}



	public void setCousre_id(int cousre_id) {
		this.cousre_id = cousre_id;
	}



	public String getCourse1() {
		return course1;
	}



	public void setCourse1(String course1) {
		this.course1 = course1;
	}



	public double getCourse1Percentage() {
		return course1Percentage;
	}



	public void setCourse1Percentage(double course1Percentage) {
		this.course1Percentage = course1Percentage;
	}



	public String getCourse2() {
		return course2;
	}



	public void setCourse2(String course2) {
		this.course2 = course2;
	}



	public double getCourse2Percentage() {
		return course2Percentage;
	}



	public void setCourse2Percentage(double course2Percentage) {
		this.course2Percentage = course2Percentage;
	}



	public String getCourse3() {
		return course3;
	}



	public void setCourse3(String course3) {
		this.course3 = course3;
	}



	public double getCourse3Percentage() {
		return course3Percentage;
	}



	public void setCourse3Percentage(double course3Percentage) {
		this.course3Percentage = course3Percentage;
	}



	@Override
	public int hashCode() {
		return Objects.hash(course1, course1Percentage, course2, course2Percentage, course3, course3Percentage,
				cousre_id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EducationQualification other = (EducationQualification) obj;
		return Objects.equals(course1, other.course1)
				&& Double.doubleToLongBits(course1Percentage) == Double.doubleToLongBits(other.course1Percentage)
				&& Objects.equals(course2, other.course2)
				&& Double.doubleToLongBits(course2Percentage) == Double.doubleToLongBits(other.course2Percentage)
				&& Objects.equals(course3, other.course3)
				&& Double.doubleToLongBits(course3Percentage) == Double.doubleToLongBits(other.course3Percentage)
				&& cousre_id == other.cousre_id;
	}



	@Override
	public String toString() {
		return "EducationQualification [cousre_id=" + cousre_id + ", course1=" + course1 + ", course1Percentage="
				+ course1Percentage + ", course2=" + course2 + ", course2Percentage=" + course2Percentage + ", course3="
				+ course3 + ", course3Percentage=" + course3Percentage + "]";
	}
	
	
	
	
	
}
