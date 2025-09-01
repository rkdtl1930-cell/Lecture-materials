package ch05;


public class ArrayEx08 {
	
	static int[] makeArray() {
		int[] temp= {1,2,3,4,5};
		return temp;
	}
	static void displayArray(int[] intArray) {
		for(int k:intArray) {
			System.out.println(k);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayEx08 aa=new ArrayEx08();
		int[] iArray=makeArray();
		displayArray(iArray);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);

	}

}
