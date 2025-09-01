package ch03;

import java.util.Scanner;

public class OpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 2개을 입력하세요");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		sc.close();
	}

}
