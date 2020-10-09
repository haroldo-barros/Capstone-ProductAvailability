package com.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.bean.Department;
import com.product.bean.ProductBean;

public interface ProductRepo extends JpaRepository<ProductBean, Long>{

//	@Query(value = "SELECT * FROM product_service WHERE dept_id = 100", nativeQuery = true)
	ProductBean findProductByDeptDeptId(Long deptId);
}
