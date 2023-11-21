package com.asu.sd.repository;

import org.springframework.stereotype.Repository;

import com.asu.sd.models.impl.FarmDetails;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface FarmDetailsRepository extends JpaRepository<FarmDetails, Long>{

	@Query("select f from FarmDetails f where f.farmId=?1")
	List<FarmDetails> findByFarmId(Long farmId);

	@Transactional
	@Modifying
	@Query("update FarmDetails f set f.moistureThreshold = :Threshold where f.farmId=:FarmId")
	void updateMoistureThreshold(@Param(value = "FarmId") Long FarmId, @Param(value = "Threshold") float Threshold);

}
