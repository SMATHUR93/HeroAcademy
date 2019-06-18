package com.shrek.heroAcademy.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy="user")
	@JsonIgnoreProperties("user")
	private List<SkillMapping> skills;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy="user")
	@JsonIgnoreProperties("user")
	private List<UserAddressMapping> addresses;
	
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
	
	public List<SkillMapping> getSkills() {
		return skills;
	}
	
	public void setSkills(List<SkillMapping> skills) {
		this.skills = skills;
	}
	
	public List<UserAddressMapping> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<UserAddressMapping> addresses) {
		this.addresses = addresses;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public Integer getStamina() {
		return stamina;
	}

	public void setStamina(Integer stamina) {
		this.stamina = stamina;
	}

	public Integer getWillpower() {
		return willpower;
	}

	public void setWillpower(Integer willpower) {
		this.willpower = willpower;
	}

	public Integer getFortitude() {
		return fortitude;
	}

	public void setFortitude(Integer fortitude) {
		this.fortitude = fortitude;
	}

	public Integer getDurabillity() {
		return durabillity;
	}

	public void setDurabillity(Integer durabillity) {
		this.durabillity = durabillity;
	}

	public Integer getCoordination() {
		return coordination;
	}

	public void setCoordination(Integer coordination) {
		this.coordination = coordination;
	}

	public User() {
		super();
	}

	public User(String userName, String password, String firstName, String middleName, String lastName, Date dob,
			String gender, String primaryEmail, String secondaryEmail, Integer height, Integer weight, Integer strength,
			Integer speed, Integer intelligence, Integer stamina, Integer willpower, Integer fortitude,
			Integer durabillity, Integer coordination) {
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
		this.height = height;
		this.weight = weight;
		this.strength = strength;
		this.speed = speed;
		this.intelligence = intelligence;
		this.stamina = stamina;
		this.willpower = willpower;
		this.fortitude = fortitude;
		this.durabillity = durabillity;
		this.coordination = coordination;
	}

	public User(String userName, String password, String firstName, String middleName, String lastName, Date dob,
			String gender, String primaryEmail, String secondaryEmail, Integer height, Integer weight, Integer strength,
			Integer speed, Integer intelligence, Integer stamina, Integer willpower, Integer fortitude,
			Integer durabillity, Integer coordination, Equipment equipment, Race race, Symbol symbol, Element element,
			List<SkillMapping> skills, List<UserAddressMapping> addresses) {
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
		this.height = height;
		this.weight = weight;
		this.strength = strength;
		this.speed = speed;
		this.intelligence = intelligence;
		this.stamina = stamina;
		this.willpower = willpower;
		this.fortitude = fortitude;
		this.durabillity = durabillity;
		this.coordination = coordination;
		this.equipment = equipment;
		this.race = race;
		this.symbol = symbol;
		this.element = element;
		this.skills = skills;
		this.addresses = addresses;
	}

}