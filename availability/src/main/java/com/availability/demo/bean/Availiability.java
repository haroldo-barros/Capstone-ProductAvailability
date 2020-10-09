package com.availability.demo.bean;

public class Availiability {
	private Long productId;
	private String productName;
	private Long deptId;
	private String deptName;
	
	private Long locationId;
	private String locationName;
	private int zipcode;
	
	private BalanceBean balance;
	
	public Availiability() {}

	public Availiability(Long productId, String productName, Long deptId, String deptName, Long locationId,
			String locationName, int zipcode, BalanceBean balance) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.deptId = deptId;
		this.deptName = deptName;
		this.locationId = locationId;
		this.locationName = locationName;
		this.zipcode = zipcode;
		this.balance = balance;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
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

	public BalanceBean getBalance() {
		return balance;
	}

	public void setBalance(BalanceBean balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Availiability [productId=" + productId + ", productName=" + productName + ", deptId=" + deptId
				+ ", deptName=" + deptName + ", locationId=" + locationId + ", locationName=" + locationName
				+ ", zipcode=" + zipcode + ", balance=" + balance + "]";
	}
	
	
}
