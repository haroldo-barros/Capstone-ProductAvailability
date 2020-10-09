package com.location.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


/**
 * Build a location microservice which maintains information of a
 * location- locationId, locname, zipcode eg. 500, Irving, 75063
**/

@Entity
@Table(name="LocationService")
public class LocationBean{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long locationId;
	
	@NotNull
	private String locationName;
	
	@NotNull
	int zipcode;
	
	@OneToMany(mappedBy = "location")
	private List<BalanceServiceBean> balance;
	
	
	public LocationBean() {
	}
	
	public LocationBean(Long locationId, String locationName, int zipcode) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.zipcode = zipcode;
	}
	
	public Long getLocationId() {
		return locationId;
	}
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "LocationBean [locationId=" + locationId + ", locationName=" + locationName + ", zipcode=" + zipcode
				+ "]";
	}
	
	
}
