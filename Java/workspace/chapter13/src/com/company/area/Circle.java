package com.company.area;

public class Circle {
	double rad;
	final double PI;
	public Circle(double r) {
		rad = 4;
		PI = 3.14;
	}
	public double getArea() {
		return rad*rad*PI;
	}
}
