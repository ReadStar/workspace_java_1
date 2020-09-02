
public class Ex2 {

	public static void main(String[] args) {
		/*
		 *super 키워드 사용법
		 *2. 생성자 super()
		 * 		-	서브 클래스의 생성자에서는 묵시적으로 슈퍼클래스의
		 *			기본생성자를 자동으로 호출함
		 *			=>이 때, 슈퍼클래스에 기본생성자 없이, 파라미터 생성자만 존재할 경우
		*				서브클래스의 생성자에서 기본 생성자를 호출하면 오류 발생하게 됨
		*			해결책 1) 슈퍼클래스에 기본생성자를 명시적으로 정의
		*			해결책 2) 슈퍼클래스의 파라미터 생성자를 명시적으로 호출
		*							=>생성자 super()를 통해 파라미터 생성자 호출 가능
		*		- 생성자 super() 를 사용하여 슈퍼클래스 생성자를 호출하면
		*		   슈퍼클래스의 멤버변수는 슈퍼클래스가, 서브클래스의 멤버변수는
		*		   서브클래스가 초기화 하게 되어, 초기화 코드 중복을 제거하게 됨
		*			=> 생성자 this()와 사용 용도가 동일함
		*		- 생성자 this()처럼 생성자 내의 첫번째 라인에서 호출이 필수적
		*			=>따라서, 생성자 this()와 생성자 super()는 동시에 사용이 불가
		 *
		 * 
		 */
	}

}

class Employee2{
	String name;
	int salary;

public Employee2(String name, int salary) {
	super();
	this.name = name;
	this.salary = salary;
}
public String getEmployee() {
	return name +" , "+ salary;
	}
}

class Manager2 extends Employee2{
	String depart;
	//파라미터 생성자를 하나라도 정의할 경우
	//컴파일러에 의해 기본 생성자가 자동으로 정의되지 않는다
public Manager2(String name, int salary, String depart) {
	//서브클래스의 생성자(기본생성자 포함) 내에서는 묵시적으로
	//슈퍼클래스의 기본생성자를 자동으로 호출(super())하게 됨
	//=>이 때, 슈퍼클래스에 기본생성자 없이, 파라미터 생성자만 존재할 경우
	//		서브클래스의 생성자에서 기본 생성자를 호출하면 오류 발생하게 됨
//	 super(); //슈퍼클래스를 명시적으로 호출
		super(name, salary);
		//=>슈퍼클래스의 파라미터 생성자에서 멤버변수를 초기화하므로
		//		서브클래스의 멤버변수만 직접 초기화 하면 됨 => 코드 중복 제거
		// 생성자 super 보다 윗쪽에 코드가 올 수 없다
//		this.name = name;
//		this.salary = salary;
		this.depart = depart;
	}
@Override
public String getEmployee() {

	return super.getEmployee()+ " , " + depart;
			
	}
}
