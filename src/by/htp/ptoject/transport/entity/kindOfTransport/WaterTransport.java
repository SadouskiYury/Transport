package by.htp.ptoject.transport.entity.kindOfTransport;

import by.htp.ptoject.transport.entity.Transport;

public abstract class WaterTransport extends Transport {
	private int numberOfengine;
	private static int count2;

	public WaterTransport() {

	}

	public WaterTransport(String brend, double speed, int numberOfPassengers, String color, int numberOfengine) {
		super(brend, speed, numberOfPassengers, color);
		this.numberOfengine = numberOfengine;
		count2++;
	}

	public static void showCountWaterTransport() {
		System.out.println("Number of Water Transport : " + count2++);
	}

	public int getNumberOfengine() {
		return numberOfengine;
	}

	public void setNumberOfengine(int numberOfengine) {
		this.numberOfengine = numberOfengine;
	}

	@Override
	public String toString() {
		return "WaterTransport"+ super.toString() +" ,numberOfengine=" + numberOfengine ;
	}

}
