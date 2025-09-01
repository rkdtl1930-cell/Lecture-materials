package test01;

public class DoubleEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dnum=1;
		
		for(int i = 0; i < 10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
		
		System.out.println("===================================");
		
		int a = 10;
		int b = 20;
		boolean b1=a>b;
		boolean b2=a<b;
		System.out.println(b1);
		System.out.println(b2);
		
		final int cnum = 10;
		final int cnum2;
		cnum2 = 20;
//		cnum=50
//		cnum2 = 30;
		System.out.println(cnum);
		System.out.println(cnum2);
	}

}
