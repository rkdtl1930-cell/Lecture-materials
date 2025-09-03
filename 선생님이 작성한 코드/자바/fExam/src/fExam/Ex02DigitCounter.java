package fExam;

import java.util.Scanner;

public class Ex02DigitCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // 입력 받기
        System.out.print("양의 정수를 입력하세요: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("양의 정수를 입력해야 합니다.");
        } else {
            // 숫자를 문자열로 변환해서 길이를 구함
            int length = String.valueOf(number).length();

            // 출력
            System.out.println(length + "자리수입니다.");
        }

        sc.close();

	}

}
