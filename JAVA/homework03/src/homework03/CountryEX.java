package homework03;

import java.util.*;

public class CountryEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nation = new HashMap<String, Integer>();
		System.out.println("나라이름과 인구를 입력하세요. (예 : Korea 5000)");
		while(true) {
			System.out.print("나라 이름, 인구>> ");
			String country = sc.next();
			if(country.equals("그만"))
				break;
			int population = sc.nextInt();
			nation.put(country, population);
		}
		while(true) {
			System.out.print("인구 검색 >> ");
			String s = sc.next();
			if(s.equals("그만"))
				break;
			Integer p = nation.get(s);
			if(p == null)
				System.out.println(s + " 나라는 없습니다.");
			else
				System.out.println(s+" 인구는 "+p);
			}
		System.out.println("End");
	}

}
