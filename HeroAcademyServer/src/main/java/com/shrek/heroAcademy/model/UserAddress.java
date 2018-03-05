package com.shrek.heroAcademy.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="USER_ADDRESS")
public class UserAddress extends BaseEntity implements Serializable{

	@OneToOne
	@JoinColumn(name = "USER_ID", referencedColumnName = "ID")
	private User userId;
	
	@OneToOne
	@JoinColumn(name = "LOCATION_ID", referencedColumnName = "ID")
	private Location locationId;
	
	@Column(name="IS_CURRENT_ADDRESS", nullable=true)
	private String isCurrentAddress;
	
	@Column(name="START_DATE", nullable=true)
	private Date startDate;
	
	@Column(name="END_DATE", nullable=true)
	private Date endDate;

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Location getLocationId() {
		return locationId;
	}

	public void setLocationId(Location locationId) {
		this.locationId = locationId;
	}

	public String getIsCurrentAddress() {
		return isCurrentAddress;
	}

	public void setIsCurrentAddress(String isCurrentAddress) {
		this.isCurrentAddress = isCurrentAddress;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public UserAddress() {
		super();
	}

	public UserAddress(User userId, Location locationId, String isCurrentAddress, Date startDate, Date endDate) {
		super();
		this.userId = userId;
		this.locationId = locationId;
		this.isCurrentAddress = isCurrentAddress;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
}
