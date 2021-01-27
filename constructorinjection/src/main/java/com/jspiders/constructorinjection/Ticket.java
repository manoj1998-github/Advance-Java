package com.jspiders.constructorinjection;

public class Ticket {

	private String departure;
	private String arrival;
	private long id;

	public Ticket(String departure, String arrival, long id) {
		super();
		this.departure = departure;
		this.arrival = arrival;
		this.id = id;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ticket [departure=" + departure + ", arrival=" + arrival + ", id=" + id + "]";
	}

}
