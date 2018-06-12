package by.htp.ptoject.transport.entity.trasports;

import by.htp.ptoject.transport.entity.kindOfTransport.AirTransport;

public class Helicopter extends AirTransport {
	private int propellers;

	public Helicopter() {

	}

	public Helicopter(String brend, double speed, int numberOfPassengers, String color, double flightAltitude,
			int propellers) {
		super(brend, speed, numberOfPassengers, color, flightAltitude);
		this.propellers = propellers;
	}

	public int getPropellers() {
		return propellers;
	}

	public void setPropellers(int propellers) {
		this.propellers = propellers;
	}

	@Override
	public String toString() {
		return "Helicopter-" + super.toString() + " ,propellers=" + propellers + "]";
	}

}
