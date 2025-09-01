package ch05;

public class ArrayEx04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArray=new int[10];
		for(int i=0; i<iArray.length; i++) {
			int num=(int)(Math.random()*20)+1;
			boolean flag=false;
			for(int j=0; j<i; j++) {
				if(iArray[j]==num) {
					flag=true;
					break;
				}
			}
			if(flag) {
				i--;
				continue;
			}
			iArray[i]=num;
			System.out.print(iArray[i]+" ");
		}
		System.out.println();
		for(int n:iArray) {
			if(n%3==0)
				System.out.println(n+" ");
		}
		//for(int i=0; i<iArray.length; i++) {
		//	if(iArray[i]%3==0)
		//		System.out.print(iArray[i]+" ");
		//}
		System.out.println();

	}

}
