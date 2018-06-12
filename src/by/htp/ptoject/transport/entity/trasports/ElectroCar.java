package by.htp.ptoject.transport.entity.trasports;

import by.htp.ptoject.transport.entity.kindOfTransport.SurfaceTransport;

public class ElectroCar extends SurfaceTransport {
	private String typeOfBattery;

	public ElectroCar() {
	}

	public ElectroCar(String brend, double speed, int numberOfPassengers, String color, String type, int wheel,
			String typeOfBattery) {
		super(brend, speed, numberOfPassengers, color, type, wheel);
		this.typeOfBattery = typeOfBattery;
	}

	public String getTypeOfBattery() {
		return typeOfBattery;
	}

	public void setTypeOfBattery(String typeOfBattery) {
		this.typeOfBattery = typeOfBattery;
	}

	@Override
	public String toString() {
		return "ElectroCar-" + super.toString() + " ,typeOfBattery=" + typeOfBattery + "]";
	}

}
