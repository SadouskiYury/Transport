package by.htp.ptoject.transport.entity.kindOfTransport;

import by.htp.ptoject.transport.entity.Transport;

public abstract class SurfaceTransport extends Transport {
	private String type;
	// грузовой,легковой
	private int wheel;
	private static int count3;

	public SurfaceTransport() {
	}

	public SurfaceTransport(String brend, double speed, int numberOfPassengers, String color, String type, int wheel) {
		super(brend, speed, numberOfPassengers, color);
		this.type = type;
		this.wheel = wheel;
		count3++;
	}

	public static void showCountSurfaceTransport() {
		System.out.println("Number of Surface Transport: " + count3++);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return "SurfaceTransport" + super.toString() + " ,type=" + type + ", wheel=" + wheel;
	}

}
