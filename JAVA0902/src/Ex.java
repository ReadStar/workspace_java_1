
public class Ex {

	public static void main(String[] args) {
		/*
		 * super 키워드
		 * -this와 마찬가지로 자동 생성되며, 특정 인스턴스 주소가 저장
		 * 		=>this(나) 는 자신의 인스턴스를 가리키지만,
		 * 			super(부모)는 자신의 부모(슈퍼클래스)의 인스턴스를 가리킴
		 * -this 사용법과 동일한 방법으로 사용하며
		 * 	 super클래스에 접근하는 용도로 사용
		 * 
		 * 1. 레퍼런스 super 
		 * 		-슈퍼클래스의 인스턴스에 있는 멤버(변수, 메서드)에 접근
		 * 		-오버라이딩으로 인해 은닉된 슈퍼클래스의 변수 또는 메서드에 접근하기 위한 용도로 사용
		 * 		-기본 사용법 : super. 멤버변수 or super.메서드()
		 * 
		 */
		Employee e = new Employee("뫄뫄", 1000000);
		System.out.println(e.getEmployee());

		System.out.println("-------------------------------");
		
		Manager m = new Manager("이순신", 4000, "개발1팀");
		System.out.println(m.getEmployee());
		
		System.out.println("-------------------------------------");
		
		Engineer eg = new Engineer();
		System.out.println(eg.getEmployee());
		
		System.out.println("----------------------------------------");
		
		eg.print("강감찬");
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
//	return name + " , " + salary + " , " + depart;
	
	//슈퍼클래스인 getEmployee() 메서드에서 이미
	//이르므, 연봉을 문자열로 결합하여 리턴하므로
	//슈퍼클래스의 getEmployee()메서드를 호출한 뒤
	//부서명(depart)만 별도로 결합해도 된다
	//이 때, 슈퍼클래스의 동일한 메서드를 호출하려면
	// super.메서드명()을 통해 은닉된 메서드 호출이 가능
	return super.getEmployee()+ " , " + depart;
			
	}
}

//Engineer 클래스 정의 - Employee 클래스 상속
class Engineer extends Employee{
	//메서드와 마찬가지로 멤버변수도 슈퍼클래스와 동일한 변수 선언 시
	//슈퍼클래스의 멤버변수는 은닉되어 보이지 않게 됨
	String name = "엔지니어 이름"; // 슈퍼클래스와 동일한 멤버변수 선언
	String skill;
	@Override
	public String getEmployee() {
//		return super.getEmployee() + ", " + skill;
		//동일한 이름을 통해 부모의 변수가 은닉되면 
		//서브클래스에서 해당 변수 사용 시 서브클래스의 변수가 호출됨
//		return name + " , " + salary + " , " + skill;
		//만약, 슈퍼클래스의 은닉된 멤버변수에 접근하려면
		//super.변수명 의 형태로 부모의 은닉된 변수에 접근 가능
		return super.name + " , " + salary + " , " + skill;
	}
	//로컬변수, 멤버변수, 슈퍼클래스의 멤버변수를 각각 호출하는 방법
	//레퍼런스 this, 레퍼런스 super 사용에 따른 차이점
	public void print(String name) {
		System.out.println("name = " + name); //로컬변수
		System.out.println("this.name = " + this.name); //자신의 인스턴스
		System.out.println("super.name = " + super.name); //부모 인스턴스
	}
	public void print() {
		//메서드 내에서 변수명만 사용하거나 this.변수명 사용 시
		//모두 인스턴스 내의 멤버변수를 가리키게 됨
		System.out.println("name = " + name); //로컬변수
		System.out.println("this.name = " + this.name); //자신의 인스턴스
		System.out.println("super.name = " + super.name); //부모 인스턴스
	}
	
}