package ch05;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("나뉨수를 입력하시오:");
		dividend = sc.nextInt();
		System.out.print("나눗수를 입력하시오:");
		divisor = sc.nextInt();
		try {
			System.out.println(dividend+"를"+divisor+"로 나누면 몫은"+dividend/divisor+"입니다.");
		}
		catch(ArithmeticException ex){
			ex.printStackTrace();
			System.out.println(ex.getMessage());
			System.out.println("0으로 나뉨 예외발생");
		}
		System.out.println("End");
		sc.close();
	}

}
