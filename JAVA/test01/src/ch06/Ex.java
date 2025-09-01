package ch06;

class StaticSample{
	public int n;
	public static int m;
	public void g() {
		m=20;
	}
	public void h() {
		m=30;
	}
	public static void f() {
		m=5;
	}
}

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticSample.m = 10;
		StaticSample.f();
		// StaticSample.n = 5; 객체 생성 후에 가능
		// StaticSample.g(); 위와 동일
		StaticSample s1, s2;
		s1 = new StaticSample();
		s2 = new StaticSample();
		s1.m = 5;
		System.out.println(s2.m); // 이 문장 위의 제일 마지막에 있는 m 값이 출력(m 은 static 이여서 공유 됨)
		s1.f();
        // s2.m = 10;
		s2.f();
		s1.n = 10;
		s1.g();
		s1.h();
	}

}
