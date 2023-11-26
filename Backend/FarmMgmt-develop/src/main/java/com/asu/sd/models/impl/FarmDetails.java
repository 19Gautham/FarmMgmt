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
@Table(name="farmDetails")
public class FarmDetails {

	public FarmDetails() {
		super();
	}

	@Id
	@SequenceGenerator(name = "farmID", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "farmID")
	private Long farmId;
	
	@Column(name="userId", nullable = false)
	private String userId;

	@Column(name="moistureThreshold")
	private float moistureThreshold;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getFarmId() {
		return farmId;
	}

	public void setFarmId(Long farmId) {
		this.farmId = farmId;
	}

	public float getMoistureThreshold() {
		return moistureThreshold;
	}

	public void setMoistureThreshold(float moistureThreshold) {
		this.moistureThreshold = moistureThreshold;
	}

}
