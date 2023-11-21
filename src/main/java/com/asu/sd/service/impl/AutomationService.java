package com.asu.sd.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asu.sd.models.impl.FarmDetails;
import com.asu.sd.models.impl.MoistureSensor;
import com.asu.sd.models.impl.Sprinkler;
import com.asu.sd.repository.FarmDetailsRepository;
import com.asu.sd.repository.MoistureSensorRepository;
import com.asu.sd.repository.SprinklerRepository;

@Service
public class AutomationService {

	@Autowired
	FarmDetailsRepository farmDetailsRepository;

	@Autowired
	MoistureSensorRepository moistureSensorRepository;

	@Autowired
	SprinklerRepository sprinklerRepository;

	@Scheduled(fixedDelay = 5000)
	public void trigger() {
		System.out.println("Running monioring tasks");
		List<FarmDetails> farmDetailsList = farmDetailsRepository.findAll();
		List<MoistureSensor> moistureSensorList = moistureSensorRepository.findAll();
		List<Sprinkler> sprinklerList = sprinklerRepository.findAll();
		
		// Monitoring ongoing irrigation
		monitorOngoingIrrigation(farmDetailsList, moistureSensorList, sprinklerList);
		
		// Monitoring soil moisture sensors
		moitorSoilMoisture(farmDetailsList, moistureSensorList, sprinklerList);
	}

	@Transactional
	private void moitorSoilMoisture(List<FarmDetails> farmDetailsList, List<MoistureSensor> moistureSensorList,
			List<Sprinkler> sprinklerList) {
		for (FarmDetails farm : farmDetailsList) {
			for (MoistureSensor sensor : moistureSensorList.stream().filter(s -> s.getFarmId() == farm.getFarmId() && s.getReading() < farm.getMoistureThreshold()).collect(Collectors.toList())) {
				System.out.println("Turning state of sprinkler of farm " + sensor.getFarmId() + " at zone " + sensor.getZone() + " ON.");
				sprinklerRepository.updateSprinklerState(sensor.getFarmId(), sensor.getZone(), true);
//				Sprinkler sprinkler = sprinklerList.stream().filter(s -> s.getFarmId() == farm.getFarmId() && s.getZone() == sensor.getZone()).findFirst().orElse(null);
//				if (sprinkler != null)
			}
		}
	}

	private void monitorOngoingIrrigation(List<FarmDetails> farmDetailsList, List<MoistureSensor> moistureSensorList,
			List<Sprinkler> sprinklerList) {
		for (Sprinkler sprinkler : sprinklerList.stream().filter(s -> s.isState()).collect(Collectors.toList())) {
			FarmDetails farm = farmDetailsList.stream().filter(f -> f.getFarmId() == sprinkler.getFarmId()).findFirst().orElse(null);
			MoistureSensor sensor = moistureSensorList.stream().filter(s -> s.getFarmId() == farm.getFarmId() && s.getZone() == sprinkler.getZone()).findFirst().orElse(null);
			System.out.println("Moisture level of farm " + sensor.getFarmId() + " at zone " + sensor.getZone() + ": " + sensor.getReading());
			if (farm != null && ((sensor.getReading() < 3 * farm.getMoistureThreshold()) && (sensor.getReading() < 0.6))) {
				// Increment reading by 0.1
				moistureSensorRepository.updateMoistureLevel(sensor.getSensorId(), sensor.getReading() + (float) 0.1);
			} else {
				// Set state of the sprinkler to off
				System.out.println("Turning state of sprinkler of farm " + sensor.getFarmId() + " at zone " + sensor.getZone() + " OFF.");
				sprinklerRepository.updateSprinklerState(sensor.getFarmId(), sensor.getZone(), false);
			}
		}
	}

}
