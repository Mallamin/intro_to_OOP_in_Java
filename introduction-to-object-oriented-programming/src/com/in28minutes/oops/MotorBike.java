package com.in28minutes.oops;

public class MotorBike {
	// State

	private int speed;// member variable



	void start() {
		System.out.println("Bike started");

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {

		System.out.println(speed);
		System.out.println(this.speed);
		this.speed = speed;
	}

}
