package ch05;

import java.util.Scanner;

public class ExceptionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("나뉨수를 입력하시요");
		int dividend=sc.nextInt();
		System.out.println("나눗수를 입력하세요");
		int divider=sc.nextInt();
		try {
			System.out.println(dividend/divider);
		}catch(ArithmeticException ex) {
			//ex.printStackTrace();
			System.out.println(ex.getMessage());
			System.out.println("0으로 나뉨 예외발생");
		}
		System.out.println("End");

	}

}
