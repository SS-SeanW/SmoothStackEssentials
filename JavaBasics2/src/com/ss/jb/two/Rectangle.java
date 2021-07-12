package com.ss.jb.two;

public class Rectangle implements Shape {

	public Rectangle( double length, double width) {
		this.length = length;
		this.width = width;
	}

	double length;
	double width;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	public double calculateArea() {
		return length*width;
	}

	@Override
	public String display() {
		return "This is a rectangle with length " + length + "and width " + width;
	}
	
}
