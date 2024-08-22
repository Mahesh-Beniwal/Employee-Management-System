package com.ibm.Employee_Management_System.DTO;

import java.util.Objects;

import jakarta.persistence.Id;

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
	
	public Skills(int skillId, String skill1, String skill2, String skill3, String skill4, String skill5, String skill6,
			String skill7, String skill8, String skill9, String skill10) {
		super();
		this.skillId = skillId;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.skill4 = skill4;
		this.skill5 = skill5;
		this.skill6 = skill6;
		this.skill7 = skill7;
		this.skill8 = skill8;
		this.skill9 = skill9;
		this.skill10 = skill10;
	}
	
	public Skills() {
		super();
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getSkill1() {
		return skill1;
	}

	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}

	public String getSkill2() {
		return skill2;
	}

	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}

	public String getSkill3() {
		return skill3;
	}

	public void setSkill3(String skill3) {
		this.skill3 = skill3;
	}

	public String getSkill4() {
		return skill4;
	}

	public void setSkill4(String skill4) {
		this.skill4 = skill4;
	}

	public String getSkill5() {
		return skill5;
	}

	public void setSkill5(String skill5) {
		this.skill5 = skill5;
	}

	public String getSkill6() {
		return skill6;
	}

	public void setSkill6(String skill6) {
		this.skill6 = skill6;
	}

	public String getSkill7() {
		return skill7;
	}

	public void setSkill7(String skill7) {
		this.skill7 = skill7;
	}

	public String getSkill8() {
		return skill8;
	}

	public void setSkill8(String skill8) {
		this.skill8 = skill8;
	}

	public String getSkill9() {
		return skill9;
	}

	public void setSkill9(String skill9) {
		this.skill9 = skill9;
	}

	public String getSkill10() {
		return skill10;
	}

	public void setSkill10(String skill10) {
		this.skill10 = skill10;
	}

	@Override
	public int hashCode() {
		return Objects.hash(skill1, skill10, skill2, skill3, skill4, skill5, skill6, skill7, skill8, skill9, skillId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Skills other = (Skills) obj;
		return Objects.equals(skill1, other.skill1) && Objects.equals(skill10, other.skill10)
				&& Objects.equals(skill2, other.skill2) && Objects.equals(skill3, other.skill3)
				&& Objects.equals(skill4, other.skill4) && Objects.equals(skill5, other.skill5)
				&& Objects.equals(skill6, other.skill6) && Objects.equals(skill7, other.skill7)
				&& Objects.equals(skill8, other.skill8) && Objects.equals(skill9, other.skill9)
				&& skillId == other.skillId;
	}

	@Override
	public String toString() {
		return "Skills [skillId=" + skillId + ", skill1=" + skill1 + ", skill2=" + skill2 + ", skill3=" + skill3
				+ ", skill4=" + skill4 + ", skill5=" + skill5 + ", skill6=" + skill6 + ", skill7=" + skill7
				+ ", skill8=" + skill8 + ", skill9=" + skill9 + ", skill10=" + skill10 + "]";
	}
	
	
	
}
