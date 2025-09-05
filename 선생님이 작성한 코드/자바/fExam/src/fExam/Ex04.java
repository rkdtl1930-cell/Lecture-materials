package fExam;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("영어소문자 입력");
		String s = sc.next();
		char ch = s.charAt(0);
		for(int i=ch ; i >= 'a'; i--) {
			for(int j='a'; j<=i; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
}
