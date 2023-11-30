package com.asu.sd.models.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="lightSensor")
public class LightSensor {

	@Id
	@SequenceGenerator(name = "sensorID", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sensorID")
	private Long sensorId;

	@Column(name = "farmId", nullable=false)
	private Long farmId;

	@Column(name = "reading", nullable=false)
	private int reading;

	public Long getSensorId() {
		return sensorId;
	}

	public void setSensorId(Long sensorId) {
		this.sensorId = sensorId;
	}

	public Long getFarmId() {
		return farmId;
	}

	public void setFarmId(Long farmId) {
		this.farmId = farmId;
	}

	public int getReading() {
		return reading;
	}

	public void setReading(int reading) {
		this.reading = reading;
	}

}
