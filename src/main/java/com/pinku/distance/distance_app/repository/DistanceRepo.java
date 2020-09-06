package com.pinku.distance.distance_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pinku.distance.distance_app.bean.RequestBean;

public interface DistanceRepo extends JpaRepository<RequestBean, Integer> {

}
