
public class Ex2 {

	public static void main(String[] args) {
		//인터페이스 간의 상속과 클래스, 인터페이스의 동시 상속
		고래상어 고래상어 = new 고래상어();
		고래상어.번식();
	}

}



//2개의 부모인터페이스를 정의하고 하나의 인터페이스에서 모두 상속
interface ParentInterface1{
	public abstract void parentMethod1();
	
}

interface ParentInterface2{
	public abstract void parentMethod2();
	
}
//ChildInterface adlsxjvpdltm wjddml - ParentInterface1, ParentInterface2 상속
//주의1. 인터페이스 간의 상속은 extends 키워드 사용
//주의2. 부모인터페이스를 상속받은 자식인터페이스에서 추상메서드 구현 없음
//			 =>인터페이스 내에는 무조건 추상메서드만 존재해야하므로
interface ChildInterface extends ParentInterface1, ParentInterface2{
	//2개의 부모인터페이스를 상속받으면 부모인터페이스의 추상메서드와 자신의 추상메서드를 모두 갖게됨
	//즉, parentMethod1(), parentMethod2()추상 메서드와
	public abstract void childMethod3(); //자신의 추상메서드를 갖는
}

//SubClass2 클래스 정의 = ChildInterface 인터페이스 구현
class SubClass2 implements ChildInterface{

	@Override
	public void parentMethod1() {
		System.out.println("서브클래스에서 구현한 parentMethod1()");
	}

	@Override
	public void parentMethod2() {
		System.out.println("서브클래스에서 구현한 parentMethod2()");
	}

	@Override
	public void childMethod3() {
		System.out.println("서브클래스에서 구현한 childMethod3()");
	}
	
}
//-----------------------------------------------------------------------------------------
class ParentClass{
	public void nomalMethod() {
		System.out.println("ParentClass의 normalMethod()");
	}
}

//하나의 서브클래스는 하나의 슈퍼클래스와 1개 이상의 인터페이스를
//부모로 가질 수 있다.
//=>주의. extends와 implements 동시 사용 시 extends를 먼저 선언해야 함
class SubClass3 extends ParentClass implements ChildInterface{

	@Override
	public void parentMethod1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parentMethod2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void childMethod3() {
		// TODO Auto-generated method stub
		
	}
	
}


//------------------------------------------------------------------------

//abstract class 동물{
//	public abstract void 번식();
//}
//
//class 고래 extends 동물{
//
//	@Override
//	public void 번식() {
//		System.out.println("새끼를 낳아 번식");
//	}
//}
////번식 메서드 포함
//
//class 상어 extends 동물{
//
//	@Override
//	public void 번식() {
//		System.out.println("알을 낳아 번식");
//	}
	
 //번식 메서드 포함
//만약, 클래스간의 다중 상속이 가능했다면 발생할 수 있는 문제
//class 고래상어 extends 고래, 상어{//실제로는 불가능하므로 오류 발생
	//만약 고래상어 클래스 내에서 번식()메서드를 호출하면
	//고래의 번식인가? 상어의 번식인가?
	//=>다이아몬드 상속 관계에서의 문제(이슈)
	//    하나의 부모로부터 두 자식이 상속을 받고
	//	   다시 하나의 손자가 두 자식으로부터 상속을 받을 경우
	//	   부모로부터 상속된 메서드를 두 자식이 구현하고
	//	   손자가 해당 메서드에 접근하려 할 때 두 자식 중 누구의 메서드인지 구분 할 수 없게 된다
	//		=>따라서. 자바에서 클래스간의 다중 상속은 불가능
//	public void 번식() {
//		super.번식();//고래. 번식? 상어.번식? = 구별 불가능
//	}}

//인터페이스는 다중 상속이 가능한 이유
interface 동물{
	public abstract void 번식();
}
interface 고래 extends 동물{}
interface 상어 extends 동물{}

class 고래상어 implements 고래, 상어{
	//하나의 부모인터페이스로부터 두 자식인터페이스가 상속을 받고
	//다시 하나의 손자클래스가 두 자식터페이스로부터 상속을 받을 경우
	@Override
	public void 번식() {
		//고래.번식, 상어.번식 구분할 필요가 없다
		//동일한 추상메서드이므로 구분 필요없이 바디{}만 구현하면 된다
		System.out.println("알을 낳아 번식");
	}
}