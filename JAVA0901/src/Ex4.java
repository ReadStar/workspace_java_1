
public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 메서드 오버라이딩(Method Overriding)
		 * -슈퍼클래스로부터 상속받은 메서드와 시그니쳐가 동일한 메서드를
		 *   서브 클래스에서 새롭게 재정의 하는 것
		 *-기존의 슈퍼클래스의 메서드를 수정하여 덮어쓰는 것
		 *-오버라이딩 이후에는 슈퍼클래스의 메서드는 은닉되어 보이지 않음
		 *-오버라이딩을 사용하는 이유
		 *	=>코드의 재사용성이 향상되고, 통일성이 제공됨
		 *-오버라이딩 단축키 : command + option + s 
		 *	=>자동 오버라이딩을 수행하면 @Override 어노테이션이 붙게 됨
		 *		오버라이딩 규칙을 위반하면 오류가 발생하도록 함
		 *		(ex. 오버로딩, 오타로 인한 이름 입력 오류 등)
		 *	Public > Protected > default > Private
		 *
		 *<오버라이딩 작성 규칙>
		 *1. 슈퍼클래스의 메서드 시그니쳐(이름, 파라미터, 리턴타입)가 완벽하게 동일해야 한다.
		 *2. 슈퍼클래스 메서드의 접근제한자보다 범위가 좁아질 수 없다.
		 *		(ex. 	슈퍼클래스가 public 이면 서브클래스도 public이여야함)
		 *		(ex2. 만약 protected이면 서브클래스는 protected, public 가능)
		 *3. 새로운 예외를 throws 할 수 없다
		 *
		 *
		 */

		child4 c4 = new child4();
		c4.childPrn(); //서브클래스에서 정의한 메서드
		c4.parentPrn(); //슈퍼클래스에서 정의한 메서드
		//=> 슈퍼클래스(Parent4)의 parentPrn()메서드는 보이지 않으므로
		//		접근이 불가능하게 됨(은닉됨)
		
		//-----------------------------------------------------------------------------
		
		DieselCar d = new DieselCar();
		d.speedUp();
		d.speedDown();
		d.addFuel();
		
		ElectricCar e = new ElectricCar();
		e.speedUp();
		e.speedDown();
		e.addFuel();
	}

}


class Parent4{
	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn() 메서드");
	}
}

//child4 클래스 정의 - parent4	클래스를 상속
	class child4 extends Parent4{
		public void childPrn() {
			System.out.println("서브크래스의 childPrn() 메서드");
		}
		//슈퍼클래스로부터 상속받은 parentPrn() 메서드 오버라이딩
		//=>리턴타입, 이름, 파라미터가 모두 동일해야함
		//=>접근제한자는 좁아질 수 없음
		public void parentPrn() {
			System.out.println("서브클래스에서 오버라이딩 된 parentPrn() 메서드");
		}
	}
	
	
	//--------------------------------------------------------
	
class Car{
	public void speedUp() {
		System.out.println("속력 증가");
	}
	public void speedDown() {
		System.out.println("속력 감소");
	}
	public void addFuel() {
		System.out.println("연료 공급");
	}
}

//디젤 자동차 - Car 클래스 상속
class DieselCar extends Car{
	//Car 클래스의 메서드를 오버라이딩하여 DieselCar 만의 기능을 재정의
	public void speedUp() {
		System.out.println("DieselCar 속력 증가");
	}
	public void speedDown() {
		System.out.println("DieselCar 속력 감소");
	}
	public void addFuel() {
		System.out.println("디젤연료 공급");
	}
}

//전기 자동차 - Car 클래스 상속
class ElectricCar extends Car{
//Car 클래스의 멧드 오버라이딩 하여 재정의
	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("ElectricCar 속력 증가");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("ElectricCar 속력 감소");
	}

	@Override
	public void addFuel() {
		// TODO Auto-generated method stub
		System.out.println("ElectricCar 연료 공급");
	}
	//자동 오버라이딩 단축키 :Alt + shift + s => v / cmd + opt + s

}