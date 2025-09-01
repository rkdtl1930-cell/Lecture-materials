package ch06;

public class MethodEx {
	static void func1(int num) {
		num++;
		System.out.println("func1의 "+num);
	}
	static void func2(Person p) {
		p.setAge(30);
		p.display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("홍길동", 20, "남자");
		p1.display();
		func2(p1);
		p1.display();
		int num=10;
		func1(num);
		System.out.println("main의 num의 값 : "+num);
	}

}
