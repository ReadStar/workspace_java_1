
public class Ex {

	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.nomalMethod(); //상속받은 일반메서드
		sc.abstractMethod1(); //MiddleClass
		sc.abstractMethod2(); //SubClass
		
		//추상클래스로 인스턴스 생성 불가
		// AbstractClass ac = new AbstractClass();
		//MiddleClass mc = new MiddleClass();
		MiddleClass mc = sc;
		mc.nomalMethod();
		mc.abstractMethod1();
		mc.abstractMethod2();
		
		AbstractClass ac = sc;
		ac.nomalMethod();
		ac.abstractMethod1();
		ac.abstractMethod2();
	}

}

abstract class AbstractClass{
	String var; //일반 멤버변수
	
	public AbstractClass() {}
	public void nomalMethod() {
		System.out.println("추상메서드의 일반 메서드");
	}
	//추상메서드  abstractmethod()메서드의 정의
	//=>현재 클래스를 반드시 추상클래스로 선언해야 한다
	public abstract void abstractMethod1() ;
	public abstract void abstractMethod2() ;
}
//추상클래스 AbstractClass를 상속받는 MiddleClass 정의
//=>2개의 추상메서드 중 하나의 메서드만 오버라이딩
abstract class MiddleClass extends AbstractClass{
	//모든 추상메서드를 오버라이딩 하지 않고, 일부만 구현할 경우
	//여전히 추상메서드를 포함하게 되므로 일반클래스로 정의할 수 없다
	//=>추상메서드를 모두 오버라이딩 하거나, 현재클래스를 추상클래스로 선언해야 한다
	@Override
	public void abstractMethod1() {
		System.out.println("MiddleClass에서 구현한 추상메서드 abstractMethod1()");
	}
	
}
//MiddleClass를 상속받는 SubClass 정의
//=>MiddleClass에서 구현되지 않은 abstractMethod2()메서드에 대한
//	   구현 책임이 발생함 => 반드시 오버라이딩
class SubClass extends MiddleClass{

	@Override
	public void abstractMethod2() {
		System.out.println("SubClass에서 구현한 추상메서드 abstractMethod2()");		
	}
	
}