package javatest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		System.out.println("학생의 이름과 점수를 입력하세요. (예 : 홍길동 80) 그만을 입력하면 입력이 종료됩니다.");
		while(true) {
			System.out.print("학생 이름, 점수>> ");
			String name = sc.next();
			if(name.equals("그만")){
				break;
			}
			int score = sc.nextInt();
			scores.put(name, score);
		}
		while(true) {
			System.out.print("학생의 성적 검색 그만을 입력하면 검색이 종료됩니다. >> ");
			String name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			boolean flag = scores.containsKey(name);
			if(flag) {
				System.out.println(name+"의 점수는 "+scores.get(name)+"점입니다.");
			}
			else {
				System.out.println(name+"은(는) 등록된 데이터가 아닙니다.");
			}
				
		}
		System.out.println("End");
	}

}
