package com.asu.sd.components.impl;

import com.asu.sd.components.Actuators;

public class Sprinklers implements Actuators{
	public int state = 0;
	private int SprinklerID = 0;
	private int LocationX = 0;
	private int LocationY = 0;
	public static int SprinklerCount=0;
	
	
	public int getSprinklerID() {
		return SprinklerID;
	}
	public void setSprinklerID() {
		
		SprinklerID = ++SprinklerCount;
	}
	
	public int[] getLocation() {
		int[] arr = {LocationX, LocationY};
		return arr;
	}
	public void setLocation(int locationX, int locationY) {
		LocationX = locationX;
		LocationY = locationY;
	}
	
	public Sprinklers(int LocX,int LocY) {
		this.setSprinklerID();
		this.setLocation(LocX, LocY);
	}
	
	public int checkState() {
		return state;
	}

	public void turnON() {
		//turn on 
		// if state =0, state =1
		System.out.println("turn on sprinkler "+this.getSprinklerID());
	}
	
	public void turnOFF() {
		//turn off 
		// if state =1, state =0
		System.out.println("turn off sprinkler "+this.getSprinklerID());
	}
	
	public void turnOnSprinklerByLocation(int locX, int locY) {
		if(this.LocationX == locX && this.LocationY == locY) {
			this.turnON();
		}
	}
	public void turnOffSprinklerByLocation(int locX, int locY) {
		if(this.LocationX == locX && this.LocationY == locY) {
			this.turnOFF();
		}
	}
}
