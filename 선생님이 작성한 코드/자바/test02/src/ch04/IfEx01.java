package ch04;

import java.util.Scanner;

public class IfEx01 {
	//[]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("나이입력");
		int age=sc.nextInt();
		
		String result=(age>=8)?"학교에 다닙니다":"학교에다니지 않습니다";
		System.out.println(result);
		
		if(age>=8){
			System.out.println("학교에 다닙니다.");
			System.out.println("나이:"+age);
		}else {
			System.out.println("학교에 다니지 않습니다.");
			System.out.println("더 기다리세요");
		}
		System.out.println("end");
		sc.close();

	}

}
