package ch04;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score=sc.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:System.out.println("A학점");break;
		case 8:System.out.println("B학점");break;
		case 7:System.out.println("C학점");break;
		default:System.out.println("F학점");	
		}
		
		char ch;
		if(score>=90)
			ch='A';
		else if(score>=80)
			ch='B';
		else if(score>=70)
			ch='C';
		else
			ch='F';
		System.out.println("학점은 "+ch+"입니다");
		sc.close();
	}

}
