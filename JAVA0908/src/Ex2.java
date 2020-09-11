
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * instanceof 연산자
		 * -어떤 객체가 특정 클래스 타입의 인스턴스인지를 판별하는 연산자
		 * 	=>형변환 가능 여부(is-a 관계)를 판별
		 * 		ex) a is a B => a instance B
		 * -판별 결과를 boolean 타입으로 리턴
		 * 	=>boolean 타입 변수에 결과값을 저장하거나
		 * 		 if문 등의 조건식에 직접 사용하여 판별
		 * -판별 결과가 true이면 형변환이 가능한 관계라는 의미
		 * 	  업캐스팅 또는 다운캐스팅 가능한 관계 모두 true가 리턴됨
		 * <기본 문법>
		 * a instanceof B
		 * =>a : 객체(참조변수)
		 * =>B : 클래스명(인스턴스명)
		 * 
		 * 
		 */
		
		Parent2 P2 = new Parent2();
		//if문을 사용하여 Parent2 객체가 Child2 타입으로 변환 가능 여부 판별
		//=> P2 is a Child2에 대한 판별 수행
		if(P2 instanceof Child2) {
			//판별결과가 true이면 무조건 Child2 타입으로 변환 가능
			System.out.println("P2->Child2 타입으로 형변환 가능");
		}else {
			//판별결과가 true이면 어떠한 변환도 불가능
			//=>슈퍼클래스 타입 인스턴스이므로 다운캐스팅 불가
			System.out.println("P2->Child2 타입으로 형변환 불가");
		}
		
		System.out.println("------------------------");
		
		Parent2 P3 = new Child2();
		if(P3 instanceof Child2) {
			//판별결과가 true이면 무조건 Child2 타입으로 변환 가능
			//=>서브클래스를 이미 업캐스팅 해 놓은 상태이므로
			//		형변환 가능하다는 true가 리턴됨
			System.out.println("P3->Child2 타입으로 형변환 가능");
			//Child2 c = p3;//자동현변환은 불가능한 관계이므로
			Child2 c = (Child2)P3; //강제형변환
		}else {
			//판별결과가 true이면 어떠한 변환도 불가능
			//=>슈퍼클래스 타입 인스턴스
			System.out.println("P3->Child2 타입으로 형변환 불가");
		}
		
		System.out.println("----------------------------------------------------------");
		//SmartPhone 인스턴스 생성
		SmartPhone sp = new SmartPhone();
		//sp는 SmartPhone입니까?판별
		if(sp instanceof SmartPhone) {
			System.out.println("sp는 SmartPhone이다");
			SmartPhone hp = sp;
			hp.call();
			hp.sms();
			hp.kakaoTalk();
			hp.youTube();
		}
		System.out.println("-----------------------------------------------------");
		//내폰은 HandPhone 입니까? ture
		if(sp instanceof HandPhone) {
			System.out.println("sp 는 스마트폰이다");
			System.out.println("그러므로 HandPhone로 형변환이 가능하다");
			HandPhone hp = sp;
			System.out.println("내폰은 HandPhone의 모든 기능을 포함한다");
			hp.call();
			hp.sms();
		}
		System.out.println("------------------------------------");
		
		HandPhone hp2 = new HandPhone();
		//엄마폰은 SmartPhone인가? false
		if(hp2 instanceof SmartPhone) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		System.out.println("-------------------------------------------");
		
		HandPhone hp3 = new SmartPhone(); //업캐스팅
		if(hp3 instanceof SmartPhone) {
			System.out.println("true");
			System.out.println("SmartPhone로 형변환 가능");
			System.out.println("SmartPhone이므로 모든 기능 포함");
			System.out.println("SmartPhone로 형변환 후에도");
			System.out.println("정상적으로 모든 기능 사용 가능");
		}else {
			System.out.println("false");
		}
	}

}

class Parent2 {}
class Child2 extends Parent2{}

class HandPhone{
	String PhoneNumber;
	
	public void call() {
		System.out.println("전화기능");
	}
	public void sms() {
		System.out.println("문자기능");
	}
}


//SmartPhone 클래스 정의

class SmartPhone extends HandPhone{
	String osName;
	
	public void kakaoTalk() {
		System.out.println("카톡");
	}
	public void youTube() {
		System.out.println("유튜브");
	}
}