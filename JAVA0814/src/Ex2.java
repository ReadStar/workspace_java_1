
public class Ex2 {

	public static void main(String[] args) {
		//Calculator 인스턴스 생성
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		// plus() 메서드를 호출하여 2개의 정수 5,6 전달 후
		// 덧셈 결과를 리턴받아 result1 에 저장 후 출력
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);

		
		byte x = 10;
		byte y = 4;
		//divide() 메서드를 호출하여 2개의 정수 10, 4 전달 후 
		//나눗셈 결과를 리턴받아 result2에 저장
		double result2 = myCalc.divide(x, y); //리터럴 대신 변수 전달 가능
		System.out.println("result2: " + result2);
		myCalc.powerOff();
		myCalc.changePower();
		System.out.println("변경된 전원 상태 : " + myCalc.isPowerOn);
	}

}
class Calculator{
	//전원 on/off 상태를 저장할 변수 isPowerOn 선언=>boolean타입으로 선언
	boolean isPowerOn; //기본값 false
	
	//powerOn(), powerOff() 메서드 대신에 하나의 메서드로 전원 On/Off 관리
	
	public void changePower() {
		//현재 isPowerOn 변수값을 반전시켜 전원 on/off 실행
		isPowerOn = !isPowerOn;
	}
	void powerOn() {
		//전원을 켜기 위해 isPowerOn변수 true로 변경
		//=>단, 현재 전원이 꺼져있을때만 실행
		if (!isPowerOn) {
			System.out.println("전원이 꺼져있습니다");
			isPowerOn = true;
			System.out.println("전원킴");
		}else {
			System.out.println("전원을 켭니다");
			//전원을 켜기위해 isPowerOn = true로 변경
		}
	}
	int plus(int x, int y) {
		//전달받은 2개의 정수 x, y의 합을 result에 저장 후 리턴
		int result = x + y;
		return result;
	}
	double divide(int x, int y) {
		//전달받은 2개의 정수 x,y의 나눗셈 결과를 result에 저장 후 리턴
		//=>단, 소수점까지 계산을 위해 전달받은 정수를 double타입으로 변환
		double result = (double)x / (double)y; //	int / int = int  이므로  정수만 계산
		//두 피연산자 중 최소 하나의 피연산자는 double타입 변환 필요
		//double / int = double / double = double 이므로 소수점 계산 가능
		return result;
	}
	void powerOff() {
		System.out.println("전원 끔");
		isPowerOn = false;
	}
}