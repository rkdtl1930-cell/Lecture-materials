package ch06;

public class Book {

	String title;
	String author;
	void show() {
		System.out.println(title+" "+author);
	}
	public Book() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	public Book(String t) {
		title = t;
		author = "작자미상";
	}
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		Book emptyBook = new Book();
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author); 
	}

}
