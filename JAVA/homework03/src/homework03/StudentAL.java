package homework03;

import java.util.*;

public class StudentAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> s = new ArrayList<>();
		Student[] st = new Student[5];
		System.out.println("학생이름, 학과, 학번, 학점평균을 입력하세요.");
		for(int i = 0; i < 5;i++) {
			System.out.print(">> ");
			String name = sc.next();
			String major = sc.next();
			int sno = sc.nextInt();
			double p_avg = sc.nextDouble();
			st[i] = new Student(name, major, sno, p_avg);
			s.add(st[i]);
		}
		for(int i = 0; i < s.size(); i++ ) {
			Student s1 = s.get(i);
			System.out.println("----------------");
			s1.display();
		}
		System.out.println("----------------");
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			boolean flag = false;
			for(int i = 0; i < s.size(); i++) {
				Student s1 = s.get(i);
				if(name.equals(s1.getName())) {
					System.out.println(s1);
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println("찾는 학생이 없습니다.");
			}
		}
		System.out.println("End");
	}

}
