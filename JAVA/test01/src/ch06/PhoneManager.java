package ch06;

import java.util.Scanner;

class Phone2{
	String name;
	String tel;
	public Phone2() {}
	public Phone2(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}

public class PhoneManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		System.out.print("인원수>>");
		int i = sc.nextInt();
		Phone2[] phones = new Phone2[i];
		for(int j = 0 ; j < phones.length ; j++ ) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
			String name = sc.next();
			String tel = sc.next();
			phones[j] = new Phone2(name, tel);
		}
		System.out.println("저장되었습니다...");
		while(true) {
			System.out.print("검색할 이름>>");
			String name = sc.next();
			if(name.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			boolean flag = false;
			for(int j = 0 ; j < phones.length ; j++) {
				if(name.equals(phones[j].getName())) {
					System.out.println(phones[j].getName()+"의 번호는 "+phones[j].getTel()+" 입니다.");
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println(name+" 이(가) 없습니다.");
			}
		}
		sc.close();
	}
}
