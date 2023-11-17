package com.asu.sd.components.impl;

import com.asu.sd.components.Sensors;

public class MoistureSensor implements Sensors{
	private int SensorID = 0;
	private static int SensorCount = 0;
	
	private int LocationX = 0;
	private int LocationY = 0;
	
//	static boolean live = true;
	
	private static int tempMoisture = 0;	
	
	public Integer[] getLocation() {
		Integer[] arr = {LocationX, LocationY};
		return arr;
	}
	public void setLocation(int locationX, int locationY) {
		LocationX = locationX;
		LocationY = locationY;
	}
	
	public int getReading() {
		// get readings
		// individual or average
		++tempMoisture;
		System.out.println("current moisture = "+tempMoisture);
		return tempMoisture;
	}
	
	public MoistureSensor(int LocX,int LocY) {
		this.setSensorID();
		this.setLocation(LocX, LocY);
	}
	
	public int getSensorID() {
		return SensorID;
	}
	public void setSensorID() {
		SensorID = ++SensorCount;
	}
	
	public boolean isLive() {
		boolean live = true;
//		if(live) {
//			live = false;
//		}
//		else {
//			live = true;
//		}
		
		// check reading
		if(this.getReading()>0) {
			live = true;
		}
		else {
			live = false;
		}
		
		return live;
	}
	
	
	//public int[] sendError() {
	public void sendError() {
		Integer[] location = this.getLocation();
		System.out.println("this sensor is not working"+location[0]+","+location[1]);
		//return this.getLocation();
	}
	

}
