package ch04;

public class ForEx05 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=-5; j<=5; j++) {
				if(Math.abs(j)<=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
