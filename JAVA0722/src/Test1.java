
public class Test1 {

	public static void main(String[] args) {
		//단일 if문 연습
		//1. 정수형 변수 visitCount 가 0일 때 "Hellow world" 출력
		//visitCount와 상관 없이 "Java Programming"을 출력하는 if문
		//정수형 변수 visitCount 선언 0으로 초기화
		//if문 이용하여 변수가 0인지 판별
		//=>조건식이 true이면 HelloWorld
		//if문 종료 후 JavaProgramming
		
		int visitCount = 0;
		if (visitCount  == 0) {
			System.out.println("Hello World");
			
			
			
		}
			System.out.println("JavaProgramming");
		System.out.println("---------------------");
		
		//정수형 변수 num이 음수일 때 양수로 변환한 절대값을 출력
		//=>단, 양수일 땐 변환없이 그대로 출력
		int num = -5;
		if (num > 0) {
			System.out.println(num);
		}
		if (num < 0) {
			System.out.println(num - (num*2));
		
		}
		System.out.println("-------------------------------");
		
		//문자 ch가 소문자일 때, 대문자로 변환하여 출력
		//대문자일 때는 그대로 출력
		char ch ='z';
//		소문자 -> 대문자 변환 시 -32 수행 A65 a97
		if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + "대문자로 변환");
			ch = (char) (ch - 32);
		}
		System.out.println(("ch = " + ch));
			
	}

}
