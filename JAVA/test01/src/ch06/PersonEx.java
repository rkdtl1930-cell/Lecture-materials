package ch06;

import java.util.Scanner;

public class PersonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p = new Person();
		Scanner sc = new Scanner(System.in);
		Person[] people = new Person[5];
		
		for(int i=0; i<people.length; i++) {
			System.out.println("이름, 나이, 성별을 입력하세요");
			String name=sc.next();
			int age=sc.nextInt();
			String gender=sc.next();
			people[i] = new Person(name, age, gender);
		}
		for(Person p:people) {
			p.display();
		}
	}

}
