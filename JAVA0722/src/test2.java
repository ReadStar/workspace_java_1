
public class test2 {

	public static void main(String[] args) {
		//if ~ else 연습
		//1. 정수형 변수 visitCount 가 0일 때 "Hellow world" 출력
		//	아니면 "첫방문이 아니시군요" 출력
		//정수형 변수 visitCount 선언 0으로 초기화
		//if문 이용하여 변수가 0인지 판별
		//=>조건식이 true이면 HelloWorld
		//if문 종료 후 JavaProgramming
				
	int visitCount = 0;
	if (visitCount <= 0) {
		System.out.println("Hello World");
	}else {
		System.out.println("첫 방문이 아니시군요");
	}
	System.out.println("Java Programming");
	
	//int형 변수 num이 양수이면 "양수"
	//아니면 "양수 아님"을 출력
	
	int num = 1;
			if (num > 0) {
				System.out.println("양수");
			} else {
				System.out.println("양수 아님");
			}
	
			
	//int형 변수  num이 홀수이면 "홀수" 출력
	//아니면 "홀수아님"을 출력
	int num2 = 4;
	if (num2 % 2 == 1) {
		System.out.println("홀수");
	} else {
		System.out.println("홀수 아님");
	}
	
	
	
	//문자 ch가 소문자 일때, 대문자로 변환하고 출력
	//소문자가 아닐때 소문자 아님 출력
	
	char ch = 'A';
			if (ch >= 'a' && ch <= 'z') {
				System.out.println(ch + "대문자로 변환");
				ch = (char) (ch - 32);
			System.out.println(("ch = " + ch));}
			else {System.out.println("소문자 아님");
			
			}
	}

}
