
public class Ex {

	public static void main(String[] args) {
		/*
		 * 다형성(Polymorphism)
		 * -하나의 클래스 ㄴ타입으로 여러 인스턴스를 참조하는 것
		 * -업캐스팅을 의미함
		 * 		=>서브클래스에서 메서드 오버라이딩을 수행했을 때
		 *    		슈퍼클래스 타입으로 업캐스팅 후 메서드 호출 시
		 *    		오버라이딩 된 메서드가 호출되어
		 *    		코드는 동일하나 실행 결과가 달라지게 됨
		 * -다형성을 통해 코드의 통일성을 향상시킬 수 있으나
		 * 	 해당 인스턴스의 상세 속성에 접근하려면
		 *   다운캐스팅을 통해 서브클래스 타입으로 변환한 뒤 접근 가능함
		 * 업캐스팅 시 오버라이딩 메서드
		 *  -동적 바인딩 : 코드상의 실행할 메서드와 같이 컴파일 후
		 *  					  실행 시점에서 실행되는 메서드가 달라지는
		 *  -서브클래스에 오버라이딩 된 메서드가 존재할 경우
		 *    업캐스팅 후에도 오버라이딩 된 메서드가 호출됨
		 *    =>즉, 메서드 호출 시 참조 타입이 누군지는 중요하지 않고
		 *    	   실제 인스턴스가 누군지가 중요하다
		 *  
		 */
			System.out.println("---------------Truck--------------------------");
			//Truck 인스턴스 생성 및 접근 가능한 멤버 호출
			Truck Truck = new Truck() ;
			Truck.dump();
			Truck.speedUp();
			Truck.speedDown();
			
			System.out.println("---------------------------Taxi---------------------");
			//Taxi 인스턴스 생성 및 접근 가능한 멤버 호출
			Taxi Taxi = new Taxi();
			Taxi.lift();
			Taxi.drop();
			Taxi.speedUp();
			Taxi.speedDown();
			
			System.out.println("--------------------------------------------------");
			
			System.out.println("Truck->Car 업캐스팅");
			//Truck ->Car 업캐스팅 및 접근 가능한 메서드 호출
			Car car = Truck;
			//Truck 클래스에서 speedUp, speedDowun 메서드를 오버라이딩
			//=>따라서 업캐스팅 후에도 오버라이딩 된 Truck 의 메서드 호출됨
			
			car.speedUp();
			car.speedDown();
			//car.dump(); //참조 영역 축소로 상속 멤버 외에 접근 불가
			
			System.out.println("------Car -> Truck 다운캐스팅 -------------");
			//업캐스팅 된 Car 타입을 다시 Truck 타입으로 다운캐스팅
			
			Truck = (Truck)car; //다운캐스팅
			//Car 클래스로부터 상속받은 메서드
			Truck.speedUp();
			Truck.speedDown();
			//Truck 클래스에서 정의한 메서드
			Truck.dump();
			
			System.out.println("----------------------taxi ->car 업캐스팅 -------------------");
			//taxi -> Car 업캐스팅 및 접근가능한 메서드 호출
			car = Taxi;
			//Taxi 클래스에서 speedUp, speedDowun 메서드를 오버라이딩
			//=>따라서 업캐스팅 후에도 오버라이딩 된 taxi 의 메서드 호출됨
			car.speedUp();
			car.speedDown();
			//참조영역 축소로 상속 멤버 외에 접근 불가
			//car.lift()
			//car.drop()
			
			System.out.println("--------Car -> Taxi 다운캐스팅------------------------");
			Taxi = (Taxi)car;
			Taxi.speedUp();
			Taxi.speedDown();
			
			Taxi.lift();
			Taxi.drop();
	}

}

class Car{
	public void speedUp() {
		System.out.println("Car 속력 증가");
	}
	public void speedDown() {
		System.out.println("Car 속력 감소");
	}
}

class Truck extends Car{
	@Override
	public void speedUp() {
		System.out.println("Truck 속력 증가");
	}

	@Override
	public void speedDown() {
		System.out.println("Truck 속력 감소");
	}

	public void dump() {
		System.out.println("Truck 짐 싣기");
	}
}

class Taxi extends Car{
	@Override
	public void speedUp() {
		System.out.println("Taxi 속력 증가");
	}
	@Override
	public void speedDown() {
		System.out.println("Taxi 속력 감소");
	}
	public void lift() {
		System.out.println("taxi 승객 승차");
	}
	public void drop() {
		System.out.println("taxi 승객 하차");
	}
}

/*
* Car 클래스 정의
* -메서드 정의 : 파라미터 없음, 리턴값 없음
* 1)speedUp() : Car 속력 증가 출력
* 2)speedDown() : Car 속력 감소 출력
* 
*  Truck 클래스 정의 - Car 클래스 상속
*  -메서드 정의 : 파라미터 없음, 리턴값 없음
*  1)dump() : Truck 심 싣기
*  
*  Taxi 클래스 정의 - Car 클래스 상속
*  -메서드 정의 : 파라미터 없음, 리턴값 없음
*  1)lift() : taxi 승객 승차
*  2)drop() : taxi 승객 하차
*/
