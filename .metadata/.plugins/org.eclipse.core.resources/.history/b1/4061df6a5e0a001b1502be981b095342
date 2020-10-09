package com.product.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Build a product microservice which maintains information of productid,
 * productname, dept Id, dept name eg 11234, Long Sleeves,100, Shirts
 **/

@Entity
@Table(name="ProductService")
public class ProductBean{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long productId;
	
	@NotNull
	@Column(unique = true, name="product_name")
	String productName;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="dept_id")
	private Department dept;
	
	@OneToMany(mappedBy="product")
	private List<BalanceServiceBean> balance;
	
	
	public ProductBean() {
	}

	public ProductBean(Long productId, @NotNull String productName, @NotNull Department dept) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.dept = dept;
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

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public List<BalanceServiceBean> getBalance() {
		return balance;
	}

	public void setBalance(List<BalanceServiceBean> balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + ", dept=" + dept + ", balance="
				+ balance + "]";
	}
	
	
}
