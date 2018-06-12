package by.htp.ptoject.transport.entity;

public abstract class Transport {
	private String brend;
	private double speed;
	private int numberOfPassengers;
	private String color;
	private static int count;

	public Transport() {

	}

	public Transport(String brend, double speed, int numberOfPassengers, String color) {
		this.brend = brend;
		this.color = color;
		this.numberOfPassengers = numberOfPassengers;
		this.speed = speed;
		count++;
	}

	public static void showCount() {
		System.out.println("The total number of units Transport: " + count);
	}

	public String getBrend() {
		return brend;
	}

	public void setBrend(String brend) {
		this.brend = brend;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return " [brend=" + brend + ", speed=" + speed + ", numberOfPassengers=" + numberOfPassengers + ", color="
				+ color;
	}

}
