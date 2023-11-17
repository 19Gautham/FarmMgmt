package com.asu.sd.components.impl;

import com.asu.sd.components.Sensors;

public class HeatSensor implements Sensors{
	
	private int SensorID = 0;
	private static int SensorCount = 0;

	@Override
	public int getReading() {
		// get readings
		return 1;
	}

	@Override
	public int getSensorID() {
		return SensorID;
	}

	@Override
	public void setSensorID() {
		SensorID = ++SensorCount;
	}

	@Override
	public boolean isLive() {
		boolean live = false;
		
		// check reading
		if(this.getReading()>0) {
			live = true;
		}
		else {
			live = false;
		}
		
		return live;
	}
	
	

}
