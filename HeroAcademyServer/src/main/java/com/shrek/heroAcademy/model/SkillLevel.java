package com.shrek.heroAcademy.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="SKILL_LEVEL")
public class SkillLevel extends BaseEntity implements Serializable{

	@OneToOne
	@JoinColumn(name = "USER_ID", referencedColumnName = "ID")
	private User userId;
	
	@OneToOne
	@JoinColumn(name = "SKILL_ID", referencedColumnName = "ID")
	private Skill skillId;
	
	@Column(name="SKILL_LEVEL", nullable=true)
	private Integer skillLevel;

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Skill getSkillId() {
		return skillId;
	}

	public void setSkillId(Skill skillId) {
		this.skillId = skillId;
	}

	public Integer getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(Integer skillLevel) {
		this.skillLevel = skillLevel;
	}

	public SkillLevel() {
		super();
	}

	public SkillLevel(User userId, Skill skillId, Integer skillLevel) {
		super();
		this.userId = userId;
		this.skillId = skillId;
		this.skillLevel = skillLevel;
	}
	
}
