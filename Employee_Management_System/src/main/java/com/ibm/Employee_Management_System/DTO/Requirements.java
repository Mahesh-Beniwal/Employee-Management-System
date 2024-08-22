package com.ibm.Employee_Management_System.DTO;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
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

	
	
	
	public Requirements() {
		super();
	}
	
	

	public Requirements(String hiringId, LocalDate startingDate, LocalDate endingDate, String nameOfJob, Skills skill,
			int startingPackage, int maximumPackage, Description description, Eligibility eligibility) {
		super();
		this.hiringId = hiringId;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
		this.nameOfJob = nameOfJob;
		this.skill = skill;
		this.startingPackage = startingPackage;
		this.maximumPackage = maximumPackage;
		this.description = description;
		this.eligibility = eligibility;
	}



	public String getHiringId() {
		return hiringId;
	}

	public void setHiringId(String hiringId) {
		this.hiringId = hiringId;
	}

	public LocalDate getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}

	public LocalDate getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(LocalDate endingDate) {
		this.endingDate = endingDate;
	}

	public String getNameOfJob() {
		return nameOfJob;
	}

	public void setNameOfJob(String nameOfJob) {
		this.nameOfJob = nameOfJob;
	}

	public Skills getSkill() {
		return skill;
	}

	public void setSkill(Skills skill) {
		this.skill = skill;
	}

	public int getStartingPackage() {
		return startingPackage;
	}

	public void setStartingPackage(int startingPackage) {
		this.startingPackage = startingPackage;
	}

	public int getMaximumPackage() {
		return maximumPackage;
	}

	public void setMaximumPackage(int maximumPackage) {
		this.maximumPackage = maximumPackage;
	}

	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public Eligibility getEligibility() {
		return eligibility;
	}

	public void setEligibility(Eligibility eligibility) {
		this.eligibility = eligibility;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, eligibility, endingDate, hiringId, maximumPackage, nameOfJob, skill,
				startingDate, startingPackage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Requirements other = (Requirements) obj;
		return Objects.equals(description, other.description) && Objects.equals(eligibility, other.eligibility)
				&& Objects.equals(endingDate, other.endingDate) && Objects.equals(hiringId, other.hiringId)
				&& maximumPackage == other.maximumPackage && Objects.equals(nameOfJob, other.nameOfJob)
				&& Objects.equals(skill, other.skill) && Objects.equals(startingDate, other.startingDate)
				&& startingPackage == other.startingPackage;
	}

	@Override
	public String toString() {
		return "Requirements [hiringId=" + hiringId + ", startingDate=" + startingDate + ", endingDate=" + endingDate
				+ ", nameOfJob=" + nameOfJob + ", skill=" + skill + ", startingPackage=" + startingPackage
				+ ", maximumPackage=" + maximumPackage + ", description=" + description + ", eligibility=" + eligibility
				+ "]";
	}
	
	
	
}
