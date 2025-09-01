package ch06;

public class MethodEx {
	static void func1(int num) {
		num++;
		System.out.println("func1의 num값 "+num);
	}
	static void func2(Person p) {
		p.setAge(30);
		p.display();
	}
	static void func3(int[] b) {
		b[0]=100;
		for(int i:b) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aa= {1,2,3};
		for(int i:aa) {
			System.out.println(i);
		}
		func3(aa);
		for(int j:aa) {
			System.out.println(j);
		}
		
		Person p1=new Person("홍길동",20,"남자");
		p1.display();
		func2(p1);
		p1.display();
		
		int num=10;
		func1(num);
		System.out.println("main의 num 값:"+num);
	}

}
