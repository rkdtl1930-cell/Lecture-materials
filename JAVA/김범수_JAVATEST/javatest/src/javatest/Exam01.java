package javatest;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>> ");
		String s = sc.next();
		char ch = s.charAt(0);
		for(int i = 'a'; i <= ch; i++) {
			for(int j = 'a'; j <= i ; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}

	}
		
}


