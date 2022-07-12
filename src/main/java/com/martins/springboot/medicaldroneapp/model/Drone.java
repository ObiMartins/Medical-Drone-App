package com.martins.springboot.medicaldroneapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Drone{
	
	@Id
	@GeneratedValue
	private int serialNumber;
	private int weight;
	private int batteryCapacity;
	private Dronemodel dronemodel;
	private Dronestate dronestate;
	
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public Dronemodel getDronemodel() {
		return dronemodel;
	}
	public void setDronemodel(Dronemodel model) {
		this.dronemodel = model;
	}
	public Dronestate getDronestate() {
		return dronestate;
	}
	public void setDronestate(Dronestate state) {
		this.dronestate = state;
	}
	
}
