package packOne;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 접근제한자 복습 및 추가
		 * 1. public - 모든 클래스에서 접근 가능
		 * 2. protected  - 같은 패키지 또는 다른 패키지 이면서 상속 관계의 클래스에서 접근 가능
		 * 							 =>다른 패키지면서, 상속관계가 아니면 접근 불가
		 * 3. default(package) - 같은 패키지 내의 클래스에서 접근 가능
		 * 									    =>접근제한자를 아무것도 명시하지 않으면 defalut로 선언됨
		 * 										=>패키지가 다르면 접근 불가
		 * 4. private - 자신의 클래스에서만 접근 가능 (다른 클래스에서 접근 
		 */
		
		parent2 obj = new parent2();
		System.out.println(obj.publicVar);
		System.out.println(obj.protectedVar);
		System.out.println(obj.defaultVar);
//		System.out.println(obj.privateVar);
		//=>private(x) : 다른 클래스에서 접근 불가
	}

}



class SamePackageOtherClass{
	public void useMember() {
		//parent 클래스의 인스턴스를 생성하여 멤버에 접근
		parent2 p = new parent2();
		System.out.println(p.publicVar); //public(0)
		System.out.println(p.protectedVar); //protected(0)
		System.out.println(p.defaultVar); //default(0)
//		System.out.println(p.privateVar);
	}
}