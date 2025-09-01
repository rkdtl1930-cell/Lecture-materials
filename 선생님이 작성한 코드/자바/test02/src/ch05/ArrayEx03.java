package ch05;

public class ArrayEx03 {
	public static void main(String[] args) {
		int iArray[]=new int[5];
		int sum=0;
		
		System.out.println("랜덤함수를 사용하여 1~10 사이의 난수 5개를 생성하여 저장");
		for(int i=0; i<iArray.length;i++) {
			int num=(int)(Math.random()*10)+1;
			
			boolean flag=false;
			for(int j=0; j<i; j++) {
				if(iArray[j]==num)
					flag=true;
			}
			if(flag) {
				i--;
				continue;
			}
			iArray[i]=num;
		}
		
		for(int i=0;i<iArray.length;i++) {
			System.out.println(iArray[i]);
			sum+=iArray[i];
		}
		System.out.println("평균은"+(double)sum/iArray.length);
	}
}
