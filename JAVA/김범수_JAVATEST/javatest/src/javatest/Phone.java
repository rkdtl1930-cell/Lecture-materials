package javatest;

public class Phone {
	private String name;
	private String tel;
	private String address;
	
	public Phone() {}
	public Phone(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println(name+"의 번호와 주소는 "+tel+", "+address+" 입니다.");
	}
	
}
