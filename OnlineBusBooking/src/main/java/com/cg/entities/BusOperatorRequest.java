package com.cg.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="busoperatorrequest1")
public class BusOperatorRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int caseNumber;
	private String busOperatorUsername;
	private Bus bus;
	private String requestMsg;
	private String requestFor; 
	private boolean status; 
	private LocalDate requestDate;
	public BusOperatorRequest(int caseNumber, String busOperatorUsername, Bus bus, String requestMsg, String requestFor,
			boolean status, LocalDate requestDate) {
		super();
		this.caseNumber = caseNumber;
		this.busOperatorUsername = busOperatorUsername;
		this.bus = bus;
		this.requestMsg = requestMsg;
		this.requestFor = requestFor;
		this.status = status;
		this.requestDate = requestDate;
	}
	public BusOperatorRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@OneToOne(cascade = CascadeType.ALL)
	public int getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}
	public String getBusOperatorUsername() {
		return busOperatorUsername;
	}
	public void setBusOperatorUsername(String busOperatorUsername) {
		this.busOperatorUsername = busOperatorUsername;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public String getRequestMsg() {
		return requestMsg;
	}
	public void setRequestMsg(String requestMsg) {
		this.requestMsg = requestMsg;
	}
	public String getRequestFor() {
		return requestFor;
	}
	public void setRequestFor(String requestFor) {
		this.requestFor = requestFor;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public LocalDate getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(LocalDate requestDate) {
		this.requestDate = requestDate;
	}
	@Override
	public String toString() {
		return "BusOperatorRequest [caseNumber=" + caseNumber + ", busOperatorUsername=" + busOperatorUsername
				+ ", bus=" + bus + ", requestMsg=" + requestMsg + ", requestFor=" + requestFor + ", status=" + status
				+ ", requestDate=" + requestDate + "]";
	}
}
