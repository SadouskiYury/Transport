package by.htp.ptoject.transport.entity.trasports;

import by.htp.ptoject.transport.entity.kindOfTransport.SurfaceTransport;

public class Motorcycle extends SurfaceTransport {
	private Boolean silencer;

	public Motorcycle() {

	}

	public Motorcycle(String brend, double speed, int numberOfPassengers, String color, String type, int wheel,
			Boolean silencer) {
		super(brend, speed, numberOfPassengers, color, type, wheel);
		this.silencer = silencer;
	}

	public Boolean getSilencer() {
		return silencer;
	}

	public void setSilencer(Boolean silencer) {
		this.silencer = silencer;
	}

	@Override
	public String toString() {
		return "Motorcycle-" + super.toString() + " ,silencer=" + silencer + "]";
	}

}
