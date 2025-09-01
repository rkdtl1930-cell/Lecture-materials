package ch06;

import java.util.Scanner;

public class PersonEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p=new Person();
		Scanner sc=new Scanner(System.in);
		Person[] persons=new Person[5];
		
		for(int i=0; i<persons.length;i++) {
			System.out.println("이름, 나이, 성별을 입력하세요");
			String name=sc.next();
			int age=sc.nextInt();
			String gender=sc.next();
			persons[i]=new Person(name, age, gender);
		}
		for(Person p:persons) {
			p.display();
		}
		

	}

}
