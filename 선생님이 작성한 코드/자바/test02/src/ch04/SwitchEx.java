package ch04;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("커피를 주문하세요");
		String name=sc.next();
		int count=sc.nextInt();
		int price=0;
		
		switch(name) {
		case "에스프레소" :price=2000;break;
		case "아메리카노" :price=2500;break;
		case "카푸치노" :price=3000;break;
		case "카페라떼" :price=3500;break;
		}
		System.out.println(price*count+"입니다.");
	}

}
