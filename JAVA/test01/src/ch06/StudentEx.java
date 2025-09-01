package ch06;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Student.sno);
		Student s1 = new Student();
		s1.display();
		s1.setName("홍길동");
		s1.setMajor("컴공");
		s1.display();
		
		Student s2 = new Student("김길동","멀티미디어");
		s2.display();
		Student s3 = new Student("이길동","IT융합");
		s3.display();
		Student s4 = new Student("박길동","멀티미디어");
		s4.display();
		
		s1.setMajor("인공지능 개발");
		System.out.println(s1.getName()+"의 전공이 "+s1.getMajor()+"로 변경되었습니다.");
	}

}
