
public class Ex {

	public static void main(String[] args) {
		/*
		 * 클래스의 메서드(Method)
		 * -클래스 내에서 객체의 동작을 정의하는 것
		 * -기본적으로 메서드 호출되어야만 사용 가능
		 * 		=>호출하는 메서드 : Caller, 호출당하는 메서드 : Worker
		 * -주로, 인스턴스 변수의 데이터를 저장하거나, 꺼내서 사용하는 목적
		 * -클래스 내의 메서드 구현부에서 클래스의 인스턴스 변수를 사용하면
		 * 	 인스턴스마다 변수 내의 데이터는 달라지지만
		 * 	 메서드는 동일하므로 코드는 같고. 사용하는 데이터가 달라짐
		 * 
		 * 	<메서드 정의 기본 문법>
		 * [제한자] 리턴타입 메서드명([매개변수선언...]){
		 * }
		 */
		
		
		//Animal 클래스의 인스턴스(a1) 생성 및 데이터 저장 후 출력
		//ex)이름 : 멍멍이, 나이 : 2
		//ex2)이름 : 야옹이, 나이 : 3
		Animal s1 = new Animal();
		s1.name = "멍멍이";
		s1.age = 2;
//		System.out.println("이름 : " + s1.name);
//		System.out.println("나이 : " + s1.age);
		s1.print();
		s1.cry();
		Animal s2 = new Animal();
		s2.name = "야옹이";
		s2.age = 3;
//		System.out.println("이름 : " + s2.name);
//		System.out.println("나이 : " + s2.age);
		s2.print();
		s2.cry();

	}

}
// 동물(Animal)클래스 정의
// 멤버변수 : 이름(name), 나이(age)
class Animal{
	//멤버변수 선언
	String name;
	int age;
	
	// "동물 울음 소리" 를 출력하는 메서드 	cry()정의
	// => 매개변수도 없고, 리턴값도 없는 메서드
	public void cry() {
		System.out.println("동물 울음 소리");
	}
	// 인스턴스변수 name과 age의 데이터를 출력하는 메서드 print()정의
	public void print() {
		System.out.println("이름 : "+ name + ",나이 : " + age);
	}
}
