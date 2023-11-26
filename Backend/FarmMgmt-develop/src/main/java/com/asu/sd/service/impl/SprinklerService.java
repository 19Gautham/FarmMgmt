package com.asu.sd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asu.sd.models.impl.Sprinkler;
import com.asu.sd.repository.SprinklerRepository;

@Service
public class SprinklerService {

	@Autowired
	SprinklerRepository sprinklerRepository;


	public List<Sprinkler> getSprinklers(Long farmId) {
		return sprinklerRepository.findByFarmId(farmId);
	}

}