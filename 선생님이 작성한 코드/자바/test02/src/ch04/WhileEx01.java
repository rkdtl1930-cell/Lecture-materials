package ch04;

public class WhileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11;
		int sum=0;
		while(num<=10) {
			sum+=num;
			System.out.println("num="+num+", sum="+sum);
			num++;
		}
		System.out.println("1~10까지 숫자의 합은 "+sum+"입니다.");

	}

}
