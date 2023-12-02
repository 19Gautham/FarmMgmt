package com.asu.sd.repository;

import org.springframework.stereotype.Repository;

import com.asu.sd.models.impl.Sprinkler;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface SprinklerRepository extends JpaRepository<Sprinkler, Long>{

	@Query(value="select s from Sprinkler s where s.farmId=?1")
	List<Sprinkler> findByFarmId(Long farmId);

	@Modifying
    @Query("update Sprinkler s set s.state = :state where s.farmId = :farmId and s.zone = :zone")
	@Transactional
    void updateSprinklerState(@Param("farmId") Long farmId, @Param("zone") int zone, @Param("state") boolean state);

}