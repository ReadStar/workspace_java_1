
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 정적(static)메서드
		 * -메모리 로딩 시점은 정적 멤버변수와 동일함
		 * -호출방법도 정적 멤버변수와 동일함
		 * -메서드 정의 시 리턴타입 앞에 static 키워드를 붙여서 정의
		 * -Staic메서드 내에서는 레퍼런스 this 사용 불가
		 * 		=>레퍼런스 this에 저장되는 인스턴스 주소는
				인스턴스가 생성되는 시점에서 만들어지므로
				static멤버가 로딩되는 시점에서는 접근 불가능 하다
		 */
		//인스턴스 생성 전 클래스명을 사용하여 멤버메서드 호출
//		StaticEx2.nomrlMethod(); //인스턴스 멤버 메서드는 호출 불가능
		StaticEx2.staticMethod(); //정적 메서드 호출 가능
		
		//인스턴스 생성 후 멤버 메서드 호출
		StaticEx2 se = new StaticEx2();
		se.normalMethod();
		se.staticMethod(); //인승턴스를 통해 접근해서 메서드 호출도 가능하나
										//클래스 명으로 접근하는 것을 권장함
		
		System.out.println("-------------------------------------------");
		//static 멤버도 private 접근 제한자 사용 시 외부클래스에서 접근 불가
//		System.out.println("StaticEx3.a=" + StaticEx3.a);
		//따라서, Getter/Setter를 사용하여 static 멤버에 접근해야함
		//=>만약, 일반 메서드로 정의할 경우 클래스명만으로 접근 불가능하며
		//		인스턴스 생성을 통해서만 접근해야함
		System.out.println("StaticEx3.geA()="+ StaticEx3.getA());
	}

}
class StaticEx2{
	public void normalMethod() {
		System.out.println("일반 메서드 nomarMethod()");
	}
	public static void staticMethod() {
		System.out.println("정적 메서드 staticMethod");
	}
}
class StaticEx3{
	private static int a = 10; //클래스 로딩 시 함께 로딩됨(인스턴스 생성 전)
	private int b = 20; //인스턴스 생성 시로딩
	//-------------------------------
		public static int getA() {
			return a;
		}
		public static void setA(int a) {
			//static메서드 내에서는 레퍼런스 this 사용 불가
			//=>레퍼런스 this에 저장되는 인스턴스 주소는
			//		인스턴스가 생성되는 시점에서 만들어지므로
			//		static멤버가 로딩되는 시점에서는 접근 불가능 하다
//			this.a = a; //오류발생
//			super. 
			//레퍼런스 this대신 클래스명을 통해 접근하면 된다
			StaticEx3.a = a;
		}
		public static void print() {
			//static메서드 내에서는 인스턴스 멤버변수 사용 불가
			//=> 클래스 로딩(static 멤버) 시점에서는
			//		인슨턴스 멤버는 생성되기 전이기 때문(this 와 이유가 동일)
			System.out.println("a = " + a);
//			System.out.println("b = " + b); //오류. 접근 불가
		}
	//-------------------------------
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

}
