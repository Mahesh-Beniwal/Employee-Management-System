package com.ibm.Employee_Management_System.DTO;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Branch {
	@Id
	private int BranchId;
	private String location;
	private String type;
	
	
	public Branch() {
		super();
	}


	public Branch(int branchId, String location, String type) {
		super();
		BranchId = branchId;
		this.location = location;
		this.type = type;
	}


	public int getBranchId() {
		return BranchId;
	}


	public void setBranchId(int branchId) {
		BranchId = branchId;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public int hashCode() {
		return Objects.hash(BranchId, location, type);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Branch other = (Branch) obj;
		return BranchId == other.BranchId && Objects.equals(location, other.location)
				&& Objects.equals(type, other.type);
	}


	@Override
	public String toString() {
		return "Branch [BranchId=" + BranchId + ", location=" + location + ", type=" + type + "]";
	}
	
	
	
	
}
