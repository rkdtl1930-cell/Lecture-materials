package ch04;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("소문자 입력");
			String s1=sc.next();
			char ch=s1.charAt(0);
			if(ch=='Q')
				break;
			System.out.println((char)(ch-32));
		}

	}

}
