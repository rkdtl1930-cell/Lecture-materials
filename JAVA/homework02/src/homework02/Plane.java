package homework02;

public class Plane {
	private String company;
	private String model;
	private int maxPassenger;
	private static int planes = 0;
	
	
	public Plane() {
		planes++;
	}
	public Plane(String company, String model, int maxPassenger) {
		this.company = company;
		this.model = model;
		this.maxPassenger = maxPassenger;
		planes++;
	}
	public Plane(String company) {
		this.company = company;
	}
	public Plane(String company, String model) {
		this.company = company;
		this.model = model;
	}
	public void display() {
		System.out.println("제작사 : "+company+", 모델 : "+model+", 최대 승객수 : "+maxPassenger);
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxPassenger() {
		return maxPassenger;
	}
	public void setMaxPassenger(int maxPassenger) {
		this.maxPassenger = maxPassenger;
	}
	public static int getPlanes() {
		return planes;
	}
	
}
