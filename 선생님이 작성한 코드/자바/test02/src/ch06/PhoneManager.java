package ch06;

import java.util.Scanner;

public class PhoneManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("인원수>>");
		int num=sc.nextInt();
		Phone[] phones=new Phone[num];
		for(int i=0; i<phones.length;i++) {
			System.out.print("이름 전화번호 입력>>");
			String name=sc.next();
			String tel=sc.next();
			phones[i]=new Phone(name, tel);
		}
		System.out.println("저장이 되었습니다");
		
		while(true) {
			System.out.print("검색할 이름>>");
			String name=sc.next();
			if(name.equals("exit")) {
				break;
			}
			boolean flag=false;
			for(Phone p:phones) {
				if(p.getName().equals(name)) {
					System.out.println(p.getName()+"의 전화번호는 "+p.getTel()+"입니다");
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.println(name+"이 없습니다.");
			}
			
		}
		System.out.println("프로그램 종료");
	}

}












