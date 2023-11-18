package com.asu.sd.repository;

import org.springframework.stereotype.Repository;

import com.asu.sd.models.impl.MoistureSensor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface MoistureSensorRepository extends JpaRepository<MoistureSensor, String>{

	@Query(value="select s from MoistureSensor s where s.farmId=?1")
	List<MoistureSensor> findByFarmId(Long farmId);

	@Query(value="update MoistureSensor s set s.reading=?2 where s.sensorId=?1")
	@Modifying
	void updateMoistureLevel(Long sensorId, float moistureValue);
}
