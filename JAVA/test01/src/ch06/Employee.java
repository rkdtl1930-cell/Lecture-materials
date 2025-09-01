package ch06;

import java.util.Scanner;

public class Employee {
	
	int empno;
	String name;
	String dept;
	String position;
	int sal;
	public Employee() {}
	public Employee(int empno, String name, String dept, String position, int sal) {
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.position = position;
		this.sal = sal;
	}
	public void display() {
		System.out.println(empno+" "+name+" "+dept+" "+position+" "+sal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee[] e = new Employee[5];
		for(int i=0; i<e.length; i++) {
			System.out.println("직원번호, 이름, 부서, 직책, 급여를 입력하세요");
			int empno = sc.nextInt();
			String name = sc.next();
			String dept = sc.next();
			String position = sc.next();
			int sal = sc.nextInt();
			e[i] = new Employee(empno, name, dept, position, sal);
		}
		for(Employee k:e) {
			k.display();
		}
		
		sc.close();
	}

}
