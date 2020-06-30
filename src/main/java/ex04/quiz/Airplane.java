package ex04.quiz;

public class Airplane {

	public Airplane(IBattery battery) {
		this.battery = battery;
	}
	
	private IBattery battery;

	public IBattery getBattery() {
		return battery;
	}
}
