package homework03;

public class Student {
	private String name;
	private String major;
	private int sno;
	private double p_avg;
	public Student () {}
	
	public Student(String name, String major, int sno, double p_avg) {
		super();
		this.name = name;
		this.major = major;
		this.sno = sno;
		this.p_avg = p_avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public double getAvg() {
		return p_avg;
	}

	public void setAvg(double p_avg) {
		this.p_avg = p_avg;
	}
	
	public String toString() {
		return name+", "+major+", "+sno+", "+p_avg;
	}
	public void display() {
		System.out.println("이름 : "+name);
		System.out.println("학과 : "+major);
		System.out.println("학번 : "+sno);
		System.out.println("학점 평균 : "+p_avg);
	}

}
