package com.product.bean;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Build a balance service, which has the available
 * items in a given location. productid, location Id,
 * balance e.g 11234, 500,10 implying there are 10 long sleeve shirts in zip 75063
**/

@Entity
@Table(name="BalanceService")
public class BalanceServiceBean{

	@EmbeddedId
	private BalanceId balanceId;
	
	@ManyToOne
	@MapsId("productId")
	@JoinColumn(name="product_id", referencedColumnName="productId")
	private ProductBean product;
	
	@ManyToOne
	@MapsId("locationId")
	@JoinColumn(name="location_id", referencedColumnName="locationId")
	private LocationBean location;
	
	@NotNull
	@Min(value=0)
	private Long balanceAmount;
	
	
	public BalanceServiceBean() {
	}


	public BalanceServiceBean(BalanceId balanceId, ProductBean product, LocationBean location,
			@NotNull @Min(0) Long balanceAmount) {
		super();
		this.balanceId = balanceId;
		this.product = product;
		this.location = location;
		this.balanceAmount = balanceAmount;
	}


	public BalanceId getBalanceId() {
		return balanceId;
	}


	public void setBalanceId(BalanceId balanceId) {
		this.balanceId = balanceId;
	}


	public ProductBean getProduct() {
		return product;
	}


	public void setProduct(ProductBean product) {
		this.product = product;
	}


	public LocationBean getLocation() {
		return location;
	}


	public void setLocation(LocationBean location) {
		this.location = location;
	}


	public Long getBalanceAmount() {
		return balanceAmount;
	}


	public void setBalanceAmount(Long balanceAmount) {
		this.balanceAmount = balanceAmount;
	}


	@Override
	public String toString() {
		return "BalanceServiceBean [balanceId=" + balanceId + ", product=" + product + ", location=" + location
				+ ", balanceAmount=" + balanceAmount + "]";
	}
	
	
	
}
