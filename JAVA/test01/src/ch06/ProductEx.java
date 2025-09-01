package ch06;

public class ProductEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.setPno(1);
		p1.setName("컴퓨터");
		p1.setPrice(100);
		p1.setCompany("LG");
		System.out.println(p1.getName()+"의 가격은 "+p1.getPrice()+" 입니다");
		p1.display();
		
		Product p2 = new Product(2, "연필");
		p2.setPrice(200);
		p2.setCompany("동화");
		p2.display();
		
		Product p3 = new Product(3, "노트", 100, "문화");
		p3.display();
	}

}
