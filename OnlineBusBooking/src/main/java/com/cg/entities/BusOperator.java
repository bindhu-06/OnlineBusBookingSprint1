package com.cg.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name = "busoperator1")
public class BusOperator {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int busopeartorId;
	private String busOperatorUsername;
	private String passowrd;
	private List<Bus> operationalBuses;
	private List<Integer> caseNumber; // Inorder to cancel bus or update bus route or fare
	

	@OneToMany(mappedBy="busOpeartor")
	private List<Bus> bus;


	public BusOperator(int busopeartorId, String busOperatorUsername, String passowrd, List<Bus> operationalBuses,
			List<Integer> caseNumber, List<Bus> bus) {
		super();
		this.busopeartorId = busopeartorId;
		this.busOperatorUsername = busOperatorUsername;
		this.passowrd = passowrd;
		this.operationalBuses = operationalBuses;
		this.caseNumber = caseNumber;
		this.bus = bus;
	}


	public BusOperator() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getBusopeartorId() {
		return busopeartorId;
	}


	public void setBusopeartorId(int busopeartorId) {
		this.busopeartorId = busopeartorId;
	}


	public String getBusOperatorUsername() {
		return busOperatorUsername;
	}


	public void setBusOperatorUsername(String busOperatorUsername) {
		this.busOperatorUsername = busOperatorUsername;
	}


	public String getPassowrd() {
		return passowrd;
	}


	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}


	public List<Bus> getOperationalBuses() {
		return operationalBuses;
	}


	public void setOperationalBuses(List<Bus> operationalBuses) {
		this.operationalBuses = operationalBuses;
	}


	public List<Integer> getCaseNumber() {
		return caseNumber;
	}


	public void setCaseNumber(List<Integer> caseNumber) {
		this.caseNumber = caseNumber;
	}


	public List<Bus> getBus() {
		return bus;
	}


	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}


	@Override
	public String toString() {
		return "BusOperator [busopeartorId=" + busopeartorId + ", busOperatorUsername=" + busOperatorUsername
				+ ", passowrd=" + passowrd + ", operationalBuses=" + operationalBuses + ", caseNumber=" + caseNumber
				+ ", bus=" + bus + "]";
	}
	
	

	
	
}
