package ch04;

import java.util.Scanner;

public class IfEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("국어(kor), 영어(eng)점수를 입력하세요");
		int kor=sc.nextInt();
		int eng=sc.nextInt();
		int avg=(kor+eng)/2;
		
		System.out.println("평균:"+avg);
		
		if((avg>=70)&&(kor>=60)&&(eng>=60)) {
			System.out.println("합격여부 : 합격");
			System.out.print("등급:");
			if(avg>=90)
				System.out.println("1등급");
			else if(avg>=80)
				System.out.println("2등급");
			else
				System.out.println("3등급");
		}else {
			System.out.println("합격여부 : 불합격");
		}

	}

}
