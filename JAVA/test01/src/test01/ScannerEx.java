package test01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("키보드로부터 데이터 입력");
		String name=sc.next();
		String city=sc.next();
		int age=sc.nextInt();
		double weight=sc.nextDouble();
		boolean single=sc.nextBoolean();
		
		sc.nextLine();
		System.out.println("주소입력");
		String addr=sc.nextLine();
		
		System.out.println(addr);
		System.out.println(name);
		System.out.println(city);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(single);
		
		sc.close();
	}

}
