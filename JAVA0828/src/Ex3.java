
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 접근제한자 복습 및 추가
		 * 1.public - 모든 클래스에서 접근 가능
		 * 2.protected
		 * 3.default(package or friendly) - 같은 패키지 내의 클래스에서 접근 가능
		 * 4.private - 자신의 클래스에서만 접근 가능 (다른 클래스에서 접근 불가)
		 * 
		 */

		//같은 파일 내의 (같은 패키지) 다른 클래스 멤버에 접근
		SameFileOtherClass c1 = new SameFileOtherClass();
//		System.out.println("privateNum : " + c1.privateNum);
		System.out.println("defalutNum : " + c1.defaultNum);
		System.out.println("publicNum: " + c1.publicNum);
		
		//같은 패키지 내의 다른 클래스의 멤버에 접근
		SamePackageOtherClass c2 = new SamePackageOtherClass();
//		System.out.println("privateNum : " + c2.privateNum);
		System.out.println("defalutNum : " + c2.defaultNum);
		System.out.println("publicNum: " + c2.publicNum);
	}

}

class SameFileOtherClass{
	private int privateNum = 10;
	int defaultNum = 20;
	public int publicNum = 30;
	
	
	public void print() {
		//자신의 클래스 내에서는 모든 접근 제한자에 접근 가능
		System.out.println("privateNum : " + privateNum);
		System.out.println("defalutNum : " + defaultNum);
		System.out.println("publicNum: " + publicNum);
	}
}