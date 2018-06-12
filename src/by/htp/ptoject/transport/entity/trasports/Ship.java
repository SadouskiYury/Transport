package by.htp.ptoject.transport.entity.trasports;

import by.htp.ptoject.transport.entity.kindOfTransport.WaterTransport;

public class Ship extends WaterTransport {
	private String size;

	public Ship() {

	}

	public Ship(String brend, double speed, int numberOfPassengers, String color, int numberOfengine, String size) {
		super(brend, speed, numberOfPassengers, color, numberOfengine);
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Ship-"+super.toString()+ " ,size=" + size + "]";
	}

}
