
public class Ex {
	public static int a = callA();
	//=>클래스 로딩 시점에 로딩되어 callA() 메서드를 호출 #1
	public int b = callB();
	//=>인스턴스 생성 시점에 로딩되어 callB()메서드를 호출 #4

	public Ex() {//=>인스턴스 생성 시점에 로딩
		//모든 인스턴스 멤버가 로딩된 후 호출됨 #5
		/*
		 * static(클래스 멤버)와 인스턴스 멤버의 생성 시점 차이
		 * -static 멤버는 클래스 내에서 위치와 상관없이  순차적으로 로딩됨
		 * -static 멤버(main()메서드 포함)로딩이 끝난 후 main()메서드 호출됨
		 * -main()메서드 내에서 인스턴스 생성 시 인스턴스 멤버가 로딩
		 * -인스턴스 멤버 로딩이 끝난 후 생성자 호출됨
		 */
		System.out.println("Ex클래스의 인스턴스 생성");
	}
	
	public static int callA() {//클래스 로딩시점에 로딩
		System.out.println("static 변수 a가 로딩");
		return 0;
	}
	public int callB() {//=>인승턴스 생성 시점에 로딩
		System.out.println("static 변수 b가 로딩");
		return 0;
	}
	
	public static void main(String[] args) {//=>클래스 로딩 시점에 로딩
		//=>단, 로딩시점에 호출되지는 않는다
		//=>모든 static 멤버의 로딩이 끝난 후 자동으로 main() 메서드 호출
		/*
		 * static 멤버와 인스턴스 멤버의 메모리 로딩 시점
		 * 
		 */
		
		System.out.println("main() 메서드 호출"); //#3
		Ex ex = new Ex();
		
	}
	public static int c = callC();
	//=>클래스 로딩 시점에 로딩되어 callC() 메서드를 호출 #2
	public static int callC() {//클래스 로딩시점에 로딩
		System.out.println("static 변수 c가 로딩");
		return 0;
}
}
