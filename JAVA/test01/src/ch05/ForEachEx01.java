package ch05;

public class ForEachEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iArray[]= {1,2,3,4,5};
		int sum = 0;
		for(int k:iArray) {
			sum += k;
			System.out.println("합은" + sum);
		}
		String names[] = {"사과","배","바나나","체리","딸기","포도"};
		for (String s : names)
			System.out.print(s + " ");
		System.out.println();
		enum Week{월, 화, 수, 목, 금, 토, 일}
		for(Week day : Week.values())
			System.out.print(day+"요일"+" ");
	}

}
