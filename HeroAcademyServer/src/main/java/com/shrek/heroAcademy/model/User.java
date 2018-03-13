package com.shrek.heroAcademy.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "USER")
public class User extends BaseEntity implements Serializable{

	@Column(name = "USER_NAME", nullable = true)
	private String userName;
	
	@Column(name = "PASSWORD", nullable = true)
	private String password;
	
	@Column(name = "FIRST_NAME", nullable = true)
	private String firstName;
	
	@Column(name = "MIDDLE_NAME", nullable = true)
	private String middleName;
	
	@Column(name = "LAST_NAME", nullable = true)
	private String lastName;
	
	@Column(name = "DOB", nullable = true)
	private Date dob;
	
	@Column(name = "GENDER", nullable = true)
	private String gender;
	
	@Column(name = "PRIMARY_EMAIL", nullable = true)
	private String primaryEmail;
	
	@Column(name = "SECONDARY_EMAIL", nullable = true)
	private String secondaryEmail;
	
	@Column(name = "HEIGHT", nullable = true)
	private Integer height;
	
	@Column(name = "WEIGHT", nullable = true)
	private Integer weight;
	
	@Column(name = "STRENGTH", nullable = true)
	private Integer strength;
	
	@Column(name = "SPEED", nullable = true)
	private Integer speed;
	
	@Column(name = "INTELLIGENCE", nullable = true)
	private Integer intelligence;
	
	@Column(name = "STAMINA", nullable = true)
	private Integer stamina;
	
	@Column(name = "WILLPOWER", nullable = true)
	private Integer willpower;
	
	@Column(name = "FORTITIUDE", nullable = true)
	private Integer fortitude;
	
	@Column(name = "DURABILLITY", nullable = true)
	private Integer durabillity;
	
	@Column(name = "COORDINATION", nullable = true)
	private Integer coordination;
	
	@OneToOne 
	@JoinTable(name="EQUIPMENT_MAPPING")
	private Equipment equipment;
	
	@OneToOne
	@JoinTable(name="RACE_MAPPING")
	private Race race;
	
	@OneToOne
	@JoinTable(name="SYMBOL_MAPPING")
	private Symbol symbol;
	
	@OneToOne
	@JoinTable(name="ELEMENT_MAPPING")
	private Element element;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public Symbol getSymbol() {
		return symbol;
	}

	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}

	public Element getElement() {
		return element;
	}

	public void setElement(Element element) {
		this.element = element;
	}

	public User() {
		super();
	}

	public User(String userName, String password, String firstName, String middleName, String lastName, Date dob,
			String gender, String primaryEmail, String secondaryEmail, Equipment equipment, Race race, Symbol symbol,
			Element element) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.primaryEmail = primaryEmail;
		this.secondaryEmail = secondaryEmail;
		this.equipment = equipment;
		this.race = race;
		this.symbol = symbol;
		this.element = element;
	}

}
