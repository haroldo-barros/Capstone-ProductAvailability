package com.location.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location.bean.LocationBean;

public interface LocationRepo extends JpaRepository<LocationBean, Long>{

}
