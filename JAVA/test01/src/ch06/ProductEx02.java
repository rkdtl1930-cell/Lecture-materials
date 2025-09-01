package ch06;

public class ProductEx02 {
	static void func(Product[] ps) {
		System.out.println("func 내부");
		ps[0].setPrice(30000);
		for(Product p : ps) {
			p.display();
		}
	}
	static void func1(int num) {
		System.out.println("func 내부");
		num ++;
		System.out.println(num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		func1(num);
		System.out.println("func1 호출 후 메인함수의 num");
		System.out.println(num);
		
		
		Product[] products = new Product[3];
		products[0] = new Product(1,"마이크",20000,"삼성"); 
		products[1] = new Product(2,"키보드",20000,"LG"); 
		products[2] = new Product(3,"마우스",5000,"삼성"); 
		
		for(Product p:products) {
			p.display();
		}
		func(products);
		System.out.println("변경 후 메인");
		for(Product p:products) {
			p.display();
		}
	}

}
