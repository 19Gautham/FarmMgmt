package com.asu.sd.repository;

import org.springframework.stereotype.Repository;

import com.asu.sd.models.impl.Sprinkler;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface SprinklerRepository extends JpaRepository<Sprinkler, Long>{

	@Query(value="select s from Sprinkler s where s.farmId=?1")
	List<Sprinkler> findByFarmId(Long farmId);

	@Query(value="update Sprinkler s set s.state=?3 where s.farmId=?1 and s.zone=?2")
	@Modifying
	void updateSprinklerState(Long farmId, int zone, boolean state);

}
