package fExam;

import java.util.Scanner;

public class Ex03MinvalueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 값을 입력하세요: ");
        int a = sc.nextInt();

        System.out.print("두 번째 값을 입력하세요: ");
        int b = sc.nextInt();

        System.out.print("세 번째 값을 입력하세요: ");
        int c = sc.nextInt();

        // 방법 1: Math.min() 활용
        int minValue = Math.min(a, Math.min(b, c));
        
        System.out.println("가장 작은 값은 " + minValue + " 입니다.");
        
        if(a<b) {
        	if(a<c)
        		System.out.println("가장 작은 값:"+a);
        	else
        		System.out.println("가장 작은 값:"+c);
        }else {
        	if(b<c)
        		System.out.println("가장 작은 값:"+b);
        	else
        		System.out.println("가장 작은 값:"+c);
        }

        sc.close();

	}

}
