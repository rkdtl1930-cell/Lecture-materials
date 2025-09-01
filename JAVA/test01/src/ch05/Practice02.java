package ch05;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p127 6번 문제
		Scanner sc = new Scanner(System.in);
		String eng[] = {"student","love","java","happy","future"};
		String kor[] = {"학생","사랑","자바","행복한","미래"};
		while(true){
			System.out.print("영어 단어를 입력하세요>>");
			String word = sc.next();
			if(word.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			boolean flag = false;
			for(int i=0 ; i<5 ; i++) {
				if(word.equals(eng[i])) {
					System.out.println(kor[i]);
				    flag=true;
					break;
				}
			}
			if(!flag)
				System.out.println("단어를 잘못 입력했습니다.");
		}		
	}
}
