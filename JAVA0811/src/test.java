
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
			
			System.out.println("-------------------------------------_");
			//4. 매개변수도 있고, 리턴값도 있는 메서드
			// 1) 정수(n)을 전달하면, 1 ~ n까지의 합계를 리턴하는 sum2()메서드 호출
			int n = 100;
			int total = sum2(n);
			System.out.println("1~ " + n + "까지의 합 : " + total); 
	
	
			//2) 정수 (n)을 전달하면, 홀수 또는 짝수 를 판별하여
			// "홀수" 또는 "짝수" 문자열을 리턴하는 num() 메서드 정의
			n = 11;
			String result = num(n);
			System.out.println(n + ":" + result);
			System.out.println("--------------------------------------------");
			
			//5. 매개변수가 2개 이상인 메서드
			//1) 정수 2개를 전달받아 두 정수 합 출력하는 add() 메서드
				
			add(10, 20);
 }		
		public static void add(int n1, int n2) {
			System.out.println(n1 + n2);
		}
	
	
	
	//------------------------------------------
	//4-2) 정수 (n)을 전달하면, 홀수 또는 짝수 를 판별하여
	// "홀수" 또는 "짝수" 문자열을 리턴하는 num() 메서드 정의
	public static String num(int n) {
		//if문 사용시 모든 조건에 따른 return문 필수
		//만약 if문과 else if문을 조합할 경우 else문이 없으면
		//if문 조건식ㅇ니 모두 아닐 때 return 문장이 없으므로 오류 발생
		//해결책 1. else if 대신 else문을 사용
		// =>if문이 false일 경우 무조건 else문에서 return문이 실행됨
		if (n %2 == 0) {
			return  "짝수";
		}else {
			return "홀수";
		}
		//해결책 2. if문 등의 실행 블록 내에서 직접 리턴 하지 않고
		//리턴할 값을 변수에 저장만 한 뒤 if문이 끝난 후 return문 실행
	}
			
			
	// 4. 매개변수도 있고, 리턴값도 있는 메서드
	//1) 정수를 전달하면, 1 ~ n 까지의 합계를 리턴하는 sum2() 메서드 정의
	 public static int sum2(int num) {
		 int sum = 0;
		 
		 for (int i = 1; i < num; i++) {
			sum +=i;
			
		}
		 return sum;
	 }
	
	
	
	
	
	//------------------------------------------------------------
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