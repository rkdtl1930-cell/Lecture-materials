package ch05;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];
				
		int max = 0;
//		System.out.println("양수 5개를 입력하세요.");
		for(int i=0; i<5; i++) {
			int num=(int)(Math.random()*10)+1;
			boolean flag=false;
			for (int j=0; j<i; j++) {
				if(intArray[j]==num)
					flag=true;
			}
			if(flag) {
				i--;
				continue;
			}
			intArray[i] = num;
			System.out.println(intArray[i]);
			if(intArray[i]>max)
				max = intArray[i];
		}
		System.out.println("가장 큰 수는" + max + "입니다.");
		
		sc.close();
	}

}
