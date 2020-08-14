
public class test2 {

	public static void main(String[] args) {
				Car car = new Car();
				car.carName = "carrear911T";
				car.companyName = "porsche";
				car.cc = 2981;
				car.maxSpeed = 200;
				car.speed = 50;
				System.out.println("차종 :" + car.carName);
				System.out.println("제조사 : " + car.companyName);
				System.out.println("배기량 : " + car.cc);
				System.out.println("현재 속력 : " + car.speed + "Kh/hm, 최대속력 : " + car.maxSpeed);
				car.speedUp(100);
				car.speedDown(90);
				car.speedDown(70);
				
	}

}

/*
* 자동차(Car) 클래스 정의
* -자동차 차종(carName, 문자열)
* -자동자 브랜드(companyName, 문자열)
* -자동차 배기량(cc, 정수)
* -최대속력(maxSpeed, int => 200으로 미리 설정), 현재속력(speed, 정수)
* 
* 
* 
* 
* 메서드
* 1) 속력 증가 speedUp()
* 		-증가시킬 속력(s)을 전달받아 현재속력(speed)에 누적 후
* 			"현재 속력 : xxx km/h" 출력
* 			단, 현재 속력이 최대속력(maxSpeed)보다 클 경우
* 			현재 속력을 최대 속력으로 변경 후 "최대 속력 도달" 출력
* 		-매개변수 1개(증가시킬 속력 s) 리턴값 없음
* 2) 속력 감소 speedDown()
* 		-감소시킬 속력(s)을 전달받아 현재속력(speed)에서 차감한 후
* 			"현재속력: xxx km/h" 출력
* 			단, 현재속력이 0보다 작을 경우 현재 속력을 0으로 변경 후
* 			"차량 정지" 출력
* 		-매개변수 1개
*/
class Car{
	String carName;
	String companyName;
	int cc;
	int maxSpeed = 200;
	int speed;
	
	public void speedUp(int s) {
		speed += s;
		if (speed >= maxSpeed) {
			System.out.println("최대 속력 도달! 현재 속력 : " + speed+ "Km/h");
		}else {
			System.out.println("현재 속력 : " + speed + "Km/h");
		}
	}
	
	public void speedDown(int s) {
		speed -= s;
		if (speed <=0) {
			speed = 0;
			System.out.println("차량 정지, 현재 속력 : " + speed + "Km/h");
		}else {
			System.out.println("현재 속력 : " + speed + "Km/h");
		}
	}
}