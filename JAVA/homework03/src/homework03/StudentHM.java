package homework03;

import java.util.*;

public class StudentHM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Student> map = new HashMap<>();
		System.out.println("학생이름, 학과, 학번, 학점평균을 입력하세요.");
		for(int i = 0; i < 5;i++) {
			System.out.print(">> ");
			String name = sc.next();
			String major = sc.next();
			int sno = sc.nextInt();
			double p_avg = sc.nextDouble();
			Student s = new Student(name, major, sno, p_avg);
			map.put(name, s);
		}
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Student s = map.get(key);
			System.out.println("----------------");
			System.out.println("이름 : "+s.getName());
			System.out.println("학과 : "+s.getMajor());
			System.out.println("학번 : "+s.getSno());
			System.out.println("학점 평균 : "+s.getAvg());
		}
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			boolean flag = map.containsKey(name);
			if(flag)
				System.out.println(map.get(name));
			else
				System.out.println("찾는 학생이 없습니다.");
		}
		System.out.println("End");
	}

}
