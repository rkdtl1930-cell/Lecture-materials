package ch04;

import java.util.Scanner;

public class IfEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age=sc.nextInt();
		
		if(age<8 || age>26) {
			System.out.println("학생이 아닙니다.");
		}else {
			if(age>=20)
				System.out.println("대학생");
			else if(age>17)
				System.out.println("고등학생");
			else if(age>14)
				System.out.println("중학생");
			else
				System.out.println("초등학생");
		}
		sc.close();
	}

}
