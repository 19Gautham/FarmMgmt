package com.asu.sd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asu.sd.models.impl.FarmDetails;
import com.asu.sd.repository.FarmDetailsRepository;


@Component
public class FarmDetailsService {


	@Autowired
	FarmDetailsRepository farmDetailsRepository;


	public List<FarmDetails> getFarm(Long farmId) {
		return farmDetailsRepository.findByFarmId(farmId);
	}

	public void updateMoistureThreshold(Long farmId, float Threshold) {
		farmDetailsRepository.updateMoistureThreshold(farmId,Threshold);
	}
}