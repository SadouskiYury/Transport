package by.htp.ptoject.transport.entity.trasports;

import by.htp.ptoject.transport.entity.kindOfTransport.AirTransport;

public class Plain extends AirTransport {
	private int numberOfWings;

	public Plain() {

	}

	public Plain(String brend, double speed, int numberOfPassengers, String color, double flightAltitude,
			int numberOfWings) {
		super(brend, speed, numberOfPassengers, color, flightAltitude);
		this.numberOfWings = numberOfWings;

	}

	public int getNumberOfWings() {
		return numberOfWings;
	}

	public void setNumberOfWings(int numberOfWings) {
		this.numberOfWings = numberOfWings;
	}

	@Override
	public String toString() {
		return "Plain-" + super.toString() + " ,numberOfWings=" + numberOfWings + "]";
	}

}
