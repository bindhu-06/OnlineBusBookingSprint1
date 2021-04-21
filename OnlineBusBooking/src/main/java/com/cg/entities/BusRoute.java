package com.cg.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="busroute1")
public class BusRoute {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String routeName ;
	private String source;
	private String destination;
	public BusRoute(String routeName, String source, String destination) {
		super();
		this.routeName = routeName;
		this.source = source;
		this.destination = destination;
	}
	public BusRoute() {
		super();
		// TODO Auto-generated constructor stub
	}
	@OneToOne(mappedBy="busRoute", cascade=CascadeType.ALL)
	private Bus bus;
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "BusRoute [routeName=" + routeName + ", source=" + source + ", destination=" + destination + "]";
	}

}
