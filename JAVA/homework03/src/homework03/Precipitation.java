package homework03;

import java.util.*;

public class Precipitation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		while(true) {
			System.out.print("강수량 입력(0 입력 시 종료)>>");
			int p = sc.nextInt();
			if(p == 0) {
				break;
			}
			v.add(p);
			int sum = 0;
			for(int i = 0; i < v.size(); i++) {
				System.out.print(v.get(i)+" ");
				sum += v.get(i);
			}
			System.out.println();
			System.out.println("현재 평균 "+(sum/v.size()));
		}
		System.out.println("End");
	}

}
