
public class Exam7_7 {

	public static void main(String[] args) {
		//코드 실행 시 호출되는 생성자 순서와 실행 결과
		Child c = new Child();
		System.out.println("x = " + c.getX());
	}

}

class Parent {
	int x = 100;

	Parent() {
		this(200); //생성자 Parent(int x) 호출됨
	}

	Parent(int x) {
		//super()코드 생략되어 있음 => 생성자 Object() 호출됨
		this.x = x; //전달받은 파라미터 200을 멤버변수 x에 초기화
	}

	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {
		this(1000); //생성사 Child(int x) 호출됨
	}

	Child(int x) {
		//super()코드 생략되어 있음 => 생성자 parent 호출됨
		this.x = x; //전달받은 파라미터 1000을 멤버변수 x에 초기화
						//child 	의 x = 1000
	}
}