package by.htp.ptoject.transport.entity.trasports;

import by.htp.ptoject.transport.entity.kindOfTransport.SurfaceTransport;

public class TrainOnMonorail extends SurfaceTransport {
	private int distanceWay;

	public TrainOnMonorail() {

	}

	public TrainOnMonorail(String brend, double speed, int numberOfPassengers, String color, String type, int wheel,
			int distanceWay) {
		super(brend, speed, numberOfPassengers, color, type, wheel);
		this.distanceWay = distanceWay;
	}

	public int getDistanceWay() {
		return distanceWay;
	}

	public void setDistanceWay(int distanceWay) {
		this.distanceWay = distanceWay;
	}

	@Override
	public String toString() {
		return "TrainOnMonorail-" + super.toString() + " ,distanceWay=" + distanceWay + "]";
	}

}
