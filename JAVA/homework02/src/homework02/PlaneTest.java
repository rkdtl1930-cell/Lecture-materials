package homework02;

public class PlaneTest extends Plane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p1 = new Plane("에어버스", "A380", 500);
		p1.display();
		Plane p2 = new Plane();
		p2.setCompany("bb");
		p2.setModel("bbb");
		p2.setMaxPassenger(300);
		System.out.println(p2.getCompany()+" "+p2.getModel()+" "+p2.getMaxPassenger());
		Plane p3 = new Plane();
		Plane p4 = new Plane();
		System.out.println(Plane.getPlanes());
	}

}
