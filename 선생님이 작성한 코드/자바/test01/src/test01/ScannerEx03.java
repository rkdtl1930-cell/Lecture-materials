package test01;

import java.util.Scanner;

public class ScannerEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("이름을 입력하세요>>");
		String name=sc.next();
		System.out.print("이름을 입력하세요>>");
		int age=sc.nextInt();
		System.out.print("성별을 입력하세요>>");
		String gender=sc.next();
		System.out.print("연락처를 입력하세요>>");
		String tel=sc.next();
		System.out.print("주소를 입력하세요>>");
		sc.nextLine();
		String addr=sc.nextLine();
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("성별:"+gender);
		System.out.println("연락처:"+tel);
		System.out.println("주소:"+addr);
		sc.close();
	}

}
