package com.company.circumference;

public class Circle {
	double rad;
	final double PI;
	public Circle(double r) {
		rad = 4;
		PI = 3.14;
	}
	public double getCircumference() {
		return rad*2*PI;
	}

}
