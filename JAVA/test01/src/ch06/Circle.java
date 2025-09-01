package ch06;

public class Circle {
	int radius;
	String name;
	
	public Circle() {}
	public Circle(int r) {
		radius = r;
	}
	public Circle(String n) {
		name = n;
	}
	public Circle(int r, String n) {
		radius = r;
		name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}