package javatest;

import java.util.ArrayList;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(1,"홍길동",80,60,70));
		students.add(new Student(2,"박경미",90,95,80));
		students.add(new Student(3,"정희선",75,80,100));
		students.add(new Student(4,"임혜동",80,70,95));
		students.add(new Student(5,"홍길동",100,65,80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===================================================================================");
		for(int i=0 ; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
	}

}
