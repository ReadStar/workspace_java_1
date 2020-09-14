
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
 *Taxi, Truck 클래스의 공통된 특성을 추출하여 슈퍼클래스 Car 정의
 *	=>Taxi와 Truck 클래스의 speedUp() speedDown()메서드를 
 *		슈퍼클래스인 Car 클래스에서 강제성을 부여하여
 *		서브클래스들이 반드시 구현하도록 해야함 => 추상메서드로 정의 필요
 *
 *
 *
 *
 *
 * 택시(Taxi)클래스
 * 멤버변수 : 현재속력(speed, int) 최대속력(maxSpeed, int)
 * 메서드 : 속력증가(speedUp(), 파라미터와 리턴타입 없음)
 * 				=>"Taxi 속력 증가" 출력
 * 				속력감소(speedDown()), 	파라미터와 리턴타입, 없음
 * 				=>"Taxi 속력 감소" 출력
 * 트럭(Truck)클래스
  * 멤버변수 : 현재속력(speed, int) 최대속력(maxSpeed, int)
 *  메서드 : 속력증가(speedUp(), 파라미터와 리턴타입 없음)
 * 				=>"Truck 속력 증가" 출력
 * 				속력감소(speedDown()), 	파라미터와 리턴타입, 없음
 * 				=>"Truck 속력 감소" 출력
 */

abstract class Car{
	int speed;
	int maxSpeed;
	public abstract void speedUp();
	public abstract void speedDown();
class Taxi extends Car{
	int speed;
	int maxSpeed;
	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		
	}
	
}
class Truck extends Car{
	int speed;
	int maxspeed;
	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		
	}
	
	}
}