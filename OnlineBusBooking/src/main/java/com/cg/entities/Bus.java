package com.cg.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="bus1")
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private String busNumber;
	private BusRoute busRoute;
	private int totalSeats;
	private int fare;
	
	public Bus(String busNumber, int totalSeats, int fare) {
		super();
		this.busNumber = busNumber;
		this.totalSeats = totalSeats;
		this.fare = fare;
	}
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	@OneToOne(mappedBy="bus", cascade=CascadeType.ALL)
	

	private BusOperatorRequest busoperatorrequest;
	
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", totalSeats=" + totalSeats + ", fare=" + fare + "]";
	}

}
