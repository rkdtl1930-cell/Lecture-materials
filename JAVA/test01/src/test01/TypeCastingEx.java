package test01;

public class TypeCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=3.5f;
		double d=3.5;
		char ch='a';
//		i=b;
		b=(byte)i;
		
		System.out.println(i+f);
		System.out.println((int)ch);
		
	}

}
