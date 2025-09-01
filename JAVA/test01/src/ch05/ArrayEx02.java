package ch05;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		int num=(int)(Math.random()*100)+1;
		System.out.println(num);
		
		// TODO Auto-generated method stub
		int[] intArray = {1,2,3,4,5};
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		int[] myArray=intArray;
		for(int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		myArray[1]=100;
		System.out.println(intArray[1]);
		System.out.println(myArray[1]);
		
//		intArray[5]=6;
		int ia[]=new int[3];
		ia[0]=10;
		
		
	}

}
