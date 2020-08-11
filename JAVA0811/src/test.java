
public class test {

	public static void main(String[] args) {
			//메서드 정의 및 호출 연습
			
			//1. 매개변수도 없고, 리턴값도 없는 메서드
			// =>Hello, world" 문자열을 10번 반복 출력하는 hello()메서드
			hello();
			gugudan();
			System.out.println("============");
			
			//2. 매개변수는 없고, 리턴 값만 있는 메서드
			// 1) 1 ~10까지 정수의 합(55)를 리턴하는 total()메서드
			//		=>결과값인 정수 합이 리턴되므로 int형 변수 total에 저장
			System.out.println("1 ~10 까지 정수 합" + total());
			
			// 2) "Hello, World" 문자열을 리턴하는 hello2()메서드
			String str = hello2();
			System.out.println("리턴받은 문자열 : " + str);
			
			System.out.println("-------------------------------");
			//3. 매개변수만 있고, 리턴값은 없는 메서드
			// 1) 출력할 문자열을 전달하면, 10번 반복 출력하는 print()메서드
			print("Vindicate");
			
		 // 	2)정수  (n)을 전달하면, 1 ~ n까지의 합계를 출력하는 sum() 메서드
//					ex) n = 10 55
//							n = 100 5050
			sum(100);
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
	//2. 매개변수는 없고 리턴값만 있는 메서드
	public static int total() {
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			sum+=i;
		}
		return sum;
	}
	
	
	//2-2 매개변수는 없고 리턴값만 있는 메서드 호출
	public static String hello2() {
		return "Hello, World";
	}
	
	//3. 매개변수만 있고, 리턴값은 없는 메서드
	public static void print(String print) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i+ print);
		}
	}
	
	public static void sum(int n) {
			int sum = 0;
		for (int i = 1; i<=n; i++) {
			sum+= i;
		}
		System.out.println(sum);
	}
	
	
	
		}