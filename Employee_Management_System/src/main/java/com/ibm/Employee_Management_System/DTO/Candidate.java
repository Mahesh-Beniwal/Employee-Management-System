package com.ibm.Employee_Management_System.DTO;

import java.util.Arrays;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
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
	
	
	
	
	
	public Candidate(int id, String name, int age, String gender, String address, String phone, String email,
			String status, String resultOfHiringProcedure, byte[] resume, EducationQualification education,
			Requirements requirement) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.status = status;
		this.resultOfHiringProcedure = resultOfHiringProcedure;
		this.resume = resume;
		this.education = education;
		this.requirement = requirement;
	}

	public Candidate() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResultOfHiringProcedure() {
		return resultOfHiringProcedure;
	}

	public void setResultOfHiringProcedure(String resultOfHiringProcedure) {
		this.resultOfHiringProcedure = resultOfHiringProcedure;
	}

	public byte[] getResume() {
		return resume;
	}

	public void setResume(byte[] resume) {
		this.resume = resume;
	}

	public EducationQualification getEducation() {
		return education;
	}

	public void setEducation(EducationQualification education) {
		this.education = education;
	}

	public Requirements getRequirement() {
		return requirement;
	}

	public void setRequirement(Requirements requirement) {
		this.requirement = requirement;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", phone=" + phone + ", email=" + email + ", status=" + status + ", resultOfHiringProcedure="
				+ resultOfHiringProcedure + ", resume=" + Arrays.toString(resume) + ", education=" + education
				+ ", requirement=" + requirement + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(resume);
		result = prime * result + Objects.hash(address, age, education, email, gender, id, name, phone, requirement,
				resultOfHiringProcedure, status);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(education, other.education)
				&& Objects.equals(email, other.email) && Objects.equals(gender, other.gender) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone)
				&& Objects.equals(requirement, other.requirement)
				&& Objects.equals(resultOfHiringProcedure, other.resultOfHiringProcedure)
				&& Arrays.equals(resume, other.resume) && Objects.equals(status, other.status);
	}

	
	
}
