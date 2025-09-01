package homework03;

import java.util.*;

class Word{
	private String eng;
	private String kor;
	public Word() {}
	public Word(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getKor() {
		return kor;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
	
}

public class WordEx {
	static Scanner sc;
	static Vector<Word> v;
	static Random rand = new Random();
	static int[] question = new int[4];
	static final int Max_Choice = 4; // 보기 갯수
	
	static void test() {
		System.out.println("현재 "+v.size()+"개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");
		while(true) {
			setQuestion();
			int answerNum = rand.nextInt(4);
			int answerIndex = question[answerNum]; // 정답 번호의 숫자 구하기
			
			System.out.println(v.get(answerIndex).getEng() + "?"); // 질문
			
			for(int i = 0; i < question.length; i++) {
				System.out.print("("+(i+1)+")");	// i는 인덱스값이여서 0부터이므로 보기는 1부터 하기위해 i+1
				System.out.print(v.get(question[i]).getKor() + " ");
			}
			System.out.print(">> ");
			
			int choice = sc.nextInt();
			if(choice == -1)
				break;
			else if(choice-1 == answerNum) {
				System.out.println("Excellent !!");
			}
			else {
				System.out.println("No !!");
			}
		}
		System.out.println("영어단어 테스트를 종료합니다.");
	}
	
	static void input() {
		System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
		while(true) {
			System.out.print("영어 한글 입력>> ");
			String eng = sc.next();
			if(eng.equals("그만"))
				break;
			String kor = sc.next();
			v.add(new Word(eng, kor));
		}
	}
	
	static void setQuestion() {
		for(int i=0; i<Max_Choice ; i++) {
			question[i] = rand.nextInt(v.size());
			for(int j=0; j<i ; j++) {
				if(question[i] == question[j]) { // 같은 보기가 나오면 다시 앞으로 보냄
					i--;
					continue;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		v = new Vector<>();
//		v.add(new Word("", ""));
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("picture", "그림"));
		v.add(new Word("emotion", "감정"));
		v.add(new Word("baby", "아기"));
		v.add(new Word("error", "오류"));
		v.add(new Word("society", "사회"));
		v.add(new Word("doll", "인형"));
		v.add(new Word("bear", "곰"));
		v.add(new Word("example", "보기"));
		v.add(new Word("deal", "거래"));
		v.add(new Word("photo", "사진"));
		v.add(new Word("human", "인간"));
		v.add(new Word("statue", "조각상"));
		v.add(new Word("eye", "눈"));
		v.add(new Word("hand", "손"));
		v.add(new Word("ant", "개미"));
		System.out.println("********** 영어 단어 테스트 프로그램 ************");
		System.out.println("영어단어의 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		while(true) {
			System.out.print("단어 테스트 :1, 단어 삽입 :2, 종료 :3 >> ");
			int num = sc.nextInt();
			if(num == 3) {
				break;
			}
			switch(num) {
			case 1 :
				test();
				break;
			case 2 :
				input();
				break;
			default :
				System.out.println("입력 오류");
			}
		}
		System.out.println("영어단어 게임 종료합니다.");
	}

}
