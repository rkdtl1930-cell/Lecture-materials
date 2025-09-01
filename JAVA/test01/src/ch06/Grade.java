package ch06;

import java.util.Scanner;

public class Grade {
	int sno;
	String name;
	int korean;
	int english;
	int math;
	int average;
	int rank=1;
	public Grade() {}
	public Grade(int sno, String name, int korean, int english, int math) {
		this.sno = sno;
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	public void setAvg() {
		average=(this.korean+this.english+this.math)/3;
	}
	public void setRank(Grade g) {
		if(g.average>this.average) {
			rank++;
		}
	}
	public void display() {
		System.out.println(sno+" "+name+" "+korean+" "+english+" "+math+" "+average+" "+rank);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Grade[] g = new Grade[5];
		for(int i=0; i<g.length; i++) {
			System.out.println("학번, 이름, 국어점수, 영어점수, 수학점수를 입력하세요.");
			int sno = sc.nextInt();
			String name = sc.next();
			int korean = sc.nextInt();
			int english = sc.nextInt();
			int math = sc.nextInt();
			g[i] = new Grade(sno, name, korean, english, math);
			g[i].setAvg();
		}
		for(int i=0; i<g.length; i++) {
			for(int j=0; j<g.length; j++) {
				g[i].setRank(g[j]);
			}
		}
		for(Grade k:g) {
			k.display();
		}
	}

}
