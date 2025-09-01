package homework02;

public class Book {
	private String title;
	private String author;
	private String publisher;
	private String sort;
	
	public Book() {}
	public Book(String title, String author, String publisher, String sort) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.sort = sort;
	}
	public Book(String title) {
		this.title = title;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public String getSort() {
		return sort;
	}


	public void setSort(String sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return title + " " + author + " " + publisher + " " + sort + " ";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("82년생 김지영", "조남주", "민읍사", "소설");
		Book b2 = new Book("파리아파트", "기욤 뭐소", "밝은세상", "소설");
		Book b3 = new Book("자료구조", "이자료", "DB출판사", "컴퓨터/IT");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
