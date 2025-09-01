package test01;

class A{
	void sum(int a, int b) {
		System.out.println(a+b);
	}
}

public class Test01 {
	int a;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		A a =new A();
		a.sum(1, 2);
	}

}
