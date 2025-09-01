package ch06;

public class MethodEx02 {
	static int sum(int a, int b) {
		return a+b;
	}
//	static double sum(int a, int b) {
//		return (double)a +b;
//	}
	static int sum(int a, int b, int c) {
		return a+b+c;
	}
	static double sum(double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1.2,3));
	}

}
