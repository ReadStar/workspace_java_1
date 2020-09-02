package packTwo;

import packOne.parent2;

public class OtherPackageOtherClass {
	//다른 패키지이면서, 상속 관계가 아닌 클래스의 멤버에 접근
	public void useMember() {
		//parent 클래스의 인스턴스를 생성하여 멤버에 접근
		parent2 p = new parent2();
		System.out.println(p.publicVar); //public(0)
//		System.out.println(p.protectedVar); //protected(x) 패키지가 다르고, 상속 관계가 아니므로 접근 불가
//		System.out.println(p.defaultVar); //default(x) 다른 패키지 접근 불가
//		System.out.println(p.privateVar); //rivate(x) 다른 클래스에서 접근 불가
	}
}
