
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 정적(Static)멤버 = 클래스 멤버
		 * -인스턴스 생성과 상관 없이 클래스가
		 * 	 메모리(메서드 영역)에 로딩될 때 함께 로딩되는 멤버
		 * -인스턴스 생성과 상관 없음
		 * 	=>인스턴스 생성 없이 클래스명만으로 접근 가능
		 * 		(클래스명.정적멤버변수명 또는 클래스명.정적메서드명())
		 * -정적 멤버변수의 경우 모든 인스턴스에서 하나의 값을 공유함
		 * 		=>공유 메모리 공간을 사용하므로 모든 인스턴스가 주소값 공유
		 * -로컬변수는 메서드 호출 및 종료와 관계있고,
		 *   인스턴스 변수는 인스턴스 생성 및 소멸과 관계있고, 
		 * 	  클래스변수는 클래스 로딩(프로그램 시작) 및
		 * 	  클래스 제거(프로그램 종료)와 관계있다.
		 */

		//StaticEx 클래스의 클래스 (정적) 변수 a는
		//클래스가 메모리에 로딩될 때 함께 로딩 되므로
		//인스턴스 생성 전에 메모리에 로딩 되며, 인스턴스 생성 없이도
		//클래스명만으로도 접근 가능한 멤버이다
		System.out.println("StaticEx.a = " + StaticEx.a);
		//인스턴스 멤버변수 b는 반드시 인스턴스를 통해서만 접근 가능
		
		//StaticEx 클래스의 인스턴스 생성
		StaticEx se = new StaticEx();
		//=>인스턴스 생성 시 Heap 영역에 인스턴스 멤버도 함께 로딩됨
		
		//변수 a의 값을 100으로 변경, b의 값을 200으로 변경 후 출력
		StaticEx.a = 100;
		se.b = 200;
		System.out.println(se.a+","+ se.b);
		System.out.println("-------------------------------------------");
		
		StaticEx se2 = new StaticEx();
		//인스턴스를 새로 생성하더라도 정적 멤버변수는
		//하나의 메모리 공간을 모든 인스턴스에서 공유하므로
		//하나의 인스턴스에서 값을 변경하면 모든 인스턴스가 변경된 값을 공유
		System.out.println("se.a="+se2.a); //변경된 100
		System.out.println("se2.b="+se2.b); //새 인스턴스 값
		
		System.out.println("-------------------------------------------------");
		
		//대표적인 Static 멤버변수의 예
		//수학관련 기능을 제공하는 Math 클래스의 멤버변수는 모두 Static
		double pi = 3.1415926535;
		System.out.println("파이값 =" + pi);
		//Math클래스에 상수 pi가 제공되며 static 멤버변수로 제공됨
		//=>별도의 인스턴스 생성 없이 클래스명만으로 접근 가능
		System.out.println("파이값 : " +Math.PI);
		
		//정수를 다루는 Integer클래스의 멤버변수는 모두 Static
		System.out.println("Int형 표현범위 최소값 : " + Integer.MIN_VALUE);
		System.out.println("Int형 표현범위 최대값 : " + Integer.MAX_VALUE);
	}

}

class StaticEx{
	static int a = 10; //클래스(static = 정적) 멤버변수 선언
	int b = 20; //
}