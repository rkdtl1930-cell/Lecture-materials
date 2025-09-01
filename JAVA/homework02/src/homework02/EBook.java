package homework02;

public class EBook extends Book {
	private int service_time;
	private int service_machines;
	
	public EBook() {}
	public EBook(String title, String author, String publisher, String sort, int service_time, int service_machines) {
		super(title, author, publisher, sort);
		this.service_time = service_time;
		this.service_machines = service_machines;
	}
	public int getService_time() {
		return service_time;
	}
	public void setService_time(int service_time) {
		this.service_time = service_time;
	}
	public int getService_machines() {
		return service_machines;
	}
	public void setService_machines(int service_machines) {
		this.service_machines = service_machines;
	}
	@Override
	public String toString() {
		return getTitle()+" "+getAuthor()+" "+getPublisher()+" "+getSort()+" "+service_time + " " + service_machines;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook e1 = new EBook("82년 김지영", "조남주", "민읍사", "소설", 30, 5);
		EBook e2 = new EBook("파리아파트", "기욤 뭐소", "밝은세상", "소설", 30, 5);
		System.out.println(e1);
		System.out.println(e2);
	}
}
