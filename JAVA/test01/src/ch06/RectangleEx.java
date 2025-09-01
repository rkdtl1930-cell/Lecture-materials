package ch06;

class Rect{
	int width;
	int height;
	int area;
	
	public Rect() {
		this(5,4); // 생성자에선 값 초기화를 꼭 먼저(첫번째 줄에) 해야함
		System.out.println("기본생성자 호출됨");
	}

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
		this.area = width*height;
	}
	public boolean areaEqual(Rect r) {
		if(this.area==r.area)
			return true;
		else
			return false;
	}
	public void display() {
		System.out.println("사각형 면적 : "+area);
	}
}

public class RectangleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1 = new Rect(10,5);
		r1.display();
		Rect r2 = new Rect(5,10);
		r2.display();
		Rect r3 = new Rect();
		r3.display();
		System.out.println(r2.equals(r1));
	}

}
