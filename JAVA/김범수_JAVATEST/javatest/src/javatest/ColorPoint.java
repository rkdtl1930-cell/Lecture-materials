package javatest;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
	
}

public class ColorPoint extends Point {

	String color;
	

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setPoint(int x, int y) {
		super.move(x, y);
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	public void show() {
		System.out.print(color+"색으로 ");
		showPoint();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("PINK");
		cp.show();
	}

}
