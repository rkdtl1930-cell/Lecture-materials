package ch04;

import java.util.Scanner;

public class IfEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("두 수와 연산자를 입력하세요");
		int num1=sc.nextInt();
		String op=sc.next();
		int num2=sc.nextInt();
		
		int result=0;
		switch(op) {
		case "+":result=num1+num2;break;
		case "-":result=num1-num2;break;
		case "*":result=num1*num2;break;
		case "/":result=num1/num2;break;
		case "%":result=num1%num2;break;
		default:System.out.println("연산자 입력오류");
		}
		System.out.println("연산결과:"+result);
		sc.close();
	}

}
