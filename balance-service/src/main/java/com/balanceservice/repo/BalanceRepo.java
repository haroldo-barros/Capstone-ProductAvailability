package com.balanceservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balanceservice.bean.BalanceServiceBean;

public interface BalanceRepo extends JpaRepository<BalanceServiceBean, Long> {
	
	BalanceServiceBean getBalanceByProductId(Long itemId);

}
