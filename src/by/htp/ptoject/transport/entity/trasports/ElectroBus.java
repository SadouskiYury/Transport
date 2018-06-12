package by.htp.ptoject.transport.entity.trasports;

import by.htp.ptoject.transport.entity.kindOfTransport.SurfaceTransport;

public class ElectroBus extends SurfaceTransport {
	private String route;

	// мапшрут через город ззагороод
	public ElectroBus() {

	}

	public ElectroBus(String brend, double speed, int numberOfPassengers, String color, String type, int wheel,
			String route) {
		super(brend, speed, numberOfPassengers, color, type, wheel);
		this.route = route;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	@Override
	public String toString() {
		return "ElectroBus-" + super.toString() + " ,route=" + route + "]";
	}

}
