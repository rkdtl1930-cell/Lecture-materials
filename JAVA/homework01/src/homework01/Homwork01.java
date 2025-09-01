package homework01;

import java.util.Scanner;

public class Homwork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		// p87. 5번 문제
		System.out.print("논리 연산을 입력하세요>>");
		boolean a = sc.nextBoolean();
		String op = sc.next();
		boolean b = sc.nextBoolean();
		switch(op){
			case "AND" :
				System.out.println(b);
				break;
			case "OR" : 
				System.out.println(a);
				break;
		}
		
		// p88. 6번 문제
		System.out.print("돈의 액수를 입력하세요>>");
		int i1=sc.nextInt();
		int ft = i1/50000;
		int i2 = i1%50000;
		int tt = i2/10000;
		int i3 = i2%10000;
		int th = i3/1000;
		int i4 = i3%1000;
		int fh = i4/500;
		int i5 = i4%500;
		int h = i5/100;
		int i6 = i5%100;
		int ten = i6/10;
		int i7 = i6%10;
		int one = i7;
		System.out.println("오만원"+ft+"개, 만원"+tt+"개, 천원"+th+"개, 500원"+fh+"개, 100원"+h+"개, 10원"+ten+"개, 1원"+one+"개");
		
		// p88. 7번 문제
		System.out.print("학점을 입력하세요>>");
		String grade = sc.next();
		switch(grade) {
			case "A" :
				System.out.println("Excellent");
				break;
			case "B" :
				System.out.println("Excellent");
				break;
			case "C" :
				System.out.println("Good");
				break;
			case "D" :
				System.out.println("Good");
				break;
			case "F" :
				System.out.println("Bye");
				break;
		}
		
		// p88. 8번 문제 - 1 if 문을 활용하기
		System.out.print("커피 주문하세요>>");
		String coffee = sc.next();
		int num = sc.nextInt();
		int p = 1;
		if(coffee.equals("에스프레소")) {
			p = num*2000;
		}
		else if(coffee.equals("아메리카노")) {
			p = num*2500;
		}
		else if(coffee.equals("카푸치노")) {
			p = num*3000;
		}
		else if(coffee.equals("카페라떼")) {
			p = num*3500;
		}
		System.out.println(p+"원입니다.");
		// p88. 8번 문제 - 2 switch 문을 활용하기
		System.out.print("커피 주문하세요>>");
		String coffee2 = sc.next();
		int num2 = sc.nextInt();
		int p2 = 1;
		switch(coffee2) {
			case "에스프레소" :
				p2 = num2*2000;
				break;
			case "아메리카노" :
				p2 = num2*2500;
				break;
			case "카푸치노" :
				p2 = num2*3000;
				break;
			case "카페라떼" :
				p2 = num2*3500;
				break;
		}
		System.out.println(p2+"원입니다.");
		
		// p88. 9번 문제
		System.out.print("1~99 사이의 정수를 입력하세요>>");
		int in = sc.nextInt();
		int fir = in/10;
		int sec = in%10;
		if(fir!=0) { // 0%3==0 이므로 문제가 생김
			if(sec!=0) {
				if(fir%3==0 && sec%3==0)
					System.out.println("박수짝짝");
				else if(fir%3==0 && sec%3!=0)
					System.out.println("박수짝");
				else if(fir%3!=0 && sec%3==0)
					System.out.println("박수짝");
				else if(fir%3!=0 && sec%3!=0)
					System.out.println("박수없음");
			}
			else if(sec==0) {
				if(fir%3==0)
					System.out.println("박수짝");
				else if(fir%3!=0)
					System.out.println("박수없음");
			}
		}
		else if(fir==0) {
			if(sec%3==0)
				System.out.println("박수짝");
			else if(sec%3!=0)
				System.out.println("박수없음");
		}
		
		// p88. 10번 문제
		System.out.print("커피 주문하세요>>");
		String coffee3 = sc.next();
		int num3 = sc.nextInt();
		int p3 = 1;
		if(coffee3.equals("에스프레소")) {
			if(num3<10)
				p3 = num3*2000;
			else if(num3>=10)
				p3 = num3*1900;
		}
		else if(coffee3.equals("아메리카노")) {
			if(num3<10)
				p3 = num3*2500;
			if(num3>=10)
				p3 = num3*2375;
		}
		else if(coffee3.equals("카푸치노")) {
			if(num3<10)
				p3 = num3*3000;
			if(num3>=10)
				p3 = num3*2850;
		}
		else if(coffee3.equals("카페라떼")) {
			if(num3<10)
				p3 = num3*3500;
			if(num3>=10)
				p3 = num3*3325;
		}
		System.out.println(p3+"원입니다.");
		
		// *로 마름모 모양 만들기
		int line = 6;
		int maxWidth = 2*line -1;
		for(int i=0; i<line; i++) {
			for(int j = line-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int j = 0 ; j < 2*i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < line-1 ; i++) {
			for(int j = 0; j < i+1 ; j++ ) {
				System.out.print(" ");
			}
			for(int k = maxWidth-2 ; k > 2*i ; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
