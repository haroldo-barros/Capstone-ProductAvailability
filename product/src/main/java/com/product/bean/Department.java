package com.product.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long deptId;
	
	@NotNull
	@Column(unique = true, name = "department_name")
	private String deptName;
	
	public Department () {}

	public Department(Long deptId, @NotNull String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
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

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	
}
