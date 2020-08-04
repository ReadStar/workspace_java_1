
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * if ~ else if ~ else 문(다중 if ~ else 문 또는 if ~ else if 문)
		 * - 두 가지 이상의 조건식을 차례대로 판별하면서
		 *   세 가지 이상의 경우를 판별하는 조건문
		 * 
		 * < 기본 문법 >
		 * if(조건식1) {
		 * 		// 조건식1 의 결과가 true 일 때 실행할 문장들...
		 * 		문장1;
		 * } else if(조건식2) {
		 * 		// 조건식1 의 결과가 false 이고, 조건식2 의 결과가 true 일 때 실행할 문장들...
		 * 		문장2;
		 * } else if(조건식n) {
		 * 		// 조건식 1, 2 의 결과가 false 이고, 조건식n 의 결과가 true 일 때 실행할 문장들...
		 * 		문장n;
		 * } else {
		 * 		// 모든 조건식의 결과가 false 일 때 실행할 문장들... (생략 가능)
		 * 		문장x;
		 * }
		 */
		//정수 num이 5보다 크면 "num은 5보다 크다" 출력
		//정수 num이 5보다 작으면 "num은 5보다 작다"출력
		//만약, 둘 다 아닐 경우 "num은 5와 같다" 출력
		int num = 5;
		if (num > 5) {
			System.out.println("num은 5보다 크다");
			} 
		else if (num < 5)
			{System.out.println("num은 5보다 작다");
			}
		else {
			System.out.println("num은 5와 같다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
