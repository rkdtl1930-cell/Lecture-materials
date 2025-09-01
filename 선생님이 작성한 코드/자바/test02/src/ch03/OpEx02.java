package ch03;

public class OpEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=4;
		int num2=5;
		int num3=-12;
		num3>>=2;
		System.out.println(num3);
		System.out.println(num3>>>2);
		System.out.println("=====================");
		System.out.println(num1&num2);
		System.out.println(num1|num2);
		System.out.println(num1^num2);
		
		int num=10;
		System.out.println(~num+1);
		
		System.out.println(++num);
		System.out.println(num--);
		System.out.println(num+1);
		int val=++num;
		System.out.println(val);
		num+=2;
		System.out.println(num);
				
	}

}
