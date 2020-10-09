package com.availability.demo.bean;

public class BalanceBean {

	Long productId;
	Long locationId;
	Long balance;
	
	
	public BalanceBean() {
	}
	
	public BalanceBean(Long productId, Long locationId, Long balance) {
		super();
		this.productId = productId;
		this.locationId = locationId;
		this.balance = balance;
	}
	
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getLocationId() {
		return locationId;
	}
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BalanceServiceBean [productId=" + productId + ", locationId=" + locationId + ", balance=" + balance
				+ "]";
	}
}
