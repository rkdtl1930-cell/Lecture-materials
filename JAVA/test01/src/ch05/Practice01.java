package ch05;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		// p.126 2번문제
//		int iArray[] = new int[10];
//		System.out.println("정수 10개 입력>>");
//		for(int i=0;i<10;i++) {
//			iArray[i]=sc.nextInt();
//			if(iArray[i] % 3 == 0)
//				System.out.print(iArray[i]);
//		}
		
		// 배열의 크기가 10인 배열을 생성하고 랜덤함수를 사용하여 난수(20까지)를 발생시켜 배열에 저장. 단, 서로 다른 값이 저장되도록 하며,
		// 배열의 요소값 중 3의 배수만 출력한다.
		int i2Array[] = new int[10];
		for(int i=0 ; i <10 ; i++) {
			int num = (int)(Math.random()*20)+1;
			boolean flag = false; // 중복 숫자 제거
			for(int j=0 ; j<i ; j++) {
				if(i2Array[j]==num) {
					flag = true;
					break; // 뒤에까지 검사를 안하고 그 자리만 검사
				}
			}			
			if(flag) {
				i--; // 중복되면 제거하고 다시 포문 반복
				continue;
			}			
			i2Array[i]=num;
			System.out.print(i2Array[i]+" ");
			}
			System.out.println();
			for(int i=0; i<10; i++) {
				if(i2Array[i] % 3 ==0)  { // 3의 배수만 체크
					System.out.print(i2Array[i]+" ");
			}
		}
		
	}

}
