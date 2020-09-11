 
public class test2 {
 
	public static void main(String[] args) {
//		Employee emp = new Employee("1111", "홍길동", 4000);
//		System.out.println("----- Employee -----");
//		emp.calcSalary();
//		Manager man = new Manager("222", "이순신", 5000, "영업팀");
//		System.out.println("----- Manager -----");
//		man.calcSalary();
//		Engineer eng = new Engineer("333", "강감찬", 3000, 3);
//		System.out.println("----- Engineer -----");
//		eng.calcSalary();
		Employee emp = new Employee("1111", "홍길동", 4000);
		System.out.println("----- Employee -----");
		emp.calcSalary(emp);
		Manager man = new Manager("222", "이순신", 5000, "영업팀");
		System.out.println("----- Manager -----");
		man.calcSalary(man);
		Engineer eng = new Engineer("333", "강감찬", 3000, 3);
		System.out.println("----- Engineer -----");
		eng.calcSalary(eng);
	}
 
}
 
// 사원(Employee) 클래스
class Employee {
	String id; // 사원 번호
	String name; // 사원 이름
	int salary; // 연봉
	// 사원번호와 이름을 전달받아 초기화하는 생성자 Employee() 정의
	public Employee(String id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	// 사원 정보(사원번호, 이름)를 문자열로 결합하여 리턴하는
	// getEmployee() 메서드 정의
	public String getEmployee() {
		return id + ", " + name + ", " + salary;
	}
	// 1. 메서드 오버라이딩을 통해 각 클래스에서 따로 연봉 계산할 경우
	// 연봉을 계산하는 calcSalary() 메서드 정의
	public void calcSalary() {
		System.out.println("연봉 : " + salary);
	}
	// 2. 슈퍼클래스인 Employee 에서 모든 직원의 연봉을 다 계산할 경우
	// => 메서드 하나로 Employee, Manager, Engineer 인스턴스를
	//    모두 전달받아야 하므로 업캐스팅 활용
	public void calcSalary(Employee emp) {
		// Employee 타입으로 업캐스팅 할 경우
		// Manager, Engineer 클래스에 선언된 멤버에 접근이 불가능해짐
		// => Employee 에서 상속된 공통 멤버에만 접근 가능
		// 따라서 다운캐스팅을 통해 상세 멤버에 접근할 수 있어야함
		// => instanceof 연산자를 사용하여 Employee, Manager, Engineer 판별
		// 주의사항!!
		// instanceof 연산자를 사용하여 형변환 가능 여부 판별 시
		// 슈퍼클래스 타입보다 서브클래스 타입을 먼저 판별해야함		      
		if(emp instanceof Manager) {
			// 매니저(Manager)의 연봉 계산 => 다운캐스팅 필요
			Manager m = (Manager)emp;
			System.out.println("관리 부서 : " + m.depart + " 에 따른 연봉 계산");
			// ex) depart 가 "영업팀" 일 경우 보너스 50% 향상 등 수행
			System.out.println("매니저의 연봉 : " + salary);
		} else if(emp instanceof Engineer) {
			// 엔지니어(Engineer)의 연봉 계산 => 다운캐스팅 필요
			Engineer e = (Engineer)emp;
			System.out.println("자격증 갯수 : " + e.certCount + " 에 따른 연봉 계산");
			// ex) certCount 갯수 * 10만원의 보너스 추가
			System.out.println("엔지니어의 연봉 : " + salary);
		} else if(emp instanceof Employee) { // 가장 마지막에 판별해야함
			// 일반 사원(Employee)의 연봉 계산
			System.out.println("연봉 : " + salary);
		}
	}
}
 
// 매니저(Manager) 클래스 정의 - Employee 클래스 상속
// 멤버변수 : 관리부서명(depart, 문자열)
// 사원번호, 이름, 관리부서명을 전달받아 초기화하는 생성자 Manager() 정의
// 사원정보(사원번호, 이름, 부서명)를 문자열로 결합하여 리턴하는
// getEmployee() 메서드 오버라이딩
class Manager extends Employee {
	String depart;
 
	public Manager(String id, String name, int salary, String depart) {
		super(id, name, salary); // 슈퍼클래스의 생성자 호출하여 대신 초기화
		// => 슈퍼클래스 Employee 에 기본 생성자가 없으므로
		//    파라미터 생성자를 명시적으로 호출하지 않으면 오류 발생!
		this.depart = depart;
	}
 
//	@Override
//	public String getEmployee() {
//		// 오버라이딩으로 인해 은닉된 슈퍼클래스의 메서드를 호출하려면
//		// 레퍼런스 super 를 통해 접근(super.메서드명())
//		return super.getEmployee() + ", " + depart;
//	}
 
	// 1. 메서드 오버라이딩을 통해 각 클래스에서 따로 연봉 계산할 경우
	@Override
	public void calcSalary() {
		System.out.println("관리 부서 : " + depart + " 에 따른 연봉 계산");
		// ex) depart 가 "영업팀" 일 경우 보너스 50% 향상 등 수행
		System.out.println("매니저의 연봉 : " + salary);
	}
}
 
// 엔지니어(Engineer) 클래스 정의 - Employee 상속
class Engineer extends Employee {
	int certCount; // 자격증 갯수
 
	public Engineer(String id, String name, int salary, int certCount) {
		super(id, name, salary); // 슈퍼클래스의 생성자 호출하여 대신 초기화
		// => 슈퍼클래스 Employee 에 기본 생성자가 없으므로
		//    파라미터 생성자를 명시적으로 호출하지 않으면 오류 발생!
		this.certCount = certCount;
	}
 
	@Override
	public String getEmployee() {
		// 오버라이딩으로 인해 은닉된 슈퍼클래스의 메서드를 호출하려면
		// 레퍼런스 super 를 통해 접근(super.메서드명())
		return super.getEmployee() + ", " + certCount;
	}
	// 1. 메서드 오버라이딩을 통해 각 클래스에서 따로 연봉 계산할 경우
	@Override
	public void calcSalary() {
		System.out.println("자격증 갯수 : " + certCount + " 에 따른 연봉 계산");
		// ex) certCount 갯수 * 10만원의 보너스 추가
		System.out.println("엔지니어의 연봉 : " + salary);
	}
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 