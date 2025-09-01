package ch06;

class Circle1 {
	int radius;
	String name;
	
	public Circle1() {}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza=new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area=pizza.getArea();
		
		System.out.println("반지름 :"+" "+pizza.radius);
		System.out.println("이름 :"+" "+pizza.name);
		System.out.println("면적 :"+" "+area);
		
		Circle1 donut=new Circle1();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		
		System.out.println("반지름 : "+donut.radius);
		System.out.println("이름 : "+donut.name);
		System.out.println("면적 : "+area);
	
		Circle c1=new Circle(5);
		c1.name = "동그라미";
		
		System.out.println(c1.name+"의 면적은 "+c1.getArea());
		Circle c2=new Circle("원");
		c2.radius = 8;
		System.out.println(c2.name+"의 면적은 "+c2.getArea());
		
		Circle c3=new Circle(4,"웅");
		System.out.println(c3.name+"의 면적은 "+c3.getArea());
	}

}
