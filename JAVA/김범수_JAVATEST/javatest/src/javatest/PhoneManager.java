package javatest;

import java.util.Scanner;

public class PhoneManager {
	static Scanner sc;
	static Phone phones[];
	public void run() {
		sc = new Scanner(System.in);
		input();
		System.out.println("저장되었습니다...");
		search();
		
	}
	public void input() {
		System.out.print("인원수 >> ");
		int count = sc.nextInt();
		phones = new Phone[count];
		for(int i=0; i<phones.length; i++) {
			System.out.print("이름과 전화번오(번호는 연속적으로 입력), 주소 >> ");
			String name = sc.next();
			String tel = sc.next();
			String address = sc.next();
			phones[i] = new Phone(name, tel, address);
		}
	}
	
	public void search() {
		while(true) {
			System.out.print("검색할 이름 >> ");
			String name = sc.next();
			if(name.equals("exit"))
				break;
			boolean flag = false;
			for(int i=0; i<phones.length; i++) {
				if(name.equals(phones[i].getName())) {
					phones[i].display();
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println(name+" 은(는) 없습니다.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneManager pm = new PhoneManager();
		pm.run();
	}

}
