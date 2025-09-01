package ch05;

public class ArrayEx04 {

	static int[] makeArray() {
		int[] temp = {1,2,3,4,5};
		return temp;
	}
	static void displayArray(int[] iArray) {
		for(int k : iArray) {
			System.out.println(k);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArray = makeArray();
		displayArray(iArray);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}

}
