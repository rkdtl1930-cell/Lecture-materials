package ch06;

import java.util.Scanner;

public class Phone {
	private String name, tel;
	public Phone(String name, String tel) {
		this.name=name;
		this.tel=tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Phone[] phones=new Phone[2];
		
		for(int i=0; i<2; i++) {
			System.out.print("입력과 전화번호를 입력>>");
			String name=sc.next();
			String tel=sc.next();
			phones[i]=new Phone(name, tel);
		}
		for(Phone p: phones) {
			System.out.println(p.getName()+"의 번호 "+p.getTel());
		}
	}
}
