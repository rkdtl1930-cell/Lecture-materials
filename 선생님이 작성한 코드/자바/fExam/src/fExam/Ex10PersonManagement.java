package fExam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.gender = "Unknown";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getter/Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    // 출력용 메소드
    public String getInfo() {
        return name + "\t" + age + "\t" + gender;
    }
}

// Student 클래스
class Student extends Person {
    private String studentID;
    private String major;

    public Student(String name, int age, String gender, String studentID, String major) {
        super(name, age, gender);
        this.studentID = studentID;
        this.major = major;
    }

    public String getStudentID() { return studentID; }
    public void setStudentID(String studentID) { this.studentID = studentID; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    @Override
    public String getInfo() {
        return super.getInfo() + "\t" + studentID + "\t" + major;
    }
}

// Professor 클래스
class Professor extends Person {
    private String professorID;
    private String department;

    public Professor(String name, int age, String gender, String professorID, String department) {
        super(name, age, gender);
        this.professorID = professorID;
        this.department = department;
    }

    public String getProfessorID() { return professorID; }
    public void setProfessorID(String professorID) { this.professorID = professorID; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String getInfo() {
        return super.getInfo() + "\t" + professorID + "\t" + department;
    }
}

public class Ex10PersonManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        ArrayList<Person> list = new ArrayList<>();
	        HashMap<String, ArrayList<Person>> map = new HashMap<>();
	        boolean run = true;

	        while (run) {
	            System.out.print("1. 데이터입력 | 2. 데이터조회 | 3. 전체데이터출력 | 4. 종료 >> ");
	            String choice = sc.nextLine();

	            switch (choice) {
	                case "1":
	                    while (true) {
	                        System.out.print("객체 종류 선택 (1. Student, 2. Professor) >> ");
	                        String type = sc.nextLine();
	                        if (type.equals("그만")) break;

	                        if (type.equals("1")) {
	                            System.out.print("이름, 나이, 성별, 학번, 전공 입력 >> ");
	                            String[] data = sc.nextLine().split(",");
	                            if (data.length != 5) {
	                                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
	                                continue;
	                            }
	                            String name = data[0].trim();
	                            int age = Integer.parseInt(data[1].trim());
	                            String gender = data[2].trim();
	                            String studentID = data[3].trim();
	                            String major = data[4].trim();

	                            Student student = new Student(name, age, gender, studentID, major);
	                            list.add(student);
	                            map.computeIfAbsent(name, k -> new ArrayList<>()).add(student);

	                        } else if (type.equals("2")) {
	                            System.out.print("이름, 나이, 성별, 교수번호, 학과 입력 >> ");
	                            String[] data = sc.nextLine().split(",");
	                            if (data.length != 5) {
	                                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
	                                continue;
	                            }
	                            String name = data[0].trim();
	                            int age = Integer.parseInt(data[1].trim());
	                            String gender = data[2].trim();
	                            String professorID = data[3].trim();
	                            String department = data[4].trim();

	                            Professor professor = new Professor(name, age, gender, professorID, department);
	                            list.add(professor);
	                            map.computeIfAbsent(name, k -> new ArrayList<>()).add(professor);

	                        } else {
	                            System.out.println("잘못된 선택입니다.");
	                        }
	                    }
	                    break;

	                case "2":
	                    while (true) {
	                        System.out.print("검색할 이름 입력 >> ");
	                        String name = sc.nextLine();
	                        if (name.equals("그만")) break;

	                        ArrayList<Person> persons = map.get(name);
	                        if (persons == null) {
	                            System.out.println("검색 결과가 없습니다.");
	                        } else {
	                            for (Person p : persons) {
	                                System.out.println(p.getInfo());
	                            }
	                        }
	                    }
	                    break;

	                case "3":
	                    for (Person p : list) {
	                        System.out.println(p.getInfo());
	                    }
	                    break;

	                case "4":
	                    System.out.println("프로그램 종료");
	                    run = false;
	                    break;

	                default:
	                    System.out.println("잘못된 선택입니다.");
	            }
	        }
	        sc.close();

	}

}
