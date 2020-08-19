
public class Ex {

	public static void main(String[] args) {
		/*
		 * 메서드 오버로딩 (매개변수 갯수 또는 순서가 다른 메서드)
		 * -매개변수의 타입이 같더라도 갯수가 다르면 오버로딩이 성립됨
		 * 		=>단, 타입이 같은 매개변수간의 순서 변경은 오버로딩이 아님
		 * 
		 * 
		 */
		OverloadingMethod om = new OverloadingMethod();
		om.print(10,  20);
		om.print(10, 20, 30);
//		om.print(10,  20, 30, 40);  //오류
		om.print2(2, "홍길동", "이순신", "강감찬");
		om.print2(3, "뫄뫄", "솨솨", "롸롸", "와와");
		
		//정수1개, 실수1개를 전달받아 덧셈결과를 출력하는 sum()메서드
		om.sum(1, 3.14);
		om.sum(3.14, 1);
	}

}

class OverloadingMethod{
	//정수 2개를 전달받는 print() 메서드 정의
	public void print(int n1, int n2) {
		System.out.println(n1 + "," + n2);
	}
	//정수 3개를 전달받는 print() 메서드 정의
	public void print(int n1, int n2, int n3) {
		System.out.println(n1 + "," + n2 + "," + n3);
	}
	//정수 1개(count)와 문자열(name) 2~4개 까지 전달받는 pint2()메서드 정의
	public void print2(int count, String name, String name2, String name3) {
		System.out.println(count + "," + name + "," + name2 + "," + name3);
	}
	public void print2(int count, String name, String name2, String name3, String name4) {
		System.out.println(count + "," + name + "," + name2 + "," + name3 + "," +name4);
	}
	public void sum(int num, double num2) {
		System.out.println(num + num2);
	}
	public void sum(double num1, int num2) {
		System.out.println((num1 + num2));
	}
	public void sum(int num1, int num2) {
	
	}
//	public void sum(int num2, int num1) {
		//순서만 바꿔서는 오버로딩 될 수 없다
//	}
}
