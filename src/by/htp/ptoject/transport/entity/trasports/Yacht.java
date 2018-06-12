package by.htp.ptoject.transport.entity.trasports;

import by.htp.ptoject.transport.entity.kindOfTransport.WaterTransport;

public class Yacht extends WaterTransport {
	private int numberOfSails;

	public Yacht() {

	}

	public Yacht(String brend, double speed, int numberOfPassengers, String color, int numberOfengine,
			int numberOfSails) {
		super(brend, speed, numberOfPassengers, color, numberOfengine);
		this.numberOfSails = numberOfSails;
	}

	public int getNumberOfSails() {
		return numberOfSails;
	}

	public void setNumberOfSails(int numberOfSails) {
		this.numberOfSails = numberOfSails;
	}

	@Override
	public String toString() {
		return "Yacht-" + super.toString() + " ,numberOfSails=" + numberOfSails + "]";
	}

}
