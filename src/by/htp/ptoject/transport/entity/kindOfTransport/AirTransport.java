package by.htp.ptoject.transport.entity.kindOfTransport;

import by.htp.ptoject.transport.entity.Transport;

public abstract class AirTransport extends Transport {
	private double flightAltitude;
	private static int count1;

	public AirTransport() {

	}

	public AirTransport(String brend, double speed, int numberOfPassengers, String color, double flightAltitude) {
		super(brend, speed, numberOfPassengers, color);
		this.flightAltitude = flightAltitude;
		count1++;

	}

	
	public static void showCountAirTransport() {
		System.out.println("Number of Air Transport : " + count1++);
	}

	public double getFlightAltitude() {
		return flightAltitude;
	}

	public void setFlightAltitude(double flightAltitude) {
		this.flightAltitude = flightAltitude;
	}

	@Override
	public String toString() {
		return "AirTransport"+super.toString()+", flightAltitude=" + flightAltitude;
	}

}
