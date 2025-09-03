package exma03;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class RainfallEx {
	
	public static void print(Vector<Integer> v) {
		int sum = 0;
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.print(n + " ");
			sum += n;
		}
		System.out.println();
		System.out.println("현재 평균 " + sum/v.size());		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			int n = scanner.nextInt();
			if(n == 0) 
				break;
			v.add(n);
			print(v);
		}
		
		scanner.close();
		System.out.println("종료");

	}

}
