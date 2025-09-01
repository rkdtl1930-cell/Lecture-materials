package ch06;

public class Person {
	String name;
	int age;
	String gender;
	public Person() {}
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void display() {
		System.out.println(name+" "+age+"세 "+gender);
	}
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 24;
		p1.gender = "남자";
		p1.display();
		Person p2 = new Person("kim",15,"여자");
		p2.display();
	}
}
