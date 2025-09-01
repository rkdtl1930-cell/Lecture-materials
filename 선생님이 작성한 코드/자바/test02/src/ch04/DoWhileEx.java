package ch04;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11;
		int sum=0;
		
		do {
			sum+=num;
			num++;
		}while(num<=10);
		System.out.println("1~10 숫자의 합은 "+sum+"입니다");

	}

}
