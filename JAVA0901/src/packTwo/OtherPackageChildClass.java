package packTwo;

import packOne.parent2;

//parent2 클래스를 상속받아 정의
//=> 다른 패키지에 위치하므로 import 문 필수
public class OtherPackageChildClass extends parent2{
	public void useMember() {
		//상속관계에 있는 부모의 인스턴스를 생성할 경우
		//상속 관계가 아닌 일반 포함관계의 클래스로 취급되므로 주의해야함
		parent2 p = new parent2();
		System.out.println(p.publicVar); //public(0)
//		System.out.println(p.protectedVar); //protected(x) 패키지가 다르고, 상속 관계가 아니므로 접근 불가
//		System.out.println(p.defaultVar); //default(x) 다른 패키지 접근 불가
//		System.out.println(p.privateVar); //rivate(x) 다른 클래스에서 접근 불가
		
		//======================================================
		//상속관계에 있는 멤버는 인스턴스 생성 없이 직접 접근 해야함
		//=>인스턴스를 생성할 경우 is-a 관계가 아닌 has-a관계로 바뀐
		System.out.println(publicVar); //public(0)
		System.out.println(protectedVar); //protected(O) 패키지가 다르지만, 상속관계이므로 접근 가능 
//		System.out.println(defaultVar); //default(x) 다른 패키지 접근 불가
//		System.out.println(privateVar); //rivate(x) 다른 클래스에서 접근 불가
	}
}
