package ch04;

public class IfEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int se=9;
		
		switch(se) {
		case 3:
		case 4:
		case 5:System.out.println("봄");break;
		case 6:
		case 7:
		case 8:System.out.println("여름");break;
		case 9:
		case 10:
		case 11:System.out.println("가을");break;
		case 12:
		case 1:
		case 2:System.out.println("겨울");break;
		default:
			System.out.println("월이 아닙니다.");
		
		}
		
		if((se>=1)&&(se<=12)) {
		
			if((se==3)||(se==4)||(se==5))
				System.out.println("봄");
			else if((se==6)||(se==8)||(se==8))
				System.out.println("여름");
			else if((se==9)||(se==10)||(se==11))
				System.out.println("가을");
			else
				System.out.println("겨울");
		}else {
			System.out.println("입력오류");
		}

	}

}
