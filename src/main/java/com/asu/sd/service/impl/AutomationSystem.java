package com.asu.sd.service.impl;

import com.asu.sd.components.impl.Shade;
import com.asu.sd.components.impl.Sprinklers;

public class AutomationSystem {
	private int Heat_Threshold = 0;
	private int Moisture_Threshold = 0;
	
	
	
	public int getHeat_Threshold() {
		return Heat_Threshold;
	}
	public void setHeat_Threshold(int heat_Threshold) {
		Heat_Threshold = heat_Threshold;
	}
	public int getMoisture_Threshold() {
		return Moisture_Threshold;
	}
	public void setMoisture_Threshold(int moisture_Threshold) {
		Moisture_Threshold = moisture_Threshold;
	}
	
	public void updateData() {
		//update data to DB
	}
	public void GetDBData() {
		//get data from DB
	}
	
	public void ActivateSprinklers(Sprinklers sprinkler, int current_moisture) {
			sprinkler.turnON();
	}
	public void DeactivateSprinklers(Sprinklers sprinkler, int current_moisture) {
		sprinkler.turnOFF();
	}
	
	public void ActivateShade(Shade shade, int current_heat) {
		shade.turnON();
	}
	public void DeactivateShade(Shade shade, int current_heat) {
		shade.turnOFF();
	}
	
	
}
