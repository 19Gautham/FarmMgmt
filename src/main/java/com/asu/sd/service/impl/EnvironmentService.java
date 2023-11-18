package com.asu.sd.service.impl;

import org.springframework.stereotype.Component;

@Component
public class EnvironmentService {

	public void trigger() {
		while(true) {
			System.out.println("Infitie loop started - EnvironmentService");
		}
	}

}
