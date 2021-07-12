/**
 * Assignment 3
 */
package com.ss.jb.two;

/**
 * @author SeanW
 *
 */
public class Circle implements Shape {

	double radius;
	

	public Circle(double radius) {
	this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return radius*radius*3.14;
	}

	@Override
	public String display() {
		return "This is a circle with radius " + radius;
	}
}
