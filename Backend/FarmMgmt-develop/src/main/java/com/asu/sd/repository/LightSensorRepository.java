package com.asu.sd.repository;

import org.springframework.stereotype.Repository;

import com.asu.sd.models.impl.LightSensor;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LightSensorRepository extends JpaRepository<LightSensor, String>{

}
