package by.htp.ptoject.transport.entity.trasports;

import by.htp.ptoject.transport.entity.kindOfTransport.SurfaceTransport;

public class Subway extends SurfaceTransport {
	private int numberOfRailwayWaggon;

	public Subway() {

	}

	public Subway(String brend, double speed, int numberOfPassengers, String color, String type, int wheel,
			int numberOfRailwayWaggon) {
		super(brend, speed, numberOfPassengers, color, type, wheel);
		this.numberOfRailwayWaggon = numberOfPassengers;

	}

	public int getNumberOfRailwayWaggon() {
		return numberOfRailwayWaggon;
	}

	public void setNumberOfRailwayWaggon(int numberOfRailwayWaggon) {
		this.numberOfRailwayWaggon = numberOfRailwayWaggon;
	}

	@Override
	public String toString() {
		return "Subway-" + super.toString() + " ,numberOfRailwayWaggon=" + numberOfRailwayWaggon + "]";
	}

}
