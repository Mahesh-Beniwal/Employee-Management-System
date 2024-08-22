package com.ibm.Employee_Management_System.DTO;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Description {

	@Id
	private int descriptionId;
	private String Heading;
	private String detail;
	
	public Description() {
	
	}
	
	public Description(int descriptionId, String heading, String detail) {
		super();
		this.descriptionId = descriptionId;
		Heading = heading;
		this.detail = detail;
	}
	
	
	public int getDescriptionId() {
		return descriptionId;
	}
	
	public void setDescriptionId(int descriptionId) {
		this.descriptionId = descriptionId;
	}
	
	public String getHeading() {
		return Heading;
	}
	
	public void setHeading(String heading) {
		Heading = heading;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	@Override
	public String toString() {
		return "Description [descriptionId=" + descriptionId + ", Heading=" + Heading + ", detail=" + detail + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Heading, descriptionId, detail);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Description other = (Description) obj;
		return Objects.equals(Heading, other.Heading) && descriptionId == other.descriptionId
				&& Objects.equals(detail, other.detail);
	
	
	}
	
}
