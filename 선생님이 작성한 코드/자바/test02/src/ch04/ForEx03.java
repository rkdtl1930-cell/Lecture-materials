package ch04;

public class ForEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10; i>=5;i--) {
			for(int j=i; j>=(i-5);j--) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}

}
