package ch06;

public class Employee {
	int empno;
	String name;
	String dept;
	String position;
	int sal;
	
	public Employee() {}
	
	public Employee(int empno, String name, String dept, String position, int sal) {
		this.empno=empno;
		this.name=name;
		this.dept=dept;
		this.position=position;
		this.sal=sal;
	}
	
	public void display() {
		System.out.println(this.empno+" "+this.name+" "+this.dept+" "+this.position+" "+this.sal);
	}

}
