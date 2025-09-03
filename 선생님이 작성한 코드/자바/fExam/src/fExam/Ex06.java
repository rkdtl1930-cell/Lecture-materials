package fExam;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
	            {78, 48, 78, 98},
	            {99, 92},
	            {29, 64, 83},
	            {34, 78, 92, 56}
	        };

	        // 각 행 출력 및 합계/평균 계산
	        for (int i = 0; i < arr.length; i++) {
	            int sum = 0;
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print(arr[i][j] + "\t");
	                sum += arr[i][j];
	            }
	            double avg = (double) sum / arr[i].length;
	            System.out.printf(" | 합계: %d, 평균: %.2f%n", sum, avg);
	        }

	}

}
