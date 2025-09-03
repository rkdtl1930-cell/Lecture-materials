package fExam;

public class Ex05MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("   |");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // 구분선 출력
        System.out.print("---+");
        for (int i = 1; i <= 9; i++) {
            System.out.print("----");
        }
        System.out.println();

        // 곱셈표 본문 출력
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);  // 왼쪽 라벨
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

}
