package com.jspiders.spring.PlaneAOP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ticket {

	@Value("101")
	private int ticketno;
	@Value("2000.335")
	private double tprice;
	@Value("A")
	private char tclass;
	@Value("10")
	private int seatno;

	public int getTicketno() {
		return ticketno;
	}

	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
	}

	public double getTprice() {
		return tprice;
	}

	public void setTprice(double tprice) {
		this.tprice = tprice;
	}

	public char getTclass() {
		return tclass;
	}

	public void setTclass(char tclass) {
		this.tclass = tclass;
	}

	public int getSeatno() {
		return seatno;
	}

	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}

	@Override
	public String toString() {
		return "Ticket [ticketno=" + ticketno + ", tprice=" + tprice + ", tclass=" + tclass + ", seatno=" + seatno
				+ "]";
	}
	

}
