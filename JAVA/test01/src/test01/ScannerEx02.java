package test01;

import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1="A";
		char ch=s1.charAt(0);
		System.out.println(ch);
		
		System.out.println("대문자 입력>>");
		String s2=sc.next();
		char ch2=s2.charAt(0);
		System.out.println((char)(ch2+32));
		
		System.out.println("소문자 입력>>");
		String s3=sc.next();
		char ch3=s3.charAt(0);
		System.out.println((char)(ch3-32));
		
		System.out.println("대문자 입력>>");
		String s4=sc.next();
		for(int i=0; i<s4.length(); i++) {
			char ch4=s4.charAt(i);
			System.out.print((char)(ch4+32));
		}
	}

}
