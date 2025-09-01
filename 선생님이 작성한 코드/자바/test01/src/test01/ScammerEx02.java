package test01;

import java.util.Scanner;

public class ScammerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//String s1="A";
		//char ch=s1.charAt(0);
		System.out.print("소문자 입력>>");
		String s1=sc.next();
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			System.out.print((char)(ch-32));
		}	
	}
}
