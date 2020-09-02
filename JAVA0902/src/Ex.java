
public class Ex {

	public static void main(String[] args) {
		/*
		 * super 키워드
		 * -this와 마찬가지로 자동 생성되며, 특정 인스턴스 주소가 저장
		 * 		=>this 는 자신의 인스턴스를 가리키지만,
		 * 			super는 자신의 부모(슈퍼클래스)의 인스턴스를 가리킴
		 */
		Employee e = new Employee("뫄뫄", 1000000);
		System.out.println(e.getEmployee());

		System.out.println("-------------------------------");
		
		Manager m = new Manager("이순신", 400, "개발1팀");
		System.out.println(m.getEmployee());
	}

}
/*
 * 직원(EMployee) 클래스 정의
 * -멤버변수 : 이름(name, String), 연봉(salary,.int)
 * -생성자
 * 1) 기본 생성자 - 아무 작업도 수행하지 않음
 * 2) 이름, 연봉 전달받아 초기화 하는 생성자
 * -메서드
 * 	1)getEmployee() : 파라미터 없음, 리턴타입 String
 * 		=>이름, 연봉을 문자열 결합 후 리턴
 */
class Employee{
	String name;
	int salary;
	public Employee() {
	}
public Employee(String name, int salary) {
	super();
	this.name = name;
	this.salary = salary;
}
public String getEmployee() {
	return name +" , "+ salary;
	}
}

//Manager 클래스 정의 - Employee 클래스 상속
//-멤버변수 : 부서명 (depart, String)
//-생성자 : 이름, 연봉, 부서명 전달받아 초기화 하는 생성자
// -메서드
//1)getEmployee() 메서드 오버라이딩
//		=>이름, 연봉, 부서명을 문자열로 결합 후 리턴
class Manager extends Employee{
	String depart;

public Manager(String name, int salary, String depart) {
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}
@Override
public String getEmployee() {
	// 이름, 연봉, 부서명을 문자열로 결합하여 리턴하도록 오버라이딩
	// => 현재 Manaver 클래스 내에서 더 이상 슈퍼클래스인
	// 		 Employee 클래스의 getEmployee()	메서드는 은닉된다
	return name + " , " + salary + " , " + depart;
	}
}