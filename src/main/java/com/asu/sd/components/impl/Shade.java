package com.asu.sd.components.impl;

import com.asu.sd.components.Actuators;

public class Shade implements Actuators{
	public int state = 0;
	
	public int checkState() {
		return state;
	}

	public void turnON() {
		//turn on 
		// if state =0, state =1
	}
	
	public void turnOFF() {
		//turn off 
		// if state =1, state =0
	}
}
