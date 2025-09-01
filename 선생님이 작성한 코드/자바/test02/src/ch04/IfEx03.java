package ch04;

import java.util.Scanner;

public class IfEx03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("점수입력");
		int score=sc.nextInt();
		
		if(score>60) {
			System.out.println("합격입니다.");
			if(score>=90)
				System.out.println("A학점");
			else if(score>=80)
				System.out.println("B학점");
			else if(score>=70) {
				System.out.println("C학점");
			}else {
				System.out.println("D학점");
			}
		}else {
			System.out.println("불합격입니다");
		}
	}

}
