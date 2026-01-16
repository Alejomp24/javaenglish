package com.perezcasallas;

public class FanRunner {
	public static void main(String[] args) {
		Fan fan = new Fan("Imusa", 0.8724, "White");
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte) 5);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}
}
