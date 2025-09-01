package ch06;

class Circle1 {
	public int radius;
	public String name;
	
	public Circle1() {}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		Circle pizza=new Circle();
		pizza.radius=10;
		pizza.name="자바피자";
		double area=pizza.getArea();
		
		Circle c1=new Circle(5);
		c1.name="동그라미";
		area=c1.getArea();
		System.out.println(c1.name+"의 면적은 "+area);
		
		Circle c2=new Circle("원");
		c2.radius=5;
		area=c2.getArea();
		System.out.println(c2.name+"의 면적은 "+area);
		
		Circle c3=new Circle(4,"원2");
		area=c3.getArea();
		System.out.println(c3.name+"의 면적은 "+area);
		
		System.out.println("반지름:"+pizza.radius);
		System.out.println("이름:"+pizza.name);
		System.out.println("면적:"+area);
		
		Circle1 donut=new Circle1();
		donut.radius=2;
		donut.name="자바도넛";
		area=donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);	
	}
}
