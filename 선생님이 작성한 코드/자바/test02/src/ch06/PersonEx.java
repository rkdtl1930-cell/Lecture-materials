package ch06;

class Person{
	String name;
	int age;
	String gender;
	
	public Person() {
		
	}
	public Person(String n) {
		name=n;
	}
	public Person(String name, int age, String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	
	public void display() {
		System.out.println(name+" "+age+"세 "+gender);
	}
}

public class PersonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong=new Person();
		Person kim=new Person("kim",15,"여자");
		hong.name="홍길동";
		hong.age=20;
		hong.gender="남자";
		hong.display();
	}

}
