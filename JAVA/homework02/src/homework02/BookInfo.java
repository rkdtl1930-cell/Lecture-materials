package homework02;

import java.util.Scanner;

//데이터 크기 10으로 만들기 배열로
public class BookInfo {
	static Scanner sc;
	static int cnt = 0;
	static void input(Book[] b) {
		System.out.print("책의 종류 선택 (1. 종이책, 2. E_book) >> ");
		int num = sc.nextInt();
		switch(num) {
		case 1 :
			System.out.print("책제목 입력 >> ");
			sc.nextLine();
			String title = sc.nextLine();
			System.out.print("저자 입력 >> ");
			String author = sc.next();
			System.out.print("출판사 입력 >> ");
			sc.nextLine();
			String publisher = sc.nextLine();
			System.out.print("분류 입력 >> ");
			String sort = sc.next();
			b[cnt] = new Book(title, author, publisher, sort);
			cnt++;
			break;
		case 2 :
			System.out.print("책제목 입력 >> ");
			sc.nextLine();
			title = sc.nextLine();
			System.out.print("저자 입력 >> ");
			author = sc.next();
			System.out.print("출판사 입력 >> ");
			sc.nextLine();
			publisher = sc.nextLine();
			System.out.print("분류 입력 >> ");
			sort = sc.next();
			System.out.print("유효기간 입력 >> ");
			int service_time = sc.nextInt();
			System.out.print("사용기기수 입력 >> ");
			int service_machines = sc.nextInt();
			b[cnt] = new EBook(title, author, publisher, sort, service_time, service_machines);
			cnt++;
			break;
		default :
			System.out.println("입력 오류");
		}
	}
	static void search(Book[] b) {
		sc.nextLine();
		System.out.print("검색할 책제목 입력 >> ");
		String title = sc.nextLine();
		boolean flag = false;
		for(int i = 0 ; i<cnt ; i++) {
			if(b[i].getTitle().equals(title)) {
				System.out.println(b[i].toString());
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("찾는 값이 없습니다.");
		}
	}
	static void allShow(Book[] b) {
		for(int i=0; i<cnt; i++) {
			System.out.println(b[i].toString());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		Book[] books = new Book[10];
		boolean flag = false;
		while(true) {
			System.out.print("1. 데이터입력 | 2. 데이터조회 | 3. 전체데이터출력 | 4. 종료 >> ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				input(books);
				break;
			case 2:
				search(books);
				break;
			case 3:
				allShow(books);
				break;
			case 4:
				flag = true;
				break;
			}
			if(flag)
				break;
		}
		System.out.println("프로그램 종료");
	}

}
