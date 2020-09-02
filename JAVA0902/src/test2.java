
public class test2 {
	public static void main(String[] agrs) {
		Student s = new Student("홍길동", 20, "900000-0000000", "아이티윌", "20200902");
		System.out.println(s.getInfo());
	}
}

class Person2{
	String name;
	int age;
	String jumin;
	public Person2(String name, int age, String jumin) {
		super(); //슈퍼클래스 Object 의 기본생성자 호출코드(생략 가능)
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}
	//메서드 정의 
	//이름, 나이, 주민번호를 문자열로 결합 후 리턴하는 getInfo()메서드 정의
	public String getInfo() {
		return name + ", " + age + " , " + jumin;
	}
}

/*
* Student 클래스 정의
* -멤버변수 :학교명(schoolName, 문자열), 학번(schoolId, 문자열)
*-생성자 : 이름, 나이, 주민번호, 학교명, 학번을 전달받아 초기화
*-메서드 : getInfo() 메서드 오버라이딩
*				=>이름, 나이, 주민번호, 학교명, 학번을 결합 후 리턴
*/

class Student extends Person2{
	String schoolName;
	String schoolId;
	//파라미터 생성자 정의
	public Student(String name, int age, String jumin, String schoolId, String schoolName) {
		//슈퍼클래스의 파라미터 생성자를 호출하여 멤버변수 대신 초기화
		super(name, age, jumin);
		//서브크래스의 멤버변수만 직접 초기화
		this.schoolId = schoolId;
		this.schoolName = schoolName;
	}
	
	//getInfo() 메서드 오버라이딩
	@Override
	public String getInfo() {
		return super.getInfo() + ", " + schoolName + ", " + schoolId;
	}
	
}