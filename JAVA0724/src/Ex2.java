
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 반복(loop)문
		 * - 특정 조건에 따라 문장 또는 블럭을 반복 실행하는 문
		 * - for문, while문 으로 구분됨
		 *   => for문은 주로 반복횟수가 정해져 있는 반복문에 사용되며,
		 *      while문은 주로 반복횟수가 정해져 있지 않은 반복문에 사용됨
		 * - 초기식, 조건식, 증감식, 실행문(블록)으로 구성됨
		 * 
		 * 1. for문
		 * - 초기식, 조건식, 증감식의 위치가 정해져 있는 반복문
		 *   (초심자에게 유리)
		 * - 초기식으로 제어변수를 초기화 한 후, 조건식을 통해
		 *   반복 여부를 결정한 뒤 결과가 true이면 반복할 문장을 실행하고
		 *   증감식을 통해 제어변수를 증감시킴
		 *   => 이후 조건식->실행문->증감식 순으로 반복하다 빠져나간다
		 * 
		 * < 기본 문법 >
		 * for(초기식(1); 조건식(2); 증감식(4)) {
		 * 		// 조건식 결과가 true 일 때 반복 실행할 문장들...(3)
		 * }
		 * =>초기식(1) : 반복 횟수를 제어하는 변수(=제어변수)를 초기화(선언 포함)
		 * 			  	(for문 시작 시 단 한번 수행됨)
		 * =>조건식(2) : 반복 여부 결정을 위해 조건 판별
		 * 				(조건식 결과가 true 일 때 반복, false일 때 종료)
		 * =>증감식(4) : 제어변수를 조건식에 가까워지도록 증감 수행
		 * =>조건식이 true일 동안 2->3->4->를 반복수행합
		 */
		
		System.out.println("1 Hello World");
		System.out.println("2 Hello World");
		System.out.println("3 Hello World");
		System.out.println("4 Hello World");
		System.out.println("5 Hello World");
		System.out.println("6 Hello World");
		System.out.println("7 Hello World");
		System.out.println("8 Hello World");
		System.out.println("9 Hello World");
		System.out.println("10 Hello World");
		System.out.println("===============================");
		//for문을 사용하여 hello world 문자열 출력 반복
		for(int i = 1; i<=10; ++i) {
			//조건식 판별 결과가 true일 때 실행
			System.out.println("Hello world");
		}
		/*
		 * 위의 반복문에 대한 흐름확인 ( = 디버깅, Debugging)
		 * 제어변수 i 조건식(i<=10) 		실행결과(출력) 			증감식(i++)
		 *    1				true		"1:hello,world"출력 			 1->2
		 *    2				true		"2:hello,world"출력 			 2->3
		 */
		
		System.out.println("--------------------------------------------");
		//제어변수 i가 1~ 10 까지 1씩 증가하면서 출력
		for(int i = 1; i<=10; ++i) {
			System.out.print(i +" "); //println에서 ln을 지우면 가로로 출력
}
		System.out.println(); //줄바꿈
		
		System.out.println("-----------------------------");
		
		//제어변수 i가 1~ 10까지 2씩 증가하면서 i값 출력
		//=>13569
		for(int i = 1; i<=10; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		//제어변수 i가 2~10까지 2씩 증가하면서 i값 출력
		for(int i = 2; i<=10; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		//제어변수 i가 10 ~ 1까지 1씩 감소하면서 i값 출력
		for(int i = 10; i>=1; i-=1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
}