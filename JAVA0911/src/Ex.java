import java.awt.Rectangle;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 추상클래스와 추상메서드
		 * 1. 추상메서드
		 * 		-메서드구현부(바디.{})가 없는 메서드
		 * 			=실행할 코드가 없는 메서드
		 * 		-구현부가 없기 때문에 외부로부터 호출되어도 실행할 코드가 없다
		 * 			=>따라서, 추상메서드를 포함하는 클래스는
		 * 			   	 반드시 추상클래스로 선언해야한다
		 * 		-추상메서드 정의 시 리턴타입 앞에 abstract 키워드를 붙임
		 * 		<추상메서드 정의 기본 문법>
		 * 			[접근제한자] abstract 리턴타입 메서드명 ([매개변수..]);
		 * 
		 * 2. 추상클래스
		 * 		-인스턴스 생성이 불가능한 클래스
		 * 			=>인스턴스 생성이 가능할 경우 추상메서드 호출이 가능하므로
		 * 				 인스턴스 생성을 못하도록 막아놓은 클래스
		 * 		-상속을 통해 서브클래스에서 추상메서드를 구현하도록
		 * 		 강제하는 용도의 클래스로 주로 사용
		 * 		-추상클래스가 가질 수 있는 멤버
		 * 			=>생성자, 일반 멤버변수, 상수, 일반 메서드, "추상 메서드"
		 * 		-클래스 정의 시 class 키워드 앞에 abstract 키워드를 붙임
		 * 		-인스턴스 생성은 불가능 하지만, 참조변수 타입으로는 사용 가능
		 * 		<추상클래스 정의 기본 문법>
		 * 			abstract class 클래스명 {}
		 */
		
//		Shape s = new Shape(); //오류
		//인스턴스화가 불가능한 타입이므로 인스턴스 생성 시 오류 발생
		//참조변수로 데이터 타입으로 사용은 가능
		Shape s = new Circle();
		s.draw();
//		s = new Rectangle();
		s.draw();
	}

}
//추상클래스와 추상메서드를 사용하여 강제성을 부여하는 방법
//1. 추상메서드 draw()를 갖는 추상클래스의 Shape 정의
abstract class Shape{
//public abstract void draw	() {};; //추상메서드는 바디를 가질 수 없다
	public abstract void draw();
}
//2.추상클래스 Shape를 상속받는 서브클래스 Circle 정의
//=>추상메서드가 존재하는 경우 서브클래스에서 반드시 추상메서드를 구현(implements)해야한다
//		구현(implements)과 오버라이딩(Overriding)은 동일한 기능이지만
//		메서드 바디{}를 구현하는데 목적이 있기 때문에 다른 용어로 표현함
class Circle extends Shape{
	//draw()메서드를 상속받아 구현해야함 =>Overriding(Implements)필수
	@Override
	public void draw() {
		System.out.println("추상클래스로부터 상속받은 추상메서드 오버라이딩");
		System.out.println("원 그리기");
		
	}
//Shape 클래스를 상속받는 Rectangle 클래스 정의
	class Rectangle extends Shape{
			//추상메서드 오버라이딩에 대한 강제성으로 부여되므로
			//개발자가 실수로 빠뜨릴 위험이 없어짐
		@Override
		public void draw() {
			System.out.println("추상클래스로부터 상속받은 추상메서드 오버라이딩");
			System.out.println("사각형 그리기");
			
		}
		
	}
}


//강제성을 부여하지 않고 클래스를 정의하게 될 경우 발생하는 문제점

//class shape{
//	public void draw	() {
//		system.out.println("도형그리기");
//	
//	}
//}
//
//class circle extends shape{
//		/*
//		 * shape 클래스를 상속받는 circle클래스는 draw()메서드를 갖게 되지만
//		 * draw() 메서드를 오버라이딩 하지 않고 다른 메서드를 정의하여
//		 * 원을 그려도 부모(shape)입장에서는 강제할 방법이 없다
//		 */
//	public void circledraw() {
//		system.out.println("원그리기");
//	}
//}
//
//class rectangle extends shape{
//	/*
//	 * shape클래스를 상속받는 rectangle 클래스도 draw()메서드를 갖게 되지만
//	 *실수로 인해 draw()메서드 오버라이딩을 하지 않았더라도
//	 *부모(shape)입장에서는 강제할 방법이 없다
//	 */
//}