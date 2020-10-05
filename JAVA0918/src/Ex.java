
public class Ex {

	public static void main(String[] args) {
		/*
		 * 인터페이스(Interface)
		 * -다중 구현(implements)이 가능
		 * 		=>하나의 서브클래스가 둘 이상의 부모인터페이스를 가질 수 있다.
		 *  	=>여러 부모인터페이스의 모든 추상 메서드를 오버라이딩
		 *  -인터페이스끼리도 상속이 가능
		 *   	=>인터페이스간의 상속은 implements가 아닌 extends를 사용
		 *   		 추상메서드를 구현하는 것이 목적이 아니기 때문
		 */
		SubClass sc = new SubClass();
		sc.method1();
		sc.method2();
		
		//sc는 MyInterface1 인가? true
		if (sc instanceof MyInterface1) {
		System.out.println("true");
		}else {
			System.out.println("false");
		}
		//sc는MyInterface2 인가? true
		if (sc instanceof MyInterface2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//sc => MyInterface1 타입으로 업캐스팅
		MyInterface1 mi1 = sc;
		mi1.method1(); //MyInterface1이 가진 추상메서드
		System.out.println(MyInterface1.NUM1); //MyInterface1이 가진 상수
		
		//sc => MyInterface1 타입으로 업캐스팅
				MyInterface2 mi2 = sc;
				mi1.method1(); //MyInterface1이 가진 추상메서드
				System.out.println(MyInterface2.NUM2); //MyInterface1이 가진 상수
	}

}

interface MyInterface1{
	
	public static final int NUM1 = 10; //상수
	
	public abstract void method1(); //추상메서드
}


interface MyInterface2{
	public static final int NUM2 = 20;
	
	public abstract void method2();
}
//MyInterface1, MyInterfacw2 인터페이스를 구현하는 서브클래스 SubClass 정의

class SubClass implements MyInterface1, MyInterface2{

	//부모 인터페이스로부터 상속받은 추상메서드 구현(오버라이딩)필수
	@Override
	public void method1() {
		System.out.println("SubClass에서 구현한 추상 메서드 Method1()");		
	}

	@Override
	public void method2() {
		System.out.println("SubClass에서 구현한 춘상 메서드 Method2()");
	}
	
}