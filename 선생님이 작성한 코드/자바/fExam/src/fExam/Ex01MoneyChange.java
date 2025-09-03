package fExam;

import java.util.Scanner;

public class Ex01MoneyChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        // 입력 받기
        System.out.print("지불할 금액을 입력하세요(천원 단위): ");
        int amount = sc.nextInt();

        // 화폐 단위 배열
        int[] units = {50000, 10000, 5000, 1000};
        String[] unitNames = {"50000원권", "10000원권", "5000원권", "1000원권"};

        // 결과 출력
        for (int i = 0; i < units.length; i++) {
            int count = amount / units[i]; // 해당 화폐 단위 개수
            amount %= units[i];            // 나머지 금액 계산
            System.out.println(unitNames[i] + " " + count + "개");
        }

        sc.close();

	}

}
