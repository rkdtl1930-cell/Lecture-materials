package ch05;

import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] eng= {"student","love","java","happy","future"};
		String[] kor= {"학생","사랑","자바","행복","미래"};
		
		while(true) {
			System.out.print("영어단어를 입력하세요>>");
			String word=sc.next();
			if(word.equals("exit")) {
				break;
			}
			//int index=-1;
			boolean flag=false;
			for(int i=0; i<eng.length; i++) {
				if(eng[i].equals(word)) {
					System.out.println(kor[i]);
					flag=true;
					//index=i;
					break;
				}
			}
			if(!flag)
				System.out.println("단어를 잘못 입력했습니다.`");
			//System.out.println(kor[index]);
		}
		System.out.println("종료합니다.....");

	}

}
