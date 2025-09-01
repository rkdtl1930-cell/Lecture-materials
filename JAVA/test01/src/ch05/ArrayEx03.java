package ch05;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iArray[][]= {{1,2,3,4,5},{10,20,30,40,50}};
		System.out.println(iArray[0][0]);
		System.out.println(iArray.length);
		System.out.println(iArray[0].length);
		System.out.println(iArray[0]);
		
		for(int i=0; i<iArray.length; i++) {
			for(int j=0; j<iArray[i].length; j++) {
				System.out.print(iArray[i][j]+" ");
			}
			System.out.println();
		}
	}

}
