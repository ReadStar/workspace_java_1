 
public class Ex {
 
	public static void main(String[] args) {
		/*
		 * 기본데이터타입 vs 참조데이터타입의 복사
		 * - 두 종류의 데이터타입에 대한 값을 전달할 경우
		 *   해당 값을 복사하여 전달
		 * - 기본데이터타입은 실제값의 복사가 일어남
		 * 		=> 전달받은(복사된) 데이터(복사된 실제값)를 변경하더라도
		 *  	      원본 데이터에는 아무런 영향이 없다
		 * - 참조데이터타입은 주소값의 복사가 일어남
		 * 		=>전달받은 데이터(복사된 주소값)의 데이터(실제값)을 변경하면
		 * 			원본 데이터도 동일한 주소값을 참조하므로
		 *   		변경된 내용이 동일하게 적용되어 있다
		 *   		(즉, 동일한 위치의 주소를 공유하므로 변경 사항 공유)
		 *   
		 * 
		 * 
		 */
		int money = 100000; // 로컬변수이면서 기본형 변수
		System.out.println("변경 전 money = " + money);
		// primitiveChange() 메서드를 호출하여 int형 변수 money 의 값 전달
		primitiveChange(money); // 실제 값(100000)을 복사하여 전달
		// 메서드에서 전달받은 실제값을 변경하더라도
		// 원본 데이터는 아무런 영향을 받지 않는다!
		System.out.println("변경 후 money = " + money);
		System.out.println("===========================");
		// MyMoney 클래스의 인스턴스 생성
		MyMoney mm = new MyMoney();
		System.out.println("변경 전 mm.money = " + mm.money);
		// => 멤버변수이자 기본형 변수인 money 에 접근
		// primitiveChange() 메서드를 호출하여 MyMoney 인스턴스의
		// 인스턴스 변수인 기본데이터타입 money 를 파라미터로 전달
//		System.out.println("MyMoney 인스턴스의 money = " + mm.money);
		primitiveChange(mm.money); //실제값 복사
		// => MyMoney 인스턴스 mm 의 기본데이터타입 money 변수값 전달
		// => 멤버변수이자 기본형 변수인 money 의 값을 복사하여 전달
		
		//메서드에 전달하는 변수가 인스턴스 내의 변수라 하더라도
		//기본 데이터타입일 경우 값을 복사하여 전달함
		//따라서, 실제 값을 복사하여 전달받은 메서드에서 값을 변경하더라도
		//원본 데이터는 아무런 영향을 받지 않는다
		System.out.println("변경 후 mm.money = " + mm.money);
		System.out.println("---------------------------------------");
		MyMoney mm2 = new MyMoney();
		System.out.println("변경 전 mm2.money = " + mm2.money);
		//referenceChange()메서드를 호출하여
		//MyMoney 인스턴스의 주소값(mm2)을 파라미터로 전달
		referenceChange(mm2); //주소값을 복사하여 전달
		//참조변수가 가진 주소값을 복사하여 메서드에 전달한 뒤
		//메서드 내에서 해당 참조변수에 접근하여 인스턴스 변수값을 변경하면
		//원본 데이터가 있는 곳의 값을 변경하게 되므로
		//원본 데이터도 영향을 받는다
		//=>즉, 원본 데이터와 전달받은 값이 가리키는 인스턴스가동일하므로 한 곳에서 값을 변경하면 다른 곳에서도 동일한 값을 사용하게 됨
		System.out.println("변경 후 mm2.money = " + mm2.money);
		//=>메서드 내에서 변경된 값이 그대로 적용되어 출력됨
	}
	public  static void referenceChange(MyMoney mm) {
		//외부로부터 잔달받은 데이터(주소값)에 접근하여
		//해당 인스턴스 내의 멤버변수 값(실제값)을 변경
		System.out.println("메서드 내의 변경 전 money = " + mm.money);
		mm.money -= 9999; //전달받은 주소값의 인스턴스 변수값 변경
		System.out.println("메서드 내의 변경 후 money = " + mm.money);
	}
	public static void primitiveChange(int money) {
		// 외부로부터 전달받은 데이터(실제 값)를 변경
		System.out.println("메서드 내의 변경 전 money = " + money);
		money -= 9999;
		System.out.println("메서드 내의 변경 후 money = " + money);
	}
 
}
 
class MyMoney {
	int money = 100000;
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 