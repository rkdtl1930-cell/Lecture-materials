package fExam;

public class Ex07_InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15, 7, 2, 9, 10, 12, 17, 11, 20, 5};

        // 삽입정렬 과정 출력
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // key를 올바른 위치에 삽입
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            // 현재 단계 출력
            System.out.print((i) + " :   ");
            for (int n = 0; n < arr.length; n++) {
                System.out.print(arr[n]);
                if (n < arr.length - 1) System.out.print(", ");
            }
            System.out.println();
        }

	}

}
