package com.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.bean.Department;

public interface DepartmentRepo extends JpaRepository <Department, Long>{

//	@Query(value = "SELECT * FROM Department WHERE department_name = ?1", nativeQuery = true)
	Department findByDeptName(String deptName);
}
