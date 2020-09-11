
public class Exam0911 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor =100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
		
		System.out.println("------------------------------------------------------");
		
		Student s2 = new Student("홍길동", 1, 1, 100, 60, 76);
		System.out.println(s2.info());
	}

}
class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	public int getTotal() {
		return kor + eng + math;
	}
	public double getAverage() {
		return (double)getTotal()/3;
	}
	public Student() {}
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String info() {
		return name + "," + ban + "," + no + "," + kor +","+eng+","+math;
	}
	
}
//오버라이딩
//자식 클래스가 부모클래스에게 메서드를 상속받아 재정의 하는
//서브클래스의 인스턴스에서 슈퍼클래스의 메서드는 은닉됨
//규칙
//1. 메서드 시그니처(이름, 파라미터, 리턴타입)이 동일해야함
//2. 접근제한자는 좁아질 수 없다.
//	(Privat < default < Protected < Public)

//상속
//서브클래스가 슈퍼클래스에게 메서드를 상속받아 재정의하고 사용
//