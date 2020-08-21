
public class Ex {

	public static void main(String[] args) {
		/*
		 * 생성자 (Constructor)
		 * - 객체를 생성할 때 new 연산자 뒤에 붙어서 호출되며,
		 * 	  객체 초기화를 담당하는 메서드 형태의 일종
		 * - 메서드와 다른 점
		 * 	1)생성자의 이름은 반드시 클래스명과 동일해야 한다
		 * 	2)리턴타입을 기술하지 않는다(	void도 사용하지 않음)
		 * - 클래스 정의 시 생성자를 하나도 정의하지 않을 경우
		 * 	  컴파일러에 의해 기본 생성자(Default Constructor)가
		 * 	  자동으로 생성됨(Public 클래스명(){})
		 * 		=>매개변수가 없고, 중괄호 블록 내에 코드가 없는 빈 생성자
		 * <생성자 정의 기본 문법>
		 * [접근제한자] 클래스명([매개변수...]){
		 * 		생성자 호출(객체 생성)시 수행할 코드들
		 * }
		 */
		
		
		//Person 클래스 인스턴스 생성
		Person p = new Person();
		//이름 : "홍길동" 나이 : 20 으로 초기화
		p.name ="홍길동";
		p.age=20;
		System.out.println(p.name + p.age);
		
		DefaultPerson dp = new DefaultPerson();
		//new DefaultPerson()코드에 의해 객체 생성 시점에서
		//DefaultPerson()생성자가 호출됨
		dp.name ="홍길동";
		dp.age=20;
		System.out.println(dp.name + dp.age);
		
		
		System.out.println("----------------------------------");
		//파라미터 2개 (String, int)를 전달받는 생성자 ParameterPerson()호출
		ParameterPerson pp = new ParameterPerson("홍길동", 20);
		System.out.println(pp.name + pp.age);
		
		//파라미터 생성자가 1개 존재하는 클래스의 기본 생성자를 호출하면
		//자동으로 생성되지 않기 때문에 컴파일 에러가 발생한다
//		ParameterPerson pp2 = new ParameterPerson("홍길동", 20);
	}
		

}
/*
*	Person 클래스 정의
*	멤버변수 : 이름(name, String) 나이 (age, Int)
*/
class Person{
	//생성자가 하나도 정의되지 않은 클래스는 컴파일러에 의해
	//기본 생성자가 자동으로 생성됨

	//Public Person(){} =>컴파일러에 의해 생성될 기본 생성자
	String name;
	int age;
}

//파라미터가 없는 생성자 정의
class DefaultPerson{
	String name;
	int age;
	// 매개변수가 없는 기본 생성자와 동일한 형태의 생성자를 정의
	//=>출력문을 사용하여 메세지 출력
	public DefaultPerson() {
		//DefaultPerson클래스의 인스턴스가 호출될 떄
		//생성자가 호출되며, 내부의 코드가 실행됨
			System.out.println("DefaultPerson() 생성자 호출됨");	
			//생성자에서는 주로 멤버변수의 초기화나 다른 메서드의 호출을 통해
			//객레가 실행될 때 주생할 초기 작업을 수행하는 내용이 기술됨
	}
	
}

//파라미터가 1개 이상인 파라미터 생성자 정의
class ParameterPerson{
	String name;
	int age;
	//일반 메서드와 동일하게 생성자에 전달할 데이터가 있을 경우
	//생성자 정의 시 파라미터 부분에 매개변수를 선언할 수 있다
	//이름, 나이를 전달받는 파라미터 생성자 정의
	//=>"ParameterPErson(String, int) 생성자 호출 됨" 출력 후
	//		이름과 나이를 멤버변수에 저장
	public ParameterPerson(String newName, int newAge) {
		System.out.println("ParameterPerson(String, int) 호출됨");
		//생성자 호출 시 전달받는 데이터를 사용하여 멤버변수 초기화
		 name = newName;
		 age = newAge;
	}
	//파라미터 생성자를 하나라도 정의하게 되면
	//기본 생성자는 더 이상 자동으로 생성되지 않는다
}