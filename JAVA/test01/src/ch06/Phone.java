package ch06;

import java.util.Scanner;

public class Phone {
	private String name, tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		Phone[] phones = new Phone[2];
		for(int i = 0; i<phones.length; i++) {
			System.out.print("이름과 전화번호 입력>>");
			String name = sc.next();
			String tel = sc.next();
			phones[i] = new Phone(name, tel);
		}
		System.out.println("스폰지밥의 번호 "+phones[0].getTel());
		System.out.println("징징이의 번호 "+phones[1].getTel());
	}
}
