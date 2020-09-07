
public class test2 {

	public static void main(String[] args) {
		//업캐스팅 연습
		//서브클래스 타입 인스턴스 생성
		SmartPhone 내폰 = new SmartPhone();
		//서브클래스 타입으로 접근 가능한 메서드 : 4개
		내폰.call(); //상속받은 메서드
		내폰.sms(); //상속받은 메서드
		내폰.kakaoTalk(); //서브클래스에서 직접 정의한 메서드
		내폰.youTube(); //서브클래스에서 직접 정의한 메서드
		
		//슈퍼클래스 타입 변수 선언 및 서브클래스의 인스턴스 전달
		HandPhone 엄마폰 = 내폰; //서브클래스타입 -> 슈퍼클래승타입(업캐스팅)
		//참조변수 sp가 가진 데이터(주소값)를 전달
		
		//슈퍼클래스 타입으로 접근 가능한 메서드 : 
	
		엄마폰.call(); //상속받은 메서드
		엄마폰.sms(); //상속받은 메서드
		//업캐스팅 시 참조 가능한 영역의 축소가 일어나므로
		//슈퍼클래스 타입으로 접근 가능한 메서드 갯수가 줄어들게 됨
		//=>즉, 슈퍼클래스 내의 멤버와 동일한 멤버에만 접근 가능하게 됨
//		엄마폰.kakaoTalk(); //서브클래스에서 직접 정의한 메서드 호출불가
//		엄마폰.youTube(); //서브클래스에서 직접 정의한 메서드 호출불가
		
		//또 다른 서브클래스 타입 인스턴스 생성
		SmartPhone 동생폰 = new SmartPhone();
		
		엄마폰 = 동생폰; // 서브클래스 타입 -> 슈퍼클래스타입으로 업캐스팅
		엄마폰.call(); //상속받은 메서드
		엄마폰.sms(); //상속받은 메서드
		
		System.out.println("-------------------------------------------------------------");
		//다운캐스팅 연습
		//슈퍼클래스 인스턴스 생성
		HandPhone hp2 = new HandPhone();
		//슈퍼클래스 타입으로 접근가능한 메서드 2개
		hp2.call();
		hp2.sms();
		//서브클래스 타입 변수에 슈퍼클래스 인스턴스 전달
		//=>다운캐스팅 수행
//		SmartPhone sp2 = (SmartPhone)hp2; //다운캐스팅(오류발생)
		System.out.println("-----------------------------------------------------------------");
		//다운캐스팅 연습(허용되는 경우)
		//슈퍼클래스 인스턴스 생성
		HandPhone 엄마폰3 = new SmartPhone(); //업캐스팅
		//슈퍼클래스 타입으로 호출 가능한 메서드 : 2개
		
		//서브클래스 타입으로 다운 캐스팅
		SmartPhone 내폰3 = (SmartPhone)엄마폰3;
		// 서브클래스 타입으로 호출 가능한 메서드 : 4개
		내폰3.call();
		내폰3.sms();
		내폰3.kakaoTalk();
		내폰3.youTube();
	}

}


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