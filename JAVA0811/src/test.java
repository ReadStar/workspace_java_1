
public class test {

	public static void main(String[] args) {
			//메서드 정의 및 호출 연습
			
			//1. 매개변수도 없고, 리턴값도 없는 메서드
			// =>Hello, world" 문자열을 10번 반복 출력하는 hello()메서드
			hello();
			gugudan();
	}
	//1. 매개변수도 없고, 리턴값도 없는 메서드
	// =>Hello, world" 문자열을 10번 반복 출력하는 hello()메서드의 정의
//			=>리턴값이 없으므로 리턴타입에 void를 명시
	//		=>매개변수가 없으므로 소괄호() 부분을 비워둠
	public static void hello() {
		//메서드가 호출되면 "Hello,World" 문자열을 10번 반복 출력
		for (int i = 1; i <=10; i++) {
			System.out.println(i + "Hello, World");
		}
	}
	//구구단 2단 ~ 9단까지 차례대로 출력하는 gugudan 메서드 정의
	public static void gugudan(){
		for (int i = 2; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + "*" + j +"=" +(i*j));
				}
		}
	}
		}
