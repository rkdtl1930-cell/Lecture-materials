package ch06;

import java.util.Scanner;

public class EmployyeeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employees=new Employee[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<employees.length;i++) {
			System.out.println("사번 이름 부서 직급 급여를 입력하세요");
			int empno=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			String position=sc.next();
			int sal=sc.nextInt();
			employees[i]=new Employee(empno,name,dept, position,sal);
		}
		for(Employee e:employees) {
			e.display();
		}

	}

}
