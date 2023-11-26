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
@Table(name="sprinkler")
public class Sprinkler {

	public Sprinkler() {
		super();
	}

	@Id
	@SequenceGenerator(name = "sprinklerID", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sprinklerID")
	private Long sprinklerId;

	@Column(name = "farmId", nullable=false)
	private Long farmId;

	@Column(name = "zone", nullable=false)
	private int zone;

	@Column(name = "status")
	private boolean state = false;

	public Long getFarmId() {
		return farmId;
	}

	public Long getSprinklerId() {
		return sprinklerId;
	}

	public void setSprinklerId(Long sprinklerId) {
		this.sprinklerId = sprinklerId;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public void setFarmId(Long farmId) {
		this.farmId = farmId;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}
}

