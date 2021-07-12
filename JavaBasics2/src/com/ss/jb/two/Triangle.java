package com.ss.jb.two;

public class Triangle implements Shape {
	
	double height;
	double width;
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public Triangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return (height*width)/2;
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "This is a rectangle with length " + height + "and width " + width;
	}

}
